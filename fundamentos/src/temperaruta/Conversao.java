package temperaruta;

public class Conversao {
    public static void main(String[] args) {

        double Fahrenheit = 75.00;
        double Celsius = 28.15;
        final double x = 5.0;
        final double y = 9.0;
        final int z = 32;


        double conv = (Fahrenheit - z) * x / y;
        System.out.println("Temperatura em Celsius = °" + conv );

        double conv1 = y * Celsius / x + z;
        System.out.println("Temperatura em Fahrenheit = °" + conv1);

    }
}
