// ComplexNumber = a + bi ;  a = real , bi = imaginary

class ComplexNumber{

    int real ;
    int imaginary ;

    public ComplexNumber(){
        real = 0 ;
        imaginary = 0 ;
    }

    public ComplexNumber(int real ,int imaginary){

        this.real = real ;
        this.imaginary = imaginary ;
    }

    // public void addition(int real1 , int imaginary1 ,int real2 , int imaginary2){

    //     int real = real1 + real2 ;
    //     int imaginary = imaginary1 + imaginary2 ;

    //     System.out.println("Addition Of Two ComplexNumber = " + real + " + " + imaginary + "i");
    // }

    public void addition(int real , int imaginary){
        this.real += real ;
        this.imaginary += imaginary ;

        System.out.println("Addition Of Two ComplexNumber = " + this.real + " + " + this.imaginary + "i");

    }


} 
public class Lab6b2 {
    public static void main(String[] args) {
        

        ComplexNumber c1 = new ComplexNumber(5,2) ;
        ComplexNumber c2 = new ComplexNumber(1,2) ;

        // c1.addition(c1.real, c1.imaginary, c2.real, c2.imaginary);
        
        c1.addition(c2.real, c2.imaginary);

    }
}
