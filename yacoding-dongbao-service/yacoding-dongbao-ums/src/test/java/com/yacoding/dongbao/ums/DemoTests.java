package com.yacoding.dongbao.ums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author yaCoding
 * @create 2022-12-11 下午 9:23
 */

public class DemoTests {

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test(){
        System.out.println("test");
        int a = 1+1;
//		Assertions.assertEquals(2,a);

        Assertions.assertTrue(2 == a);
    }

    @Test
    void testMock(){
    }

}
