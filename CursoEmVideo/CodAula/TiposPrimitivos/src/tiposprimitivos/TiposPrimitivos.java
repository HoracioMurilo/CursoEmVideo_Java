package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.print("A nota do " + nome + " é " + nota + "\n");
        System.out.println("A nota do " + nome + " é " + nota);
        System.out.printf("A nota do %s é %.2f  \n",nome, nota);
        System.out.format("A nota do %s é %.2f  \n",nome, nota);
    }
    
}
