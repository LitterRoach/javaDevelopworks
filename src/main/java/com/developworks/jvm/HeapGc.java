package com.developworks.jvm;

import org.junit.Test;

/**
 * <p>Title: 堆GC</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-28 14:01</p>
 */
public class HeapGc {
    private byte[] buffer = new byte[2 * 1024*1024];
    private Object obj;

    /**
     * -XX:printGCDetails
     */
    @Test
    public void referenceCount() {
        HeapGc hg = new HeapGc ();
        HeapGc hg2 = new HeapGc ();
        hg.obj = hg2;
        hg2.obj = hg;

        hg = null;
        hg2 = null;

        System.gc ();
    }
    /**
     * [GC (Allocation Failure) [DefNew: 4416K->512K(4928K), 0.0039703 secs] 4416K->981K(15872K), 0.0040212 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     * [GC (Allocation Failure) [DefNew: 4792K->275K(4928K), 0.0030441 secs] 5262K->3301K(15872K), 0.0030716 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     * [Full GC (System.gc()) [Tenured: 3025K->3090K(10944K), 0.0043985 secs] 7482K->3090K(15872K), [Metaspace: 3242K->3242K(4480K)], 0.0044613 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * Heap
     *  def new generation   total 4992K, used 72K [0x04800000, 0x04d60000, 0x09d50000)
     *   eden space 4480K,   1% used [0x04800000, 0x048121f8, 0x04c60000)
     *   from space 512K,   0% used [0x04c60000, 0x04c60000, 0x04ce0000)
     *   to   space 512K,   0% used [0x04ce0000, 0x04ce0000, 0x04d60000)
     *  tenured generation   total 10944K, used 3090K [0x09d50000, 0x0a800000, 0x14800000)
     *    the space 10944K,  28% used [0x09d50000, 0x0a054b28, 0x0a054c00, 0x0a800000)
     *  Metaspace       used 3249K, capacity 3314K, committed 3392K, reserved 4480K
     */

    /**
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    @Test
    public void testAllocation() {
        int M = 1024* 1024;

        byte[] b1 = new byte[2 * M];
        byte[] b2 = new byte[2 * M];
        byte[] b3 = new byte[2 * M];
        byte[] b4 = new byte[4 * M];

    }
    /**
     * [GC (Allocation Failure) [DefNew: 6759K->1023K(9216K), 0.0048114 secs] 6759K->1247K(19456K), 0.0048607 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 7323K->5K(9216K), 0.0051134 secs] 7547K->7263K(19456K), 0.0051450 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
     * Heap
     *  def new generation   total 9216K, used 6307K [0x04a00000, 0x05400000, 0x05400000)
     *   eden space 8192K,  76% used [0x04a00000, 0x05027610, 0x05200000)
     *   from space 1024K,   0% used [0x05200000, 0x05201720, 0x05300000)
     *   to   space 1024K,   0% used [0x05300000, 0x05300000, 0x05400000)
     *  tenured generation   total 10240K, used 7257K [0x05400000, 0x05e00000, 0x05e00000)
     *    the space 10240K,  70% used [0x05400000, 0x05b16608, 0x05b16800, 0x05e00000)
     *  Metaspace       used 3250K, capacity 3314K, committed 3392K, reserved 4480K
     */

    /**
     * -ea -verbose:gc -Xms0M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     */
    @Test
    public void testPreturnreSizeThreshold() {
        byte[] buff = new byte[5*1024*1014];
    }
    /**
     * [GC (Allocation Failure) [DefNew: 6760K->1023K(9216K), 0.0038889 secs] 6760K->1248K(15360K), 0.0039341 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
     * Heap
     *  def new generation   total 9216K, used 3227K [0x04800000, 0x05200000, 0x05200000)
     *   eden space 8192K,  26% used [0x04800000, 0x04a26f08, 0x05000000)
     *   from space 1024K,  99% used [0x05100000, 0x051ffff8, 0x05200000)
     *   to   space 1024K,   0% used [0x05000000, 0x05000000, 0x05100000)
     *  tenured generation   total 6144K, used 5294K [0x05200000, 0x05800000, 0x05c00000)
     *    the space 6144K,  86% used [0x05200000, 0x0572bb98, 0x0572bc00, 0x05800000)
     *  Metaspace       used 3250K, capacity 3314K, committed 3392K, reserved 4480K
     */

    /**
     * 实验失败
     * -ea -XX:+UseSerialGC -Xms10M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
     */
    @Test
    public void testMaxTenuringThreshold() {
        int M = 1024 * 1024;
        byte[] b1 = new byte[M/4];
        byte[] b3 = new byte[4*M];
        byte[] b2 = new byte[4*M];
        b2 = null;
        b2 = new byte[4*M];
    }
    /**
     * [GC (Allocation Failure) [DefNew: 6756K->960K(9216K), 0.0042468 secs][Tenured: 289K->319K(320K), 0.0041535 secs] 6756K->1249K(9536K), [Metaspace: 3240K->3240K(4480K)], 0.0084903 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 7485K->960K(9216K), 0.0060322 secs][Tenured: 6626K->6687K(6688K), 0.0044543 secs] 7805K->7586K(15904K), [Metaspace: 3243K->3243K(4480K)], 0.0105645 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 5160K->5160K(9216K), 0.0000140 secs][Tenured: 6687K->7586K(10240K), 0.0062759 secs] 11847K->7586K(19456K), [Metaspace: 3243K->3243K(4480K)], 0.0063395 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * Heap
     *  def new generation   total 9216K, used 4247K [0x04a00000, 0x053f0000, 0x05400000)
     *   eden space 8256K,  51% used [0x04a00000, 0x04e25f50, 0x05210000)
     *   from space 960K,   0% used [0x05210000, 0x05210000, 0x05300000)
     *   to   space 960K,   0% used [0x05300000, 0x05300000, 0x053f0000)
     *  tenured generation   total 10240K, used 7586K [0x05400000, 0x05e00000, 0x05e00000)
     *    the space 10240K,  74% used [0x05400000, 0x05b68aa0, 0x05b68c00, 0x05e00000)
     *  Metaspace       used 3250K, capacity 3314K, committed 3392K, reserved 4480K
     */

    /**
     * -ea -XX:+UseSerialGC -Xms10M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
     */
    @Test
    public void testMaxTenuringThreshold2() {
        int M = 1024 * 1024;
        byte[] b1 = new byte[M/4];
        byte[] b4 = new byte[M/4];
        byte[] b3 = new byte[4*M + M/2];
        byte[] b2 = new byte[4*M];
        b2 = null;
        b2 = new byte[4*M];
    }
    /**
     * [GC (Allocation Failure) [DefNew: 6759K->960K(9216K), 0.0038741 secs][Tenured: 290K->320K(320K), 0.0050653 secs] 6759K->1250K(9536K), [Metaspace: 3240K->3240K(4480K)], 0.0090384 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 7999K->960K(9216K), 0.0041128 secs][Tenured: 3045K->2873K(3100K), 0.0056307 secs] 8319K->3713K(12316K), [Metaspace: 3243K->3243K(4480K)], 0.0098175 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * Heap
     *  def new generation   total 9216K, used 5254K [0x04800000, 0x051f0000, 0x05200000)
     *   eden space 8256K,  63% used [0x04800000, 0x04d21870, 0x05010000)
     *   from space 960K,   0% used [0x05010000, 0x05010000, 0x05100000)
     *   to   space 960K,   0% used [0x05100000, 0x05100000, 0x051f0000)
     *  tenured generation   total 4792K, used 2873K [0x05200000, 0x056ae000, 0x05c00000)
     *    the space 4792K,  59% used [0x05200000, 0x054ce568, 0x054ce600, 0x056ae000)
     *  Metaspace       used 3250K, capacity 3314K, committed 3392K, reserved 4480K
     */

    /**
     * 空间分配担保(实验失败)
     * -ea -XX:+PrintGCTimeStamps -XX:+UseSerialGC -Xms10M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
     */
    @Test
    public void testPromotion() {
        int M = 1024 * 1024;
        byte[] b1 = new byte[2 * M];
        byte[] b2 = new byte[2 * M];
        byte[] b3 = new byte[2 * M];
        b1 = null;
        byte[] b4 = new byte[2 * M];
        byte[] b5 = new byte[2 * M];
        byte[] b6 = new byte[2 * M];
        b4 = null;
        b5 = null;
        b6 = null;
        byte[] b7 = new byte[2 * M];
    }
    /**
     * [GC (Allocation Failure) [DefNew: 6759K->960K(9216K), 0.0031283 secs][Tenured: 291K->319K(320K), 0.0036579 secs] 6759K->1251K(9536K), [Metaspace: 3240K->3240K(4480K)], 0.0068606 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 7232K->864K(9216K), 0.0067533 secs][Tenured: 6469K->6663K(6692K), 0.0047271 secs] 7551K->7334K(15908K), [Metaspace: 3243K->3243K(4480K)], 0.0115639 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
     * [GC (Allocation Failure) [DefNew: 7132K->7132K(9216K), 0.0000140 secs][Tenured: 6663K->9377K(10240K), 0.0071441 secs] 13795K->11425K(19456K), [Metaspace: 3243K->3243K(4480K)], 0.0072131 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
     * Heap
     *  def new generation   total 9216K, used 6276K [0x04800000, 0x051f0000, 0x05200000)
     *   eden space 8256K,  76% used [0x04800000, 0x04e210c8, 0x05010000)
     *   from space 960K,   0% used [0x05010000, 0x05010000, 0x05100000)
     *   to   space 960K,   0% used [0x05100000, 0x05100000, 0x051f0000)
     *  tenured generation   total 10240K, used 9377K [0x05200000, 0x05c00000, 0x05c00000)
     *    the space 10240K,  91% used [0x05200000, 0x05b28780, 0x05b28800, 0x05c00000)
     *  Metaspace       used 3250K, capacity 3314K, committed 3392K, reserved 4480K
     */
}
