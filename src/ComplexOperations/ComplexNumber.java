package ComplexOperations;

public class ComplexNumber {

    private double real;
    private double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){

        this.real+=real;
        this.imaginary+=imaginary;
    }

    public void add (ComplexNumber complexNumber){
        add(complexNumber.getReal(), complexNumber.getImaginary());

    }

    public void subtract(double real, double imaginary){

        this.real-=real;
        this.imaginary-=imaginary;
    }

    public void subtract (ComplexNumber complexNumber){
        subtract(complexNumber.getReal(), complexNumber.getImaginary());

    }

    public static void main(String[] args) {
        ComplexNumber complexNumber =new ComplexNumber(1.0, 1.0);

        complexNumber.add(1,1);

        System.out.println(complexNumber.getReal());
    }
}
