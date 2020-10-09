package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[]arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        for (int r:arr) {
            System.out.println(r);
        }

    }
}
  