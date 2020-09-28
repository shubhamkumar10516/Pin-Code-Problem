package com.academy.kant.PinCode;
import java.util.*;

public class PinCodeMain {

	public static boolean validatePinCode(String pin) {
		
		String pattern = "^[1-9]{3}[ ]*[0-9]{3}$";
		return pin.matches(pattern);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter pincode");
        String pin = sc.nextLine();
        
        
        while(!validatePinCode(pin)) {
			System.out.println("Invalid!! Enter pin code again: ");
			pin = sc.nextLine() ;
			
		}
        if(validatePinCode(pin))
        	System.out.println("Pincode is valid!!");
        
		
	}
}
