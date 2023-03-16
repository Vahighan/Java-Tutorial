//Lab1 - Welcome and display current date to the user

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
public class HelloDate2 {

	public static void main(String[] args) {
		System.out.println("Witaj! Teraz jest: ");
	   
			   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println(dtf.format(now)); 
	
	  }   
	}
  
