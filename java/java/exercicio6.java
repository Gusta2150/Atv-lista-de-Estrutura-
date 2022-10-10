import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;

        System.out.println("Digite valor de raio da circunferencia: ");
        raio = new Scanner(System.in).nextFloat();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O espaço da circunferencia é: %.2f", area);
    }
}
