import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {
    protected double degree;
    protected String scale;

    Temperature(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temprature degree: ");
        try {
            setDegree(in.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }
        System.out.println("Enter the temprature scale:\n1- 'c' for celsius\n2- 'f' for fahrenheit\n3- 'k' for kelvin");
        try {
            setScale(in.next().charAt(0));
        }catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }

    }

    public void setDegree(double degree) throws InputMismatchException {
        this.degree = degree;
    }

    public double getDegree(){
        return this.degree;
    }

    public void setScale(char scale) throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        if(scale=='c'){
            this.scale = "Celsius";
        } else if (scale=='f') {
            this.scale= "Fahrenheit";
        } else if (scale=='k') {
            this.scale= "Kelvin";
        } else {
            System.out.println("Invalid input!\nPlease try again:");
            this.setScale(in.next().charAt(0));
        }
    }

    public String getScale(){
        return this.scale;
    }

    public void displyTemperature(){
        System.out.println("The current temperature is: " + this.degree + this.scale);
    }




}
