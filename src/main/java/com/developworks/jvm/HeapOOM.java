package com.developworks.jvm;

import com.google.common.collect.Lists;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.Test;

import java.util.List;

/**
 * <p>Title: Java堆溢出验证</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-28 9:34</p>
 */
public class HeapOOM {

    /**
     * -ea -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./dump
     */
    @Test
    public void testHeapOOM() {
        List<HeapOOM> list = Lists.newArrayList ();
        while (true) {
            list.add (new HeapOOM ());
        }
    }
    /**
     * Dumping heap to ./dump\java_pid5948.hprof ...
     * Heap dump file created [27460464 bytes in 0.254 secs]
     *
     * java.lang.OutOfMemoryError: Java heap space
     *
     * 	at java.util.Arrays.copyOf(Arrays.java:3210)
     * 	at java.util.Arrays.copyOf(Arrays.java:3181)
     * 	at java.util.ArrayList.grow(ArrayList.java:261)
     * 	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
     * 	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
     * 	at java.util.ArrayList.add(ArrayList.java:458)
     * 	at com.developworks.jvm.HeapOOM.testHeapOOM(HeapOOM.java:20)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     * 	at java.lang.reflect.Method.invoke(Method.java:498)
     * 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
     * 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
     * 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
     * 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
     * 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
     * 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
     * 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
     * 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
     * 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
     * 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
     * 	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
     * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     */

    /**
     * -ea -Xss128k
     */
    private int stackLen = 1;
    @Test
    public void testStackLeak() {
        try {
            stackLeak ();
        } catch (Throwable e) {
            System.out.println ("stack length: " + stackLen);
            throw e;
        }
    }
    private void stackLeak() {
        stackLen ++;
        stackLeak ();
    }
    /**
     * stack length: 2237
     *
     * java.lang.StackOverflowError
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:78)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     * 	at com.developworks.jvm.HeapOOM.stackLeak(HeapOOM.java:79)
     */

    /**
     * -ea -Xss2M
     */
    @Test
    public void stackLeakByThread() {
        while (true) {
            new Thread (){
                @Override
                public void run() {
                    while(true){
                        //停不下来
                    }
                }
            }.start ();
        }
    }
    /**
     * java.lang.OutOfMemoryError: unable to create new native thread
     *
     * 	at java.lang.Thread.start0(Native Method)
     * 	at java.lang.Thread.start(Thread.java:714)
     * 	at com.developworks.jvm.HeapOOM.stackLeakByThread(HeapOOM.java:103)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     * 	at java.lang.reflect.Method.invoke(Method.java:498)
     * 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
     * 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
     * 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
     * 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
     * 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
     * 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
     * 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
     * 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
     * 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
     * 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
     * 	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
     * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     */

    /**
     * -Xms10M
     */
    @Test
    public void testStringPool() {
        List<String> list = Lists.newArrayList ();
        int i = 0;
        while (true) {
            list.add (String.valueOf (i).intern ());
        }
    }
    /**
     * java.lang.OutOfMemoryError: Java heap space
     *
     * 	at java.util.Arrays.copyOf(Arrays.java:3210)
     * 	at java.util.Arrays.copyOf(Arrays.java:3181)
     * 	at java.util.ArrayList.grow(ArrayList.java:261)
     * 	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
     * 	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
     * 	at java.util.ArrayList.add(ArrayList.java:458)
     * 	at com.developworks.jvm.HeapOOM.testStringPool(HeapOOM.java:144)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     * 	at java.lang.reflect.Method.invoke(Method.java:498)
     * 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
     * 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
     * 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
     * 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
     * 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
     * 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
     * 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
     * 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
     * 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
     * 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
     * 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
     * 	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
     * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     */

    /**
     * -XX:MaxMetaspaceSize=10M -XX:+HeapDumpOnOutOfMemoryError
     */
    @Test
    public void testMetaspaceleak() {
        while(true) {
            Enhancer hancer = new Enhancer();
            hancer.setSuperclass (HeapOOM.class);
            hancer.setUseCache (false);
            hancer.setCallback ((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invokeSuper (o, objects));
            hancer.create ();
        }
    }
    /**
     * Dumping heap to java_pid2904.hprof ...
     * Heap dump file created [4208105 bytes in 0.102 secs]
     * Exception in thread "main" java.lang.OutOfMemoryError: Metaspace
     *
     */
}
