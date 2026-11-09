import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("===== Exercícios de Java =====");
        System.out.println("1: Tabuada");
        System.out.println("2: Cálculo do IMC");
        System.out.println("3: Pares ou ímpares");
        System.out.println("4: Divisão com resto zero");
        System.out.println("Escolha um exercício: ");

        int escolha = System.in.read() - '0';
        switch (escolha) {
            case 1:
                exercicio1();
                break;
            case 2:
                exercicio2();
                break;
            case 3:
                exercicio3();
                break;
            case 4:
                exercicio4();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void exercicio1 () {
        var scanner = new Scanner (System.in);
        System.out.println("Insira um número de 1 à 10: ");
        var num = scanner.nextInt();
        System.out.printf("===== Tabuada do %s =====\n", num);
        for (var i = 1; i <= 10; i++) {
            var res = num * i;
            System.out.printf("%s x %s = %s\n", num, i, res);
        }
    }

    public static void exercicio2 () {
        var scan = new Scanner(System.in);
        System.out.println("Insira a sua altura: ");
        float altura = Float.parseFloat(scan.next());
        System.out.println("Insira o seu peso (em kg): ");
        var peso = scan.nextInt();
        float imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %s\n", imc);
        if (imc <= 18.5) {
            System.out.println("Você está baixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está com o peso ideal.");
        } else if (imc < 29.9) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc < 34.9) {
            System.out.println("Você está com obesidade grau I.");
        } else if (imc < 39.9) {
            System.out.println("Você está com obesidade grau II (Severa).");
        } else {
            System.out.println("Você está com obesidade grau III (Mórbida).");
            }
        }

    public static void exercicio3 () {
        var scan = new Scanner(System.in);
        System.out.println("===== Par ou Ímpar =====");
        System.out.println("Insira um número: ");
        var num1 = scan.nextInt();
        System.out.println("Insira um número maior que o primeiro: ");
        var num2 = scan.nextInt();
        System.out.println("Escolha entre par ou ímpar: ");
        System.out.println("1: ímpar");
        System.out.println("2: par");
        var escolha = scan.nextInt();
        if (escolha == 2) {
            System.out.println("Exibindo intervalo dos pares");
            for (var i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (escolha == 1) {
            System.out.println("Exibindo intervalo dos ímpares");
            for (var i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void exercicio4 () {
        var scan = new Scanner(System.in);

        System.out.println("Insira um número inicial fixo: ");
        var num1 = scan.nextInt();

        if (num1 == 0) {
            System.out.println("O número inicial não pode ser zero.");
            return;
        }

        while (true) {
            System.out.println("Insira um número para ser divido: ");
            var num2 = scan.nextInt();

            if (num2 < num1) {
                System.out.println("Número ignorado!");
                continue;
            }

            if (num2 % num1 != 0) {
                    System.out.println("Divisão com resto maior que 0. Encerrando...");
                    break;
            }

            System.out.println("Divisão com resto zero!");
            }
        }
}
