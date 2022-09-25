package Rekkei_Academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        float width; // khai bá biến chiều rộng
        float height; // khai báo biến chiều cao
        Scanner scanner = new Scanner(System.in); // khai báo đối tượng scanner để thực hiện chức năng nhập liệu trong java core
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // nhap chieu rong
        System.out.println("enter hieght: ");
        height = scanner.nextFloat(); // nhap chieu cao
        float area = height*width; // khai báo biến area đồng thời tính diện tích
        System.out.println("area is = "+ area); // in ra kết quả tính diện tích hình



    }
}
