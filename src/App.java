import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero, resultado, contador;

        System.out.println();
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        System.out.println();
        System.out.println("Seus 20 primeiros multiplos são: ");
        for (contador = 1; contador <= 20; contador++) {
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + "=" + resultado);
        }
    
    }
}
