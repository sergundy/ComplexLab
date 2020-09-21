// User Defined Complex class 
class Complex { 
  
    double real;
    // Declaring variables
    double imaginary;
  
    // Empty Constructor 
    Complex() 
    { 
    } 
  
    // Constructor to accept 
    // real and imaginary part 
    Complex(final double a, final double b) {

        real = a;

        imaginary = b;
    }

    // Defining addComp() method
    // for adding two complex number
    Complex addComp(final Complex c1, final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding real part of complex numbers
        temp.real = c1.real + c2.real;

        // finding Imaginary part of complex numbers
        temp.imaginary = c1.imaginary + c2.imaginary;

        // returning the sum
        return temp;
    }

    Complex subComp(final Complex c1, final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding real part of complex numbers
        temp.real = c1.real - c2.real;

        // finding Imaginary part of complex numbers
        temp.imaginary = c1.imaginary - c2.imaginary;

        // returning the sum
        return temp;
    }

    Complex divComp(final Complex c1, final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();

        final double denom = c2.real * c2.real - c2.imaginary * c2.imaginary;
        // finding real part of complex numbers
        temp.real = (c1.real * c2.real - c1.imaginary * c2.imaginary) / denom;

        // finding Imaginary part of complex numbers
        temp.imaginary = (c1.real * c2.imaginary + c1.imaginary * c2.real) / denom;

        // returning the value
        return temp;
    }

    Complex multComp(final Complex c1, final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding real part of complex numbers
        temp.real = c1.real * c2.real - c1.imaginary * c2.imaginary;

        // finding Imaginary part of complex numbers
        temp.imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;

        // returning the sum
        return temp;
    }

    Complex moduleComp1(final Complex c1) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding mod of complex number
        temp.real = Math.sqrt(c1.real * c1.real + c1.imaginary * c1.imaginary);

        temp.imaginary = 0;

        // returning the value
        return temp;
    }

    Complex moduleComp2(final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding mod of complex number
        temp.real = Math.sqrt(c2.real * c2.real + c2.imaginary * c2.imaginary);

        temp.imaginary = 0;

        // returning the value
        return temp;
    }

    Complex arg1(final Complex c1) {
        // creating temporary variable
        final Complex temp = new Complex();

        // finding mod of complex number
        temp.real = Math.atan(c1.imaginary / c1.real);

        temp.imaginary = 0;

        // returning the value
        return temp;
    }

    Complex arg2(final Complex c2) {
        // creating temporary variable
        final Complex temp = new Complex();
        
       
         // finding mod  of complex number 
        temp.real = Math.atan(c2.imaginary / c2.real); 

        temp.imaginary = 0;
        

        // returning the value 
        return temp; 
    }    
} 