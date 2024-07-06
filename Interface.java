import java.util.Scanner;

public class Interface {
    public static void display() {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            TemperatureConverter tc = new TemperatureConverter();
            System.out.println();
            System.out.println("Enter the conversion you wish to perform:");
            if (tc.getScale().equals("Celsius")) {
                System.out.println("1- Celsius to Fahrenheit\n2- Celsius to Kelvin");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current temperature in Fahrenheit is: " + tc.CelsiusToFahrenheit(tc.getDegree(), tc.getScale()));
                        break;
                    case 2:
                        System.out.println("Current temperature in Kelvin is: " + tc.CelsiusToKelvin(tc.getDegree(), tc.getScale()));
                        break;
                    default:
                        System.out.println("Invalid input!\nPlease try again\n---------------------------------------------------");
                        System.out.println();
                        display();
                }
            } else if (tc.getScale().equals("Fahrenheit")) {
                System.out.println("1- Fahrenheit to Celsius\n2- Fahrenheit to Kelvin");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current temperature in Celsius is: " + tc.FahrenheitToCelsius(tc.getDegree(), tc.getScale()));
                        break;
                    case 2:
                        System.out.println("Current temperature in Kelvin is: " + tc.FahrenheitToKevin(tc.getDegree(), tc.getScale()));
                        break;
                    default:
                        System.out.println("Invalid input!\nPlease try again\n---------------------------------------------------");
                        System.out.println();
                        display();
                }
            } else if (tc.getScale().equals("Kelvin")) {
                System.out.println("1- Kelvin to Celsius\n2- Kelvin to Fahrenheit");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Current temperature in Celsius is: " + tc.KelvinToCelsius(tc.getDegree(), tc.getScale()));
                        break;
                    case 2:
                        System.out.println("Current temperature in Fahrenheit is: " + tc.KelvinToFahrenheit(tc.getDegree(), tc.getScale()));
                        break;
                    default:
                        System.out.println("Invalid input!\nPlease try again\n---------------------------------------------------");
                        System.out.println();
                        display();
                }
            }
            System.out.println("\n---------------------------------------------------\n");
            System.out.println("Do you want to exit\n1- 'y' for Yes\n2- 'n' for No");
            char exitChoice = in.next().charAt(0);
            switch (exitChoice){
                case 'y':
                    exit = true;
                    break;
                case 'n':
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        display();
    }

}
