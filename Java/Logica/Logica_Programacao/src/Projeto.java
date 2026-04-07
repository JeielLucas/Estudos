import java.util.Scanner;

public class Projeto {
    Scanner sc = new Scanner(System.in);

    String parImpar(int num){
        String result = num % 2 == 0 ? "Par" : "Impar";
        return result;
    }

    double media(double[] notas){
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void tabuada(){
        System.out.print("Qual número você gostaria de ver a tabuada? ");
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    boolean validadorSenha(String password){

        if(password.length() < 8){
            return false;
        }

        boolean maisculuca = false, minuscula = false, simbolo = false, numero = false;

        for(int i = 0; i < password.length(); i++){
            char let = password.charAt(i);

            if(Character.isUpperCase(let)) maisculuca = true;
            else if (Character.isLowerCase(let)) minuscula = true;
            else if (Character.isDigit(let)) numero = true;
            else simbolo = true;
        }

        return maisculuca && minuscula && simbolo && numero;
    }

}
