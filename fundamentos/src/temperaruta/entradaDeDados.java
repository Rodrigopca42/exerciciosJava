package temperaruta;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    
    public static void main(String[] args) {
        

        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);


        //Dados do 1º funcionário
        System.out.print("Digite o nome da 1º pessoa: ");
        String nome1 = tec.nextLine();

       System.out.print("Digite o salário da 1º pessoa: R$");
        float sal1 = tec.nextFloat();

        System.out.printf("O Funcionario é %s e ganha R$%.2f", nome1, sal1 );
        tec.close();
}
}