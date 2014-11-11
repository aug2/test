package com.aug.test;
import java.io.*; 

public class FizzBuzz {

	String datainput;
	InputStreamReader ir = new InputStreamReader(System.in); //ค่าที่รับเข้ามาในคอมจะมองเป็น stream เหมือนสายน้ำ
															 //หรือกระแสไฟ
	BufferedReader in = new BufferedReader(ir); //ที่เก็บ stream ในคอมคือ buffer 
	
	//คำสั่ง input stream กับ buffer คือการที่เรามีของแล้วเอาของเก็บลงกล่อง

    public String getMessage() {
    	System.out.println("please input[1-100]: ");
    	try {
		datainput = in.readLine(); //อ่านค่าจาก buffer
	
		//Integer.parseInt()คือแปลงค่าจาก String เป็น Integer
		  if(Integer.parseInt(datainput)%3==0&&(Integer.parseInt(datainput)%5!=0)){
			  datainput = "fizz";
		  }else if(Integer.parseInt(datainput)%5==0&&(Integer.parseInt(datainput)%3!=0)){
			  datainput = "buzz";
		  }else if((Integer.parseInt(datainput)%3==0)&&(Integer.parseInt(datainput)%5==0)){
			  datainput = "fizzbuzz";
		 }else if((Integer.parseInt(datainput)%3!=0)&&Integer.parseInt(datainput)%5!=0){
		 }  
		} catch (Exception e) {
			 // TODO: handle exception
			System.out.println(e.getMessage());
		}
       return datainput;
    }
    
 //try-catch คือ การดักจับข้อผิดพลาดที่อาจจะเกิดขึ้นในโปรแกรม
}
