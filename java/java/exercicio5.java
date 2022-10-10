import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double metros, centimetros;
        System.out.print("Digite a quantidade de metros?");
        metros = entrada.nextDouble();

        centimetros = metros * 100;

        System.out.printf("%.1f cm",centimetros);
    }
}
