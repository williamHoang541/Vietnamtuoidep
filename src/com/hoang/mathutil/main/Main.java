/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoang.mathutil.main;

import com.hoang.mathutil.core.MathUtil;

/**
 *
 * @author le huy hoang
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm tính giai thừa chạy đúng thiết kế không
       // ta phải đưa các tình huống thực tế
       //test case một tình huống hàm app màn hình tính năng được đưa vào sửu dụng giả lập hành avi xài của ai đó
       long expected =120;
       int n=5;
       long actual=MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + "  actual");
       
    }
}
