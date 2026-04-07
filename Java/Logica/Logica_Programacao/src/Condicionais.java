import java.util.Scanner;

public class Condicionais {
    Scanner sc = new Scanner(System.in);

    public void ifElse(){
        System.out.println("Olá, bem vindo(a) ao detran, você deseja tirar sua primeira habilitação? (s ou n)");
        String resposta = sc.next();
        if(resposta.equals("s")){
            System.out.println("Ótimo, para isso preciso que você me diga sua idade: ");
            int idade = sc.nextInt();

            if(idade >= 18){
                System.out.println("Tudo certo com sua habilitação, dirija com cuidado");
            }else{
                System.out.println("Que pena, você ainda não tem idade para dirigir");
            }
        }else if(resposta.equals("n")){
            System.out.println("Certo, então o setor que você deseja está seguindo aquele corredor ali");
        }else{
            System.out.println("Resposta não compreendida, por favor, tente novamenta mais tarde");
        }
    }

    void switchCase(){
        System.out.println("1- Plano R$25,00\n2- Plano R$35,00\n3- Plano R$45,00");
        System.out.println("Qual plano de celular você quer contratar? ");
        int plano = sc.nextInt();
        switch(plano){
            case 1:
                System.out.println("Ótimo, seu plano conta com ligações ilimitadas");
                break;
            case 2:
                System.out.println("Ótimo, seu plano conta com ligações ilimitadas e sms ilimitados");
                break;
            case 3:
                System.out.println("Ótimo, seu plano conta com ligações e sms ilimitados e ainda tem 10GB de internet para usar como quiser");
                break;
            default:
                System.out.println("Ops, opção inválida");
        }
    }
}
