package iphonedio;
import iphonedio.iphone.Iphone;
import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá, seja bem-vindo a Mula Store! Aqui a gente só vende Iphone 2007\n");
        int seletorModelo;
        do{
        System.out.println("Qual modelo de aparelho você deseja?");
        System.out.println("1 - 4GB");
        System.out.println("2 - 8GB");
        seletorModelo = scanner.nextInt();
        switch(seletorModelo){
            case 1 -> iphone.setModelo("4GB");
            
            case 2 -> iphone.setModelo("8GB");
            
            default -> System.out.println("Selecione uma opção válida!");
        }
        }while(seletorModelo < 1 || seletorModelo > 2);
        
        System.out.println("\nÓtimo, agora selecione a cor do seu Iphone!");
        int seletorCor;
        do{
            System.out.println("1 - Preto");
            System.out.println("2 - Branco");
            seletorCor = scanner.nextInt();
            switch(seletorCor){
                case 1 -> iphone.setCor("Preto");
                
                case 2 -> iphone.setCor("Branco");
                
                default -> System.out.println("Selecione uma opção válida!");
    
            }
        }while(seletorCor < 1 || seletorCor > 2);
        
        String modeloIphone = iphone.getModelo();
        String corIphone = iphone.getCor();
        
        System.out.println("\nParabéns, você comprou um Iphone " + corIphone + " modelo " + modeloIphone);
        
        iphone.ligar("(11) 95870-8287");
        
    }
    
}
