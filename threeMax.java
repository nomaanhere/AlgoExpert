/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int [] threeMax = {0,0,0};
		int[] arr = {144,-7,-3,18,17,15,-8,7,541};
	    for(int i=0;i<arr.length;i++){
	        findThreeMax(threeMax, arr[i]);
	    }
	    for(int i=0;i<3;i++){
	        System.out.print(threeMax[i]+" ");
	    }
	}
	
	public static int[] findThreeMax(int[] threeMax, int n){
	    if(threeMax[2] == 0 || threeMax[2]<n){
	        shiftbits(threeMax,n,2);
	    } else if(threeMax[1] == 0 || threeMax[1]<n){
	        shiftbits(threeMax,n,1);
	    } else if(threeMax[0] == 0 || threeMax[0]<n ){
	        shiftbits(threeMax,n,0);
	    }
	    return threeMax;
	}
	public static int[] shiftbits(int[] threeMax, int n, int ind){
	    for(int i=0;i<ind+1;i++){
	        if(i==ind){
	            threeMax[i] = n;
	        } else {
	            threeMax[i] = threeMax[i+1];
	        }
	    }
	    return threeMax;
	}
	
	
}
