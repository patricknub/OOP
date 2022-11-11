import java.util.*;
class Complex
{
    float real, imag;
    Complex()
    {
        real=0;
        imag=0;
    }
    Complex(float r, float i)
    {
        real = r;
        imag = i;
    }
    public void AddNumbers(Complex c1, Complex c2)
    {
        float real, imag;
        real = (c1.real + c2.real);
        imag = (c1.imag + c2.imag);
        System.out.println("Addition is:("+ real + ") + (" + imag + ")i\n" );
    }
    public void SubNumbers(Complex c1,Complex c2)
    {
        float real, imag;
        real = (c1.real - c2.real);
        imag = (c1.imag - c2.imag);
        System.out.println("Subtraction is:("+ real + ") + (" + imag + ")i\n");
    }
     public void MulNumbers(Complex c1,Complex c2)
    {
        float real, imag;
        real = (c1.real * c2.real);
        imag = (c1.real*c2.imag) + (c1.imag*c2.real);
        System.out.println("Multiplication is:("+ real + ") + (" + imag + ")i\n");
    }
     public void DivNumbers(Complex c1,Complex c2)
    {
        float real, imag;
        real = ((c1.real*c2.real)+(c1.imag*c2.imag))/((c2.real * c2.real)+(c2.imag*c2.imag));
        imag = ((c2.real*c1.imag)-(c2.imag*c1.real))/((c2.real*c2.real)+(c2.imag*c2.imag));
        
        System.out.println("Division is:("+ real + ") + (" + imag + ")i\n");
    }
}
class Complex_op
{
    public static void main(String args[])
    {
        float real, imag;
        Complex_op cal = new Complex_op ();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first no.\n");
        real= input.nextInt();
        imag= input.nextInt();
        Complex Object1 = new Complex(real,imag);
        
        System.out.println("Enter the Second Number\\n");
        real= input.nextInt();
        imag= input.nextInt();
        Complex Object2 = new Complex(real, imag);
        
        Complex object3 = new Complex();
        
        object3.AddNumbers (Object1 , Object2);
        object3.SubNumbers(Object1 , Object2);
        object3.MulNumbers(Object1 , Object2);
        object3.DivNumbers(Object1 , Object2);
    }
}
