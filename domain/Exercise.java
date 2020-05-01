/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Admin
 */
public class Exercise {
	/**
         *  Armstrong number calculation method for a three-digit number
         *  153 divided into three numbers: 1 5 3
         *  1*1*1 + 5*5*5 + 3*3*3
         *  1 + 125+ 27 = 153
         * 
         * @return temp - original value of the number
         */
    
public static int Calculate() {
    /**
     * @param temp assign a number so 
     * as not to lose the original value.
     */
    int number = 371;
    int temp = number;
    int r, sum = 0;
    while(number > 0){
        r = number % 10;
       number = number / 10;
        sum = sum +  r*r*r;
        
    }
    /**
     * Checking if the starting value is equal 
     * to the sum of each multiplied number.
     */
    if(temp != sum)
        System.out.println("Not an Armstrong number");
    else 
        System.out.println("Its an Armstrong number");
    return temp ;
}

 }
  