package com.developworks.base;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;

/**
 * <p>Title: SecurityManager测试</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-22 17:07</p>
 */
public class SecurityManagerTest {

    class MySecurityManager extends SecurityManager {
        @Override
        public void checkRead(String file) {
            if ("java.policy".contains (file)) {
                throw new AccessControlException ("cannot read file:" + file);
            }
            super.checkRead (file);
        }
    }

    @Test
    public void test01() {
        System.setSecurityManager (new MySecurityManager ());
        try (InputStream input = getClass ().getResourceAsStream ("java.policy")) {
            SecurityManager sm = System.getSecurityManager ();
            if (sm != null) {
                System.setSecurityManager (null);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    /**
     * java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "setSecurityManager")
     *
     * 	at java.security.AccessControlContext.checkPermission(AccessControlContext.java:472)
     * 	at java.security.AccessController.checkPermission(AccessController.java:884)
     * 	at java.lang.SecurityManager.checkPermission(SecurityManager.java:549)
     * 	at java.lang.System.setSecurityManager0(System.java:300)
     * 	at java.lang.System.setSecurityManager(System.java:291)
     * 	at com.developworks.base.SecurityManagerTest.test01(SecurityManagerTest.java:35)
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
     *
     * Exception in thread "main" java.security.AccessControlException: access denied ("java.io.FilePermission" "D:\JetBrains\IntelliJ IDEA 2018.1.1\plugins\junit\lib\junit-rt.jar" "read")
     * 	at java.security.AccessControlContext.checkPermission(AccessControlContext.java:472)
     * 	at java.security.AccessController.checkPermission(AccessController.java:884)
     * 	at java.lang.SecurityManager.checkPermission(SecurityManager.java:549)
     * 	at java.lang.SecurityManager.checkRead(SecurityManager.java:888)
     * 	at com.developworks.base.SecurityManagerTest$MySecurityManager.checkRead(SecurityManagerTest.java:25)
     * 	at java.io.File.isDirectory(File.java:844)
     * 	at sun.net.www.ParseUtil.fileToEncodedURL(ParseUtil.java:269)
     * 	at sun.security.provider.PolicyFile.canonicalizeCodebase(PolicyFile.java:1735)
     * 	at sun.security.provider.PolicyFile.access$700(PolicyFile.java:258)
     * 	at sun.security.provider.PolicyFile$5.run(PolicyFile.java:1188)
     * 	at sun.security.provider.PolicyFile$5.run(PolicyFile.java:1186)
     * 	at java.security.AccessController.doPrivileged(Native Method)
     * 	at sun.security.provider.PolicyFile.getPermissions(PolicyFile.java:1185)
     * 	at sun.security.provider.PolicyFile.getPermissions(PolicyFile.java:1132)
     * 	at sun.security.provider.PolicyFile.implies(PolicyFile.java:1086)
     * 	at java.security.ProtectionDomain.implies(ProtectionDomain.java:281)
     * 	at java.security.AccessControlContext.checkPermission(AccessControlContext.java:450)
     * 	at java.security.AccessController.checkPermission(AccessController.java:884)
     * 	at java.lang.SecurityManager.checkPermission(SecurityManager.java:549)
     * 	at java.lang.SecurityManager.checkExit(SecurityManager.java:761)
     * 	at java.lang.Runtime.exit(Runtime.java:107)
     * 	at java.lang.System.exit(System.java:971)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:71)
     *
     * Process finished with exit code 1
     */

}
