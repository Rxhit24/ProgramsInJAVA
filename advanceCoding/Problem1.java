package StringProblem;
import java.util.Scanner;

/*  Given Two Binary Numbers (in 0 and 1) in the form of string.
 * find out whether there is possibility that these numbers can become equal by rearranging
 * thier respective 0's and 1's ?
 * 
 * example 110 and 011 can be arranged either 110 ad 011 
 * 
 * sample input
 * 3
 * "110"
 * "011"
 * 
 * output
 * Yes
*/
class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("SEnter String length");
         int s = sc.nextInt();

         System.out.println("Enter first Number in String Format");
         String n1 = sc.next();

         System.out.println("Enter Second Number in String Format");
         String n2 = sc.next();

         int n11 = 0, n10= 0, n21 = 0 , n20 = 0;
        
         for(int i = 0; i < s; i++){
            if((n1.charAt(i)) == '1'){
                ++n11;
            }else{
                ++n10;
            }

            if((n2.charAt(i)) == '1'){
                ++n21;
            }else{
                ++n20;
            }
            
         }
         if(n11 == n21 & n10 == n20){
            System.out.println("Yes");
         }else{
            System.out.println("No");
         }
    }
}