/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author SQA CONTABIL - M.H.C
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("Á média é igual a: " + m);
        */
        
        /*
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        int numero2 = 5;
        numero2--;
        System.out.println(numero2);
        
        // PRÉ INCREMENTO
        int numero3 = 5;
        int valor = 5 + ++numero3;
        System.out.println(valor);
        
        // PÓS INCREMENTO
        int numero4 = 5;
        int valor1 = 5 + numero4++;
        System.out.println(valor1);
        System.out.println(numero4);
        */
        
        /*int number = 5;
        int valor = 5;
        int number += valor;*/
        
        /*int x = 4;
        x *= 2; // x = x +2;
        System.out.println(x);*/
        
        //Arredondamento Para Baixa
        /*float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);*/
        
        //Arredondamento Para Cima
        /*float v = 8.1f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);*/
        
        //Arredondamento Aritimetico
        /*float v = 8.5f;
        int ar = (int) Math.round(v);
        System.out.println(ar);*/
        
        double ale = Math.random();
        int n = (int) (1 + ale * (100-1)); // aleatorio entre 1 e 100
        System.out.println(ale);
        System.out.println(n);
        
    }
    
}
