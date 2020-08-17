import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {0,1,21,33,45,45,45,45,45,45,61,71,73};
		int leftRange = SearchLeft(arr, 0, arr.length-1, 45, true);
		int rightRange = SearchLeft(arr, 0, arr.length-1, 45, false);
		System.out.println(leftRange+" "+rightRange);
	}
	public static int SearchLeft(int []arr, int left, int right, int target, boolean goleft){
	    while(left<=right){
	        int mid = (left+right)/2;
	        if(arr[mid] < target){
	            left = mid+1;
	        } else if(arr[mid] > target){
	            right = mid-1;
	        } else {
	            if(goleft == true){
	                if(mid ==0 || arr[mid] != arr[mid-1]){
	                    return mid;
	                } else {
	                    right = mid-1;
	                }
	            } else {
	                if(mid == arr.length-1 || arr[mid]!=arr[mid+1]){
	                    return mid;
	                } else {
	                    left = mid+1;
	                }
	            }
	        }
	    
	        
	    }
	
	    return -1;
	}
}
