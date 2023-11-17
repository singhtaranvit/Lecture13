package com.Lecture13;

public class Array_Create {

	public static void main(String[] args) {
		int[] a =  new int[3];//creation and declaration an array of size 3
		int[] b; //declaration of an array
		b = new int[5];//creation of an array
System.out.println(b.length);
System.out.println(a.length);
int[] c = new int[0];
System.out.println(c.length);
int[] d = new int[-5];
System.out.println(d.length);
	}

}
