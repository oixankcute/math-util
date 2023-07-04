/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chou.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {

    //class này cung cấp ra ngoài nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm cung cấp tiện ích, không lưu nhớ data gọi là static 
    //hamg thư viện dùng chung, không cần lưu lại trạng thái/giá trị chọn thiết kế là static
    //hàm tính giai thừa
    //n! = 1.2.3.4....n
    //không có giai thừa cho số âm
    //0!=1!=1 quy ước
    //giai thừa tăng rất nhanh, hàm đồ thị dốc đứng 
    //20! 18 số 0, vừa đủ kiểu long
    //21! tràn kiểu long
    //quy ước tình n! trong khoảng từ 0 đến 20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be 0..20");
//
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//             product*=i;
//        }
//        return product;
//    }
    //Đệ quy - recursion
    //là hiện tượng gọi lại chính mình với 1 quy mô khác
    //ví dụ: búp bê nga, giống nhau, lồng trong nhau
    //tính 6!
    //n! = 1.2.3.4.5.6. ... .n
    //6! = 6.5! 
    //5! = 5.4!
    //...
    //2! = 2.1! //điểm dừng
    //quy ước 1! = 1, 0! = 1
    //chốt: n! = n*(n-1)!
    public static long getFactorial(int n) {
        if(n<0 || n>20){
            throw new IllegalArgumentException("0...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
