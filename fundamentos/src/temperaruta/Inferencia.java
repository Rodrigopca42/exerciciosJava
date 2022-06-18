package temperaruta;

import java.util.Date;
import java.util.Scanner;



public class Inferencia {
    
    public static void main(String[] args) {
        

        Date d = new Date();
        System.out.println(d);

        String s = "Bom dia";
          System.out.println(s.concat("!!!"));

       /*  var nome = "Rodrigo";
        var sobrenome = "Cardoso";
        var idade = 43;
        var salario = 3521.53;  

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f" ,nome, sobrenome, idade, salario); */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome :");
        teclado.nextLine();
        String nome = teclado.nextLine();
      

        System.out.println("Digite seu sobrenome :");
        teclado.nextLine();
        String sobrenome = teclado.nextLine();
        

        System.out.println("Digite sua idade :");
        int idade = teclado.nextInt();

        System.out.println("Digite seu salário : R$");
        float sal = teclado.nextFloat();

        System.out.printf("O funcionario %s %s tem %d de idade  e ganha R$ %.2f de salário por mês", nome, sobrenome, idade, sal );

        teclado.close();
    }
}
