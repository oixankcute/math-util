/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chou.mathutil.test.core;

import com.chou.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //đây là class sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểu tra code chính - hàm tính giai thừa bên core.MathUtil
    //có nhiều quy tắc đặt tê hàm kiểm thử
    //nhưng  thường sẽ là lói lên mục đích của các case kiểm thử
    //tình huống dùng hàm them kiểu thành công và thất bại

    //hàm dưới là tính huống test hàm chạy thành công, trả về ngon
    //ta sẽ dùng hàm kiểu well 
    @Test //JUnit phối hợp với JVM để chạy hảm này
    //bản chất @Test phía hậu trường chính là psvm 
    //có nhiều @Test ứng với các case khác nhau để kiểm thử
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào, phải chạy đúng
        long expected = 1;
//        long actual =   //gọi hàm cần test
        long actual = MathUtil.getFactorial(n);
        //so sánh expected với actual dùng framework
        Assert.assertEquals(expected, actual);
        //hamg giúp so sánh 2 giá trị nào đó có giống nhau không
        //nếu giống nhau -> màu xanh, code ngon, ít nhất cho cái case sang test 
        //nếu không giống nhau -> màu đỏ, hàm ý expected và actual không giống nhau 
    
        //gộp thêm vài case nữa vào đây
        Assert.assertEquals(1, MathUtil.getFactorial(1));//toi muốn 1!=1
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
    
    //hàm getFac ta thiết kế có 2 tình huống xử lý
    //1. đưa data từ tế từ [0,20] -> tính đúng được n! - xanh
    //2. đưa dât vào lung tung: âm, >20 -> thiết kê shamf phải cho ngoại lệ
    //kỳ vọng ngoại lệ xuất hiện khi n<0 hoặc n>20 
    //rất mong ngoại lệ xuất hiện với n nhập lung tung này 
    //nếu hàm nhận vào n<0, n>20 mà trả về ngoại lệ
    //hàm chạy đúng như thiết kế -> xanh 
    //nếu khôgn trả về ngoại lệ -> hàm chạy sai thiết kế, sai kỳ vọng -> đỏ 
    
    //test case: input: - excepted: IllegalArgu.... xuat hien
    //những tình huống bất thường, ngoại lệ, ngoài dự tính là những thứ
    //không thể đo lường, so sánh mức độ theo thiểu value 
    //mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay không 
    //assertEquals() không dùng để so sánh 2 ngoại lệ
    //equals() là bằng nhau hay không trên value 
    
    
    //màu đỏ, do hàm đúng là có trả ngoại lệ nhưng không phải ngoại lệ mình kỳ vọng
    //kỳ vọng sai chứ không phải hàm trả về sai 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowException(){
//        MathUtil.getFactorial(-5); //hàm @Test chạy hay getFac...() chạy
//                                    //sẽ trả về ngoại lệ NumberFo...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException(){
        MathUtil.getFactorial(-5); //hàm @Test chạy hay getFac...() chạy
                                    //sẽ trả về ngoại lệ NumberFo...
    }
    
    //cách khác để bắt ngoại lệ xuất hiện 
    //dung lambda
    //testcase ham se nem ve ngoia le neu nhan vao 21
    //tui can thay mau xanh khi choi voi 21
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVer(){
        //caanf 2 tham soos: loai ngoai le muon so sanh 
        //va doan code chay lamf vang ra ngoai le do 
        Assert.assertThrows(IllegalArgumentException.class, 
                            () -> {MathUtil.getFactorial(-5);});
       
    }
    
    //Bat ngoai le, xem ham co nem ngoai le hay khong khi n ca chon
    //co nem, tuc la chay dung thiet ke -> xanh 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch(){
      
        //chu dong kiem soat ngoai le 
        try {
             MathUtil.getFactorial(-5);
        } catch (Exception e) {
           //bat try-catch la JUnit se mau xanh do da chu dong bat ngoai le
           //nhng khong chac chan ngoai le minh can co xuat hien hay khong
           //co doan code kiem soat dung ngoai le IllegalArgumentException khong
           Assert.assertEquals("Invalid argument. N must be 0..20",
                         e.getMessage());
           //e la ngoai le nem ve chua full thong tin ngoai le 
        }
        
       
    }
    
    

}
