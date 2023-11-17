package com.Lecture13;

public class Array_Object {

	public static void main(String[] args) {
	Object[][] objar = {{"username1", "1@345abc"},{"username2","#$%hfenj"},{"username2","#$%hfen2312j"}};
	for(int i = 0 ;i<objar.length ; i++) {
		for(int j = 0 ;j< objar[i].length ; j++) {
			System.out.println(objar[i][j]);
			
		}System.out.println("");
	}

	}

 }
