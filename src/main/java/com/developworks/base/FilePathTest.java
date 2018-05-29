package com.developworks.base;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * <p>Title: getAbsolutePath & getCanonicalPath</p>
 * <p>Description: getAbsolutePath & getCanonicalPath 区别验证</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-22 23:20</p>
 */
public class FilePathTest {
    /*
    getAbsolutePath()
        得到的是全路径, 如果构造的时候就是全路径那直接返回全路径,
        如果构造的时候试相对路径，返回当前目录的路径+构造file时候的路径
    getCanonicalPath()
        可以看到CanonicalPath不但是全路径，而且把..或者.这样的符号解析出来；
        解析的结果为现有文件或目录的每个路径名都有一个惟一的规范形式。
        表示非存在文件或目录的每个路径名也有一个惟一的规范形式。
        非存在文件或目录路径名的规范形式可能不同于创建文件或目录之后同一路径名的规范形式。
        同样，现有文件或目录路径名的规范形式可能不同于删除文件或目录之后同一路径名的规范形式。
     */
    @Test
    public void test01() throws Exception {
        File file2 = new File("D:\\JetBrains\\LitterRoach\\javaDevelopworks\\target\\classes\\java.policy");
        System.out.println("-----默认绝对路径:取得路径相同------");
        System.out.println("getPath: " + file2.getAbsolutePath ());
        System.out.println("getCanonicalPath: " + file2.getCanonicalPath());
    }

    /**
     * -----默认绝对路径:取得路径相同------
     * getPath: D:\JetBrains\LitterRoach\javaDevelopworks\target\classes\java.policy
     * getCanonicalPath: D:\JetBrains\LitterRoach\javaDevelopworks\target\classes\java.policy
     *
     */

    @Test
    public void test02() throws IOException {
        //文件存在
        System.out.println("=======文件存在=========");
        File file1 = new File("./target/classes/JAVA.POLICY");
        System.out.println("getPath: " + file1.getAbsolutePath ());
        System.out.println("getCanonicalPath: " + file1.getCanonicalPath());

        //文件不存在
        System.out.println("=======文件不存在=========");
        File file2 = new File("JAVA.POLICY");
        System.out.println("getPath: " + file2.getAbsolutePath ());
        System.out.println("getCanonicalPath: " + file2.getCanonicalPath());
    }
    /**
     * =======文件存在=========
     * getPath: D:\JetBrains\LitterRoach\javaDevelopworks\.\target\classes\JAVA.POLICY
     * getCanonicalPath: D:\JetBrains\LitterRoach\javaDevelopworks\target\classes\java.policy
     * =======文件不存在=========
     * getPath: D:\JetBrains\LitterRoach\javaDevelopworks\JAVA.POLICY
     * getCanonicalPath: D:\JetBrains\LitterRoach\javaDevelopworks\JAVA.POLICY
     */

    @Test
    public void test03() throws IOException {
        File file = new File("");
        System.out.println(file.getCanonicalPath ());

        File file3 = new File ("aa.txt");
        System.out.println (file3.getCanonicalPath ());
    }
    /**
     * D:\JetBrains\LitterRoach\javaDevelopworks
     * D:\JetBrains\LitterRoach\javaDevelopworks\aa.txt
     */
}