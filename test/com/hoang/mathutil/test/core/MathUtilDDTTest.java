/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoang.mathutil.test.core;

import com.hoang.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author le huy hoang
 */
// câu lệnh của jUnit báo hioeeuj nrnagwf sẽ cần loop qua tập data để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters // junit sẽ chạy ngầm loop qua từng dong của manghr để lấy ra cặp data
    public static Object[][]initData(){
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,120},
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;
    @Test
    public void testGetFactoryGivenRightArgumentReturnWell(){
         Assert.assertEquals(expected,MathUtil.getFactorial(n));
    }
}
