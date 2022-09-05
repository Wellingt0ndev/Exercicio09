package exercicio09;

import java.util.Scanner;

/**
 *
 * @author Wellington F
 */
public class Exercicio09 {

    public static void main(String[] args) {
        String nome;
        float nota1;
        float nota2;
        float nota3;
        double media;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.printf("O aluno %s está aprovado com média %.2f\n",nome, media);
        } else if (media <= 5) {
            System.out.printf("O aluno %s está reprovado com média %.2f\n",nome, media);
        } else {
            System.out.printf("O aluno %s está de recuperação com média %.2f\n",nome, media);
        }

    }

}
