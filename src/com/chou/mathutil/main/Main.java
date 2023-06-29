/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chou.mathutil.main;

import com.chou.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa xem có đúng như thiết kế không
        //ta phải đưa ra các tính huống sửa dụng hàm trong thực tế
        //vd: -5 0 20 21
        //test case: tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giải lập hành vi sử dụng của ai đó
        //testcase là 1 tình huống sử dụng app/hàm mà bó bao hàm:
        // data đầu vào cụ thể nào đó
        // output đầu ra ứng với xử lý của appp/hàm, dùng iput để xử lý 
        //so sánh để xem kết quả có như kỳ vọng hay không
        //kỳ vọng: ACTUAL value trả về từ hàm
        long expected = 120; //kỳ vọng 120 nếu tính 5!
        int n = 5; //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = 120" + " expected" );
        System.out.println("5! = " + actual + " actual");
    }
}
