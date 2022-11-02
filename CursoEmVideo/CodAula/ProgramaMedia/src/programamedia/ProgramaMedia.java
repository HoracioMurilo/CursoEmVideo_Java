    package programamedia;

    import java.util.Scanner;

    public class ProgramaMedia {


        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Primeira Nota: ");
            float n1 = teclado.nextFloat();
            System.out.print("Segunda Nota: ");
            float n2 = teclado.nextFloat();
            float m = (n1 + n2)/2;
            System.out.println("Sua média foi de " + m);
            if (m>9) {
                System.out.println("Parabens Pequeno Gafanhoto!!!");
            } else {
                System.out.println("Se esfoce mais sua média foi abaixo de 9");
            }
        }

    }
