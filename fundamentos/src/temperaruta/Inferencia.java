package temperaruta;

import java.util.Date;



public class Inferencia {
    
    public static void main(String[] args) {
        

        Date d = new Date();
        System.out.println(d);

        String s = "Bom dia";
          System.out.println(s.concat("!!!"));

        var nome = "Rodrigo";
        var sobrenome = "Cardoso";
        var idade = 43;
        var salario = 3521.53;

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f" ,nome, sobrenome, idade, salario);


    }
}
