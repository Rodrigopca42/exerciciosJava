package temperaruta;

import java.util.Scanner;

public class Conversao {
    

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double Fahrenheit = teclado.nextDouble();
        double Celsius = 28.15;
        final double x = 5.0;
        final double y = 9.0;
        final int z = 32;


        double conv = (Fahrenheit - z) * x / y;

        System.out.printf("Temperatura em Celsius = "+ conv +"°C%n");

        teclado.close();
        double conv1 = y * Celsius / x + z;
        System.out.println("Temperatura em Fahrenheit = °" + conv1);

    }
}
