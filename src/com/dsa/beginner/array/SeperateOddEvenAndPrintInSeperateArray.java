package com.ggl.practice.array;

import java.util.Scanner;

// 10
// 452362886 75768689 247249986 472805849 415014921 242296902 57978761 364718082 268628454 774115327

/*
   Input

   10
7
509800927 348992125 733735508 654457679 499101452 855551825 443382987
8
905578050 972494652 245375028 878368500 105860782 944700823 490393895 948966983
9
798010236 29079384 720590272 493468480 808983313 722971196 470315704 720150938 679454398
2
860913338 587475971
8
517757309 70339184 520722130 366035448 185927255 578942245 538351388 348346547
10
452362886 75768689 247249986 472805849 415014921 242296902 57978761 364718082 268628454 774115327
7
225137014 98149921 536535463 21434335 358473307 153990006 582935602
3
897324350 664604339 44410966
1
968819918
9
467587686 584409350 192985738 440958471 883800429 304643155 432387944 370170046 791202706


*
* */
public class SeperateOddEvenAndPrintInSeperateArray {
    public static void printEvenAndOddArray(int arr[]){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==0){
                break;
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();

        for(int i=1;i<=operation;i++){
            int array_size=sc.nextInt();

            // creating array of N size
            int [] arr=new int[array_size];

            // Creating even and odd array
            int []even_array=new int[(array_size/2)+2];
            int [] odd_array=new int[(array_size/2)+2];

            // Taking array element from user
            int k=0,l=0;
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();

                if(arr[j]%2==0){
                    even_array[k]=arr[j];
                    k++;
                }else{
                    odd_array[l]=arr[j];
                    l++;
                }

            }

            // Printing array
            printEvenAndOddArray(odd_array);
            printEvenAndOddArray(even_array);
        }

        
    }
}
