import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1,nota2,nota3,nota4, notabimestre1, notabimestre2,media;

        System.out.println("digite a primeira nota");
        nota1 = entrada.nextDouble();

        System.out.println("digite a segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("digite a terceira nota:");
        nota3 = entrada.nextDouble();

        System.out.println("digite a quarta nota:");
        nota4 = entrada.nextDouble();

        notabimestre1 = (nota1 + nota2)/2;
        notabimestre2 = (nota3 + nota4)/2;

        media = (notabimestre1 + notabimestre2)/2;

        System.out.println("Nota no primeiro bimestre é: " +notabimestre1);
        System.out.println("Nota no segundo bimestre é: " +notabimestre2);
        System.out.println("A média do aluno (a) é: " +media);

    }
}
