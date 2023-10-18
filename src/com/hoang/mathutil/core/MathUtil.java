/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoang.mathutil.core;

/**
 *
 * @author le huy hoang
 */
public class MathUtil {
    // trong class này cung cấp cho ta nhiều hàm xử lý toán học 
    //clone class Math của jdk
    //hàm thư viện mà xài chung cho ai đó không cần lưu trạng thái hay giá trị chọn thiết kế hàm static
    
    // hàm tính giá trị giai thừa
    
    // quy ước tính từ 0 đến 20
    
    public static long getFactorial(int n){
        if (n<0||n>20) throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n==0||n==1)
            return 1;
        long product=1;
        for (int i = 2; i <= n; i++) 
            product*=i;//product=product*i;
            return product;
        
    }
}
