package com.company.java.dsa.string;

import java.util.Scanner;
/*
The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format
Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Sample Input:
Hello world
I am a file
Read me until end-of-file.

Sample Output:
1 Hello world
2 I am a file
3 Read me until end-of-file.
* */
public class PrintString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int i=0;
        while(s.hasNext()) // hasNextLine() : Both method will work here
            {
            i++;
            System.out.println(i+ " "+s.nextLine());
            
        }
        
    }
}