import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int tentativas = 0;
    public static void main(String[] args)
    {

        Random rn= new Random();

        int palpite = 0;


        int NumeroRn = rn.nextInt(10);

        do{

            palpite = verificacao(NumeroRn);

        }while(NumeroRn!=palpite);

        System.out.println("O número correto era "+NumeroRn+" e você acertou o número em: "+tentativas);



    }

    public static int verificacao(int NumeroRn){

        int palpite=0;

        System.out.println("Informe o seu palpite: ");

        palpite = sc.nextInt();

        if(palpite>NumeroRn){

            System.out.println("Seu palpite é maior que o número");
            tentativas++;

        }
        if(palpite<NumeroRn){

            System.out.println("Seu palpite é menor que o número");
            tentativas++;

        }


        return palpite;
    }


}