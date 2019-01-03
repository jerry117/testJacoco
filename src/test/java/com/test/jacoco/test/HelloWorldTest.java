package com.test.jacoco.test;


import com.test.jacoco.HelloWorld;
import org.junit.Test;
import junit.framework.*;

public class HelloWorldTest {

//TODO 后续看注解的定义
//    TODO 后续补充maven的概念和方法

    @Test
    public void testMethod1(){
        HelloWorld hw = new HelloWorld();
        String ss = hw.testMethod1();
        Assert.assertNotNull(ss);
    }

    @Test
    public void testMethod2(){
        HelloWorld hw = new HelloWorld();
        int ss = hw.addMethod(3,5);
        Assert.assertEquals(ss,8);
    }


}
