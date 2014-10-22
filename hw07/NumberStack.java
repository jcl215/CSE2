/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Number stack
//
//Compile then run the program NumberStack.java

import java.io.*;
import java.util.*;


import java.util.Scanner;
public class NumberStack {
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter a number between  1 and 9: ");
    n=scan.nextInt();
    
    System.out.println("Using for loops:");
    for(int ct = 1; ct <= n; ct++) {     //A for loop
        for(int i = 0; i < ct; i++) {
            for(int j = 0; j < (n - ct); j++) { 
            System.out.print(" ");
            }
            for(int j = 0; j < ((ct*2)-1); j++) { 
            System.out.print(ct);
            }
            System.out.print("\n");
        }
            for(int j = 0; j < (n - ct); j++) { 
            System.out.print(" ");
            }
            for(int j = 0; j < ((ct*2)-1); j++) { 
            System.out.print("-");
            }
            System.out.print("\n");
    } 
    
    System.out.println("Using while loops:");
    int ct = 1;
    while(ct <= n) {    //Starting a while loop
        int i = 0;
        while(i < ct) {
            int j = 0;
            while(j < (n - ct)) { 
            System.out.print(" ");
            j++;
            }
            j = 0;
            while(j < ((ct*2)-1)) { 
            System.out.print(ct);
            j++;
            }
            System.out.print("\n");
            i++;
        }
            int j = 0;
            while(j < (n - ct)) { 
            System.out.print(" ");
            j++;
            }
            j = 0;
            while(j < ((ct*2)-1)) { 
            System.out.print("-");
            j++;
            }
            System.out.print("\n");
            ct++;
    } 
    
    System.out.println("Using do-while loops:");
    ct = 1;
    do {
        int i = 0;
        do {
            int j = 0;
            if(n != ct)
            do { 
            System.out.print(" ");
            j++;
            } while(j < (n - ct));
            j = 0;
            do { 
            System.out.print(ct);
            j++;
            } while(j < ((ct*2)-1));
            System.out.print("\n");
            i++;
        } while(i < ct);
            int j = 0;
            if(n != ct)
            do { 
            System.out.print(" ");
            j++;
            } while(j < (n - ct));
            j = 0;
            do { 
            System.out.print("-");
            j++;
            } while(j < ((ct*2)-1));
            System.out.print("\n");
            ct++;
    } while(ct <= n);
}}
