/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaanual;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MediaAnual {
    public static String aluno = "";
    public static double n1 = 0;
    public static double n2 = 0;
    public static double n3 = 0;
    public static double n4 = 0;
    public static double resultado = 0;
    public static Scanner teclado = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.print("Calculando a média anual das notas de um aluno");
        System.out.println("");
        System.out.print("Informe o nome do aluno: ");
        aluno = teclado.nextLine();
        System.out.print("Informe a primeira nota de " + aluno + ": ");
        n1 = teclado.nextInt();
        System.out.print("informe a segunda nota de " + aluno + ": ");
        n2 = teclado.nextInt();
        System.out.print("informe a terceira nota de " + aluno + ": ");
        n3 = teclado.nextInt();
        System.out.print("informe a quarta nota de " + aluno + ": ");
        n4 = teclado.nextInt();
        
        resultado = ((n1 + n2 + n3 + n4)/4);
        
        System.out.println("");
        System.out.println("A média de " + aluno + " é: " + df.format(resultado).toString());        
        


        
        
        
        // TODO code application logic here
    }
    
}
