import java.util.Scanner;

public class execicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double Fahrenheit, Celsius;


        System.out.print(" Digite a temperatura do Fahrenheit:");
        Fahrenheit = entrada.nextDouble();

        Celsius = 5 * ( Fahrenheit -32) / 9;

        System.out.print(" A temperatura é " + Celsius + "ºc");
    }
}
