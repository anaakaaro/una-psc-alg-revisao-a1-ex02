import java.util.Scanner;

public class Sonic {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int novosAliados, esperanca=0, medo=0, desafio1, desafio2, desafio3, confianca=0, desanimo=0, estrategias, determinacao=0, incerteza=0;
        double media;

        System.out.println("Quantos novos aliados Sonic, Knuckles e Tails conseguiram encontrar para ajudar na luta contra Shadow?");
        novosAliados = scanner.nextInt();

        if(novosAliados > 0){
            esperanca+= novosAliados*15;
        } else{
            medo+= 40;
        }
        //System.out.println(esperanca);
        //System.out.println(medo);

        System.out.println("Qual a pontuação obtida pela equipe no desafio 1: ");
        desafio1 = scanner.nextInt();

        System.out.println("Qual a pontuação obtida pela equipe no desafio 2: ");
        desafio2 = scanner.nextInt();

        System.out.println("Qual a pontuação obtida pela equipe no desafio 3: ");
        desafio3 = scanner.nextInt();

        media = (desafio1 + desafio2 + desafio3)/3;

        if(media >= 7){
            confianca += 60;
        } else{
            desanimo+= 60;
        }
        // System.out.println(confianca);
        // System.out.println(desanimo);

        System.out.println("Quantas das 12 estratégias a equipe conseguiu analisar completamente? ");
        estrategias = scanner.nextInt();


    }
}
