package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte Vat_ly ;
        System.out.println("Vui lòng nhập điểm Vật lý");
        Scanner scanner = new Scanner(System.in);
        Vat_ly = scanner.nextByte();

        byte Hoa_hoc ;
        System.out.println("Vui lòng nhập điểm Hóa học");
        Hoa_hoc = scanner.nextByte();

        byte Sinh_hoc ;
        System.out.println("Vui lòng nhập điểm Sinh Học");
        Sinh_hoc = scanner.nextByte();




        if ((Vat_ly < 0 ) ||  (Vat_ly > 10  )){
            System.out.println("Vui lòng nhập điểm Vật lý là số trong khoảng từ 1 - 10");
            Vat_ly = scanner.nextByte();
        };

        if((Hoa_hoc < 0 ) || (Hoa_hoc > 10)){
            System.out.println("Vui lòng nhập điểm Hóa học là số trong khoảng từ 1 - 10");
            Hoa_hoc = scanner.nextByte();
        };
            if((Sinh_hoc < 0 ) ||(Sinh_hoc > 10)){
            System.out.println("Vui lòng nhập điểm Sinh Học là số trong khoảng từ 1 - 10");
            Sinh_hoc = scanner.nextByte();
        };
        float Diem_TB;
        float Diem_Tong;
        Diem_Tong = Vat_ly + Sinh_hoc + Hoa_hoc;
        Diem_TB = Diem_Tong/3;
        System.out.println("Điểm TB :" + Diem_TB);
        System.out.println("Điểm Tổng :" + Diem_Tong);
    }
}
