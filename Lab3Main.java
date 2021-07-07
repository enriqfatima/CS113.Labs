package com.miracostaedu.fenriquez;

public class Main {

    public static void main(String[] args) {
        /*
         * Here, n = 10 because that is where we want to start
         * n has to be less than 100
         * and we want to print all values in increments of 10 */
        for(int n = 10; n < 100; n=n+10)
        {
            //double variables
            double y1 ;
            double y2 ;

            //here we have the two functions
            y1 = 100*(n+10) ;
            y2 = (5*n*n)+2 ;
			/*check: make sure it prints 10,20...90

			//System.out.println(n);

			Using an if-if else statements
			we can compare the two equations where y1 is
			equal to y2, y1 > y2, and y1 < y2.

			*/
            if(y1==y2)
            {
                //at the number "n" ....
                System.out.println(n + ": y1 is equal to y2.");
            }
            else if(y1>y2)
            {
                System.out.println(n + ": y1 is greater than to y2.");
            }
            else
            {
                System.out.println(n + ": y1 is less than to y2.");
            }
        }
        /*
         * The results of this program does not surprise me
         * because essentially what we are doing is:
         * n = 10 therefore y1 = 1010 &  y2 = 502  so y1> y2
         * and so on...For the rest of the code it goes on
         * in increments of 10, and as n gets larger then y2
         * is greater than y1.
         *
         * */
    }
}
