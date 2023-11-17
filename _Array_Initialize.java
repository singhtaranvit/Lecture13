package com.Lecture13;

import java.util.Arrays;

public class _Array_Initialize {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 15;
		a[2] = 20;
		a[3] = 25;
		a[4] = 30;
	
		
		int[] b = {10,15,20,25,34,38};//declare + create + initialize
		System.out.println(Arrays.toString(a));
 System.out.println(Arrays.toString(b));
 System.out.println();
 for(int i =0; i<a.length;i++) {
	 System.out.println(a[i]);
 }for(int i = 0; i<b.length ; i++) {
	 System.out.print(b[i] + " ");
 }
	}

}
