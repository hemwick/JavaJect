package day04;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 8, 20, 5, 4, 9 };
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
	//插入排序
	   public static void insertSort(int[] a) {
	        int j;
	        for(int i=1;i<a.length;i++){
	            int temp = a[i];
	            for(j=i-1;j>=0 && a[j]>temp;j--){
	                a[j+1] = a[j];
	            }
	            a[j+1] = temp;
	        } 
	    }
	// 选择排序
	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// 冒泡排序
	public static void bubleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}
	
	//快速排序
	 public static void quickSort(int[] a, int start, int end) {   
		      if (start < end) {   
		         int base = a[start]; // 选定的基准值（第一个数值作为基准值）   
		         int temp; // 记录临时中间值   
		         int i = start, j = end;   
		         do {   
		             while ((a[i] < base) && (i < end))   
		                 i++;   
		             while ((a[j] > base) && (j > start))   
		                 j--;   
		             if (i <= j) {   
		                 temp = a[i];   
		                 a[i] = a[j];   
		                 a[j] = temp;   
		                 i++;   
		                 j--;   
		             }   
		         } while (i <= j);   
		         if (start < j)   
		             quickSort(a, start, j);   
		       if (end > i)   
		           quickSort(a, i, end);   
		     }   
		 }
}
