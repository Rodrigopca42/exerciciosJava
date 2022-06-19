package temperaruta;

import java.util.Scanner;

public class incerindoDados {
    

    public static void main(String[] args) throws Exception{
        
        Scanner tec = new Scanner(System.in);

        /*System.out.print("Digite um número: ");
            int num = tec.nextInt();

            System.out.print("Digite outro número: ");
            int num1 = tec.nextInt();


            int soma = num + num1;

            System.out.print(soma);
         */
            tec.useDelimiter("[\r\n]+");

            System.out.println("Digite o seu nome: ");
            String nome = tec.nextLine();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = tec.nextLine();

            System.out.printf("O funcionario %s %s é nosso funcionário. ",nome, sobrenome );

            tec.close();


    }
}
