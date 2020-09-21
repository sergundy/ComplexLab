import java.util.Scanner;
 
// Main Class 
public class Test { 
  
    // Main function 
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Input a number c1 real : ");
        final double a = in.nextInt();
        System.out.println("Input a number c1 img : ");
        final double b = in.nextInt();
        System.out.println("Input a number c2 real : ");
        final double c = in.nextInt();
        System.out.println("Input a number c2 img : ");
        final double d = in.nextInt();

        // first complex number
        final Complex c1 = new Complex(a, b);

        // printing first complex number
        System.out.println("Complex number 1 : " + c1.real + " + " + c1.imaginary + "i");

        // Second Complex number
        final Complex c2 = new Complex(c, d);
  
        // printing second complex number 
        System.out.println("Complex number 2 : " + c2.real + " + " + c2.imaginary + "i");
        System.out.println();

        System.out.println("Choose what you want to do witn numbers : 1 - sum | 2 - subst | 3 - div | 4 - mult | 5 - mod | 6 - atan ");

        
        final int i = in.nextInt();
        in.close();
        
        
        // for Storing the value 
        Complex c3 = new Complex();
        Complex c4 = new Complex();
        Complex c5 = new Complex();
        Complex c6 = new Complex();
        Complex c7 = new Complex();
        Complex c8 = new Complex();
        Complex c9 = new Complex();
        Complex c10 = new Complex();
        
        // calling addComp() etc methods
        c3 = c3.addComp(c1, c2);
        c4 = c4.subComp(c1,c2); 
        c5 = c5.divComp(c1,c2);
        c6 = c6.multComp(c1,c2);
        c7 = c7.moduleComp1(c1);
        c8 = c8.moduleComp2(c2);
        c9 = c9.arg1(c1);
        c10 = c10.arg2(c2);


        if(i == 1){

            System.out.println("Sum of complex number : " + c3.real + " + "  + c3.imaginary + "i");

        } else if(i == 2) { if(b < d) {

            System.out.println("Sub of complex number : " + c4.real + " - " + c4.imaginary + "i"); 
    
            } else {

            System.out.println("Sub of complex number : " + c4.real + " + " + c4.imaginary + "i");

            }

        } else if(i == 3){

            System.out.println("Div of complex number : " + c5.real + " + " + c5.imaginary + "i");

        } else if(i == 4){

            System.out.println("Mult of complex number : " + c6.real + " + " + c6.imaginary + "i");

        } else if(i == 5){

            System.out.println("Module of first complex number : " + c7.real);
                           
            System.out.println("Module of second complex number : " + c8.real);

        } else if(i == 6){

            System.out.println("Atan of first complex number : " + c9.real);
                           
            System.out.println("Atan of second complex number : " + c10.real);
        }                                             
    }
} 

