package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//Bài 9.1
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap vao so nguyen a");
	     int a = sc.nextInt();
	     if(a >= 0) {
		    System.out.println("a la so nguyen duong");
	     }else { 
	    	System.out.println("a la so nguyen am");
	     }
	     
	     //Bai 9.2
	     System.out.println("Nhap vao mot so nguyen n");
	     int n = sc.nextInt();
	     if(n % 3 == 0) {
	    	 System.out.println("n chia het cho 3");
	     }else {
	    	 System.out.println("n khong chia het cho 3");
	     }
	     if(n % 5 == 0) {
	    	 System.out.println("n chia het cho 5");
	     }else {
	    	 System.out.println("n chia het cho 5");
	     }
	     
	     //Bai 9.3
	     System.out.println("Nhap vao thang");
	     int thang = sc.nextInt();
	     if(thang == 2) {
	    	 System.out.println("Thang co 28 ngay, thang nhuan co 29 ngay ");
	     }
	     if(thang != 4 ||thang != 6 ||thang != 9 ||thang != 11) {
	    	 System.out.println("Thang co 30 ngay");
	     }

}
}
