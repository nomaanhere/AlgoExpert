// First Approach O(n) - Time Complexity | O(n) space complexity
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] arr = {2,1,2,2,2,3,4,2};
	    int [] result = new int[arr.length];
	    int count = 0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=2){
	            result[count++] = arr[i];
	        }
	    }
	    
	    while(count<arr.length){
	        result[count++] = 2;
	    }
	    
	    for(int i=0;i<result.length;i++){
	        System.out.print(result[i]+" ");
	    }
	}
}


//Second Approach O(n) Time Complexity | O(1) Space complexity

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int [] arr = {2,2,4,2,2,6,3,5,2};
	    int i=0;
	    int j=arr.length-1;
	    while(i<j){
	        while(i<j && arr[j]==2){
	            j--;
	        }
	        if(arr[i]==2){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        }
	        i++;
	    }
	    for(i=0;i<arr.length;i++){
	        System.out.print(arr[i]);
	    }
	    
	}
}






