// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	


import java.util.*;

public class Pattern_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        // write ur code here
      
      //upper half
      for ( int i= 1 ; i<=n/2+1; i++){
        
         //Type 1 for Star 
          for ( int j = 1; j<=(n/2+1)-(i-1);j++){
              System.out.print("*\t");
          }

           // Type 2 for spaces
          for ( int j = 1; j<=2*i-1;j++){
              System.out.print("\t");
          }
          
          for ( int j = 1; j<=(n/2+1)-(i-1);j++){
              System.out.print("*\t");
          }
          System.out.println();
    }

      
      //Lower half
      int inc_count = 2;
      int dec_count = n-2;
      for ( int i=1 ; i<= n/2 ; i++){
          
          // Type 1 for star
          for ( int j = 1 ; j<=inc_count;j++){
             System.out.print("*\t"); 
          }

          // Type 2 for Spaces 
          for ( int j = 1 ; j<=dec_count;j++){
             System.out.print("\t"); 
          }

          // Type 3 for Star
          for ( int j = 1 ; j<=inc_count;j++){
             System.out.print("*\t"); 
          }
          
          inc_count+=1;
          dec_count-=2;
          System.out.println();
      
     }


    }
}