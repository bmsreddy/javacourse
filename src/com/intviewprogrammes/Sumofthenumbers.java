package com.intviewprogrammes;

import java.io.*;

public class Sumofthenumbers {
		
		 
		    /* Function to get sum of digits */
		    static int getSum(int n){
		        int sum;
		 
		        /* Single line that calculates sum */
		        for (sum = 0; n > 0; sum += n % 10, n /= 10);
		        return sum;
		    }
		 
		    // Driver code
		    public static void main(String[] args) {
		        int n = 1234;
		 
		        // Function call
		        System.out.println(getSum(n));
		    }
	
	}
