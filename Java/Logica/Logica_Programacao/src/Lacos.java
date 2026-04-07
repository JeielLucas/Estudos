import java.util.Scanner;

public class Lacos {
    Scanner sc = new Scanner(System.in);

    void lacoFor(int stop){
        for(int i = 0; i<=stop; i++){
            System.out.println(i);
        }
    }

    void lacoWhile(){
        boolean parada = false;
        do{
            System.out.println("Você quer parar o programa? ");
            String resposta = sc.next();
            if(resposta.equals("Sim")){
                parada = true;
            }
        }while(!parada);
    }

}
