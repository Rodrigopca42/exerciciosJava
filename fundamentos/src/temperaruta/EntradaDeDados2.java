package temperaruta;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tecla = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = tecla.nextLine();

        System.out.println("Digite a nota do 1º bimestre: ");
        double n1 = tecla.nextDouble();

        System.out.println("Digite a nota do 2º bimestre: ");
        double n2 = tecla.nextDouble();

        System.out.println("Digite a nota do 3º bimestre: ");
        double n3 = tecla.nextDouble();

        System.out.println("Digite a nota do 4º bimestre: ");
        double n4 = tecla.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        tecla.close();

        if (media >= 6){
            System.out.printf("Nome do Aluno: %s %n", nome);
            System.out.printf("Média do Aluno: %.2f %n", media);
            System.out.print("****PARABÉNS, VOCÊ ESTÁ APROVADO****");
        }
            else{
                System.out.printf("Nome do Aluno: %s %n", nome);
                System.out.printf("Média do Aluno: %.2f %n", media);
                System.out.print("VOCÊ NÃO OBTEVE MÉDIA PARA APROVAÇÃO!");
            }

        

    }
}
