import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double primeirolado,segundolado, area, dobroA;

        System.out.println("digite o valor do primeiro lado:");
        primeirolado = entrada.nextDouble();
        System.out.println("digite o valor do segundo lado:");
        segundolado = entrada.nextDouble();
        area = primeirolado*segundolado;
        dobroA = Math.pow(area,2);

        System.out.println(" a area ao quadrado é: " + dobroA);
    }
}
