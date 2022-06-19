package temperaruta;

import java.util.Scanner;

public class entradaDeDados {
    
    public static void main(String[] args) throws Exception{
        
        Scanner tec = new Scanner(System.in);

        /* 
        double sal1, sal2;
        String nome1, nome2;
        int idade1, idade2;
        String sexo1, sexo2;
        */
00
        //Dados do 1º funcionário
        System.out.print("Digite o nome da 1º pessoa: ");
        String nome1 = tec.nextLine();

       System.out.print("Digite o salário da 1º pessoa: R$");
        double sal1 = tec.nextDouble();

        System.out.print("Digite a idade da 1º pessoa: ");
        int idade1 = tec.nextInt();

        System.out.print("Digite o sexo da 1º pessoa :");
        tec.nextLine();
        String sexo1 = tec.nextLine();


        //Dados do 2º funcionário
        System.out.print("Digite o nome da 2º pessoa: ");
        String nome2 = tec.nextLine();

       System.out.print("Digite o salário da 2º pessoa: R$");
        double sal2 = tec.nextDouble();

        System.out.print("Digite a idade da 2º pessoa: ");
        int idade2 = tec.nextInt();

        System.out.print("Digite o sexo da 2º pessoa :");
        tec.nextLine();
        String sexo2 = tec.nextLine();
}
}