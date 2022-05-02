package com.dsa.intermediate.math;

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int n=A.length(),  sum=0,pow=0;
        for(int i=n-1;i>=0;i--,pow++){
            sum += ((A.charAt(i) - 65) + 1)*Math.pow(26,pow);
            //pow++;
            /*
              In pieces
              char ch=A.charAt(i);
              int val=(int)ch-61+1
              sum=sum+val*Math.pow(26,p
            * */
        }
        return sum;
    }

    public static void main(String[] args) {

        ExcelColumnNumber excelColumnNumber=new ExcelColumnNumber();
        System.out.println(excelColumnNumber.titleToNumber("AB"));
        System.out.println(excelColumnNumber.titleToNumber("ABCD"));
    }
}
