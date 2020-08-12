import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr1={-1,5,10,20,28,3};
		int[] arr2 = {26,134,135,15,17};
		int m=arr1.length;
		int n=arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int minDiff = Integer.MAX_VALUE;
		int[] result = new int[2];
		int i=0;
		int j=0;
		while(i<m && j<n){
		    if(Math.abs(arr1[i]-arr2[j])<minDiff){
		        minDiff = Math.abs(arr1[i]-arr2[j]);
		        result[0] = arr1[i];
		        result[1] = arr2[j];
		        i++;
		    } else {
		        j++;
		    }
		}
		System.out.println(minDiff);
		System.out.print(result[0]+" "+result[1]);
	}
}
