package day03;

import java.util.Arrays;

import vice.array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];

		int a2[];
		a2 = new int[5];

		int[] a3 = { 3, 4, 2, 6, 9 };

		// System.out.println(a3.length);//数组length 是属性无参
		// String string="asdasdadd";
		// System.out.println(string.length());//有参
		// System.out.println(a[0]);

		a[0] = 1;
		a[1] = 6;
		a[2] = 3;
		a[3] = 8;
		a[4] = 2;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.arraycopy(a, 0, a2, 2, 3);// 被复制数组，起始位置，目标数组，复制起始点，复制数量
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + "----");
		}
		System.out.println();
		// 二维数组
		int[][] a4 = new int[4][];

		a4[0] = new int[3];
		a4[1] = new int[3];
		a4[2] = new int[] { 1, 23, 78 };
		a4[3] = new int[5];// 定义数组结构

		a4[0][0] = 3;
		a4[0][1] = 3;
		a4[0][2] = 3;// 给第一行赋值

		a4[1][0] = 4;
		a4[1][1] = 4;
		a4[1][2] = 4;// 给第二行赋值
		for (int i = 0; i < a4.length; i++) {
			for (int j = 0; j < a4[i].length; j++) {
				System.out.print(a4[i][j] + "  ");
			}
			System.out.println();
		}

		int[][] a5 = { { 1, 4 }, { 2, 4, 6 }, { 7, 9, 10 } };
		for (int i = 0; i < a5.length; i++) {
			for (int j = 0; j < a5[i].length; j++) {
				System.out.print(a5[i][j] + "  ");
			}
			System.out.println();
		}
		int[] a6 = { 5, 10, 18, 20, 60 };
		// binSearch(a6,10);
		System.out.println(binSearch(a6, 10) + "---");
		System.out.println(Arrays.binarySearch(a6, 10));

		// int[] a3 = { 3, 4, 2, 6, 9 };
		int[] b = { 3, 4, 2, 6, 9 };
		System.out.println(Arrays.equals(a3, b));// 对比两个数组是否一致 包括顺序
		System.out.println(Arrays.toString(b));// 打印该数组
		// Arrays.fill(b, 0); //将b数组中数值清零
		// System.out.println(Arrays.toString(b));
		Arrays.sort(b); // 将b数组从小到大排序
		System.out.println(Arrays.toString(b));

		String s1 = "addas:bd:dsaf:e:f:g";
		String[] str = s1.split(":"); // 按 ：做拆分
		System.out.println(Arrays.toString(str));

		int[] aa = { 3, 4, 9, 20, 35, 0 };
		int x = 7;
		insert(aa, 7);
		System.out.println(Arrays.toString(aa));
	}

	/*
	 * 二分查找方法
	 */
	public static int binSearch(int[] aa, int searchSum) {
		System.out.println("二分查找");
		int left = 0;
		int right = aa.length - 1;
		int mid = (left + right) / 2;
		//int mid = 0;
		while (left <= right) {
			//mid = (left + right) / 2;
			if (aa[mid] == searchSum) {
				return mid;
			} else if (searchSum < aa[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			mid = (left + right) / 2;
		}
		System.out.println("二分查找");
		return -1;
		
	}

	// 插入
	public static void insert(int[] array, int x) {
		// 3,4,9,20,35,0
		int n = array.length - 2;
		while (n > 0 && x < array[n]) {
			array[n + 1] = array[n];
			n--;
		}
		array[n + 1] = x;
	}
	//插入排序b = 1,8,20,5,4,9
	//a = 1,4,5,8,9,20
	
	public static void insertSort(int[] c1) {
		for(int i=1;i<c1.length;i++) {
			int j=i-1;
			int temp=c1[i];
			while(j!=-1&&temp<c1[j]) {
				c1[j+1]=c1[j];
				j--;
			}
			c1[j+1]=temp;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
