import java.util.Scanner;

public class Variaveis {

    Scanner sc = new Scanner(System.in);

    int idade;
    String name;
    double salario;

    String nome(){
        System.out.print("Olá, qual seu nome? ");
        return name = sc.next();
    }

    int idade(){
        System.out.printf("%s, quantos anos você tem? ", name);
        return idade = sc.nextInt();
    }

    double salario(){
        System.out.printf("%s, você tem %d anos, e qual o seu salário? ", name, idade);
        return salario = sc.nextDouble();
    }

    void informacoes(){
        nome();
        idade();
        salario();
        System.out.printf("%s tem %d anos e recebe %.2f de salário", name, idade, salario);
    }

    void operacoes(){
        System.out.println(3+5);
        System.out.println(14-4);
        System.out.println(12*3);
        System.out.println(144/12);
        System.out.println(3%2);
    }

}
