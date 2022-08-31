package com.Interview;
import java.util.* ;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        int idx = 0;
        int count = 1;

        int[] ans = new int[n * n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.println();
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i + j < n - 1) {
                    ans[idx] = arr[i][j];
                    idx++;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i + j == n - 1) {
                    ans[idx] = arr[i][j];
                    idx++;
                }
            }
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < n; ++j) {
                if (i + j >= n ) {
                    ans[idx] = arr[i][j];
                    idx++;
                }
            }
        }


        System.out.println();
        System.out.println();

        for(int i=0;i<n*n;++i) {
            System.out.print(ans[i] + "\t");
        }

    }
}
