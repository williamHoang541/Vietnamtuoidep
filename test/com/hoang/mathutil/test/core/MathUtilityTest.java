/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoang.mathutil.test.core;

import com.hoang.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author le huy hoang
 */
public class MathUtilityTest {
    
   // đây là class sẽ dùng thư việc framework Junit để kiểm thử code chính
    @Test
    public void testGetFactoryGivenRightArgumentReturnWell(){
        int n=1;
        long expected=1;
        long actual=MathUtil.getFactorial(n);
        // so sánh expected vs actual dung framwork
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(1,MathUtil.getFactorial(1));
        Assert.assertEquals(2,MathUtil.getFactorial(2));
        Assert.assertEquals(6,MathUtil.getFactorial(3));
        Assert.assertEquals(24,MathUtil.getFactorial(4));
        Assert.assertEquals(120,MathUtil.getFactorial(5));
        Assert.assertEquals(720,MathUtil.getFactorial(6));
    }
    //@Test(expected=NumberFormatException.class)
    //public void testGetFactoryGivenWrongArgumentReturnExeption(){
    //    MathUtil.getFactorial(-5);
        
    //}
    @Test(expected=IllegalArgumentException.class)
    public void testGetFactoryGivenWrongArgumentReturnExeption(){
        MathUtil.getFactorial(-5);
    }
    // cách khác lambda
    @Test
    public void testGetFactoryGivenWrongArgumentReturnExeption_LambdaVersion(){
       // Assert.assertThows
    }
    @Test
    public void testGetFactoryGivenWrongArgumentReturnExeption_TryCatch(){
        try { // chủ đọng bắt ngoại lệ
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            // codekieeur soát đúng ngoại lệ
            Assert.assertEquals("Invalid", e.getMessage());
        }
        
    }
}
