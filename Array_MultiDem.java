
package com.Lecture13;

//import java.util.Arrays;

public class Array_MultiDem {

	public static void main(String[] args) {
	//int[][] a;
	//int b[][];
	//int c[][];
	//int[][] d ,d1;//both b1 and b2 are 2D Arrays
	//int[][]e,e1[];
int[][] t = new int[3][3];

t[0][0]=11;
t[0][1]=22;
t[0][2]=33;
t[1][0]=44;
t[1][1]=55;
t[1][2]=66;
t[2][0]=77;
t[2][1]=88;
t[2][2]=99;
System.out.println(t.length);

 int n[][] = new int[][] {{11,22,33,44},{55,66,77,88,99}};
 System.out.println(n.length);
 int o[][] = {{101,102,103},{104,105,106}};
 System.out.println(o.length);
 System.out.println(o[0].length);
 String[][] LoginCredentials = {{"username1","password1"},{"username2","password2"}};
 System.out.println(LoginCredentials.length);
 System.out.println(LoginCredentials[0].length);
for(int i=0; i<LoginCredentials.length;i++) {
	for(int j=0; j<LoginCredentials[0].length ; j++) {
	System.out.println(LoginCredentials[i][j]);	
	}
}
	}

}
