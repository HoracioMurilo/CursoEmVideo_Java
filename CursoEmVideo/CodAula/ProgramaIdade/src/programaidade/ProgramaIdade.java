/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;
import java.util.Scanner;

/**
 *
 * @author SQA CONTABIL - M.H.C
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Que ano você nasceu? ");
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2022-nasc;
        
        System.out.println("Sua idade é " + i + " anos");
        if ( i >= 18 ) {
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Menor de Idade");
        }
    }
    
}
