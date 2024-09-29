import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        // Perform conversion based on user choice
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                double celsiusToKelvin = scanner.nextDouble();
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(celsiusToKelvin));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
