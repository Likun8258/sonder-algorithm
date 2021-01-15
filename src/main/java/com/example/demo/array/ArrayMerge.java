package com.example.demo.array;

/**
 * @Author likun
 * @Date
 **/
public class ArrayMerge {

    /**
     * 合并两个有序的数组1
     */
    public void merge1(int[] A, int m,int[] B, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[j] > B[i]){

                }
            }
            A[m + i] = B[i];
        }
        sortOfBubbling(A, m, n);
    }

    /**
     * 合并两个有序的数组
     */
    public void merge(int[] A, int m,int[] B, int n){
        for (int i = 0; i < n; i++) {
            A[m + i] = B[i];
        }

        //冒泡排序
        //sortOfBubbling(A, m, n);



    }

    /**
     * 冒泡排序
     */
    private void sortOfBubbling(int[] a, int m, int n) {
        int tmp = 0;
        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n - 1 - i; j++) {
                if (a[j] > a[j+1]){
                    tmp = a[j + 1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

}
