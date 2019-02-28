package day03;
public class searchSum { 

        public static void main(String[] args) { 
            int array[] = {3,5,11,17,21,23,28,30};   
            System.out.println(binSearch(array,0)+1);  
            //binSearch(array, 17);
        } 


        	public static int binSearch(int[] array, int searchSum) {
        		System.out.println("二分查找");
        		int left = 0;
        		int right = array.length - 1;
        		int mid = (left + right) / 2;
        		//int mid = 0;
        		while (left <= right) {
        			//mid = (left + right) / 2;
        			if (array[mid] == searchSum) {
        				return mid;
        			} else if (searchSum < array[mid]) {
        				right = mid - 1;
        			} else {
        				left = mid + 1;
        			}
        			mid = (left + right) / 2;
        		}
        		System.out.println("您输入的数不在数组内");
        		return -1;
        	}
    }