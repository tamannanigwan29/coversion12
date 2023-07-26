package com.java.AllConversion;

import java.util.ArrayList;
import java.util.List;

public class ConvArrayListToarray {

	public static void main(String[] args) {
		
		List <Integer>num = new ArrayList<>();
		
		num.add(10);
		num.add(25);
		num.add(378);
		
		Integer[] intarr =new Integer[(num.size())] ;
		
		num.toArray(intarr);
	
		for(Integer integer: intarr) {
			System.out.println(integer);
		}
		
		
		
		
		
		

	}

}
