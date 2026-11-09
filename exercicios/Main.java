import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== Exercícios de Java =====");
            System.out.println("1: Tabuada");
            System.out.println("2: Cálculo do IMC");
            System.out.println("3: Pares ou ímpares no intervalo");
            System.out.println("4: Divisões com resto zero");
            System.out.print("Escolha um exercício: ");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1 -> exercicio1(scanner);
                case 2 -> exercicio2(scanner);
                case 3 -> exercicio3(scanner);
                case 4 -> exercicio4(scanner);
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    // Lê um número e exibe a tabuada de 1 a 10.
    public static void exercicio1(Scanner scanner) {
        System.out.print("Insira um número de 1 a 10: ");
        int numero = scanner.nextInt();
        System.out.printf("===== Tabuada do %d =====%n", numero);

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.printf("%d x %d = %d%n", numero, multiplicador,
                    numero * multiplicador);
        }
    }

    // Calcula o IMC e apresenta a classificação correspondente.
    public static void exercicio2(Scanner scanner) {
        System.out.print("Insira a sua altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Insira o seu peso em kg: ");
        double peso = scanner.nextDouble();

        if (altura <= 0 || peso <= 0) {
            System.out.println("Altura e peso devem ser maiores que zero.");
            return;
        }

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25.0) {
            System.out.println("Você está com o peso ideal.");
        } else if (imc < 30.0) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc < 35.0) {
            System.out.println("Você está com obesidade grau I.");
        } else if (imc < 40.0) {
            System.out.println("Você está com obesidade grau II (severa).");
        } else {
            System.out.println("Você está com obesidade grau III (mórbida).");
        }
    }

    // Exibe os números pares ou ímpares do intervalo, em ordem decrescente.
    public static void exercicio3(Scanner scanner) {
        System.out.print("Insira o primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Insira um número maior que o primeiro: ");
        int segundo = scanner.nextInt();

        if (segundo <= primeiro) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.println("Escolha entre par ou ímpar:");
        System.out.println("1: ímpar");
        System.out.println("2: par");
        int escolha = scanner.nextInt();

        if (escolha != 1 && escolha != 2) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println(escolha == 2
                ? "Exibindo intervalo dos pares em ordem decrescente:"
                : "Exibindo intervalo dos ímpares em ordem decrescente:");

        for (int numero = segundo; ; numero--) {
            if ((escolha == 2 && numero % 2 == 0)
                    || (escolha == 1 && numero % 2 != 0)) {
                System.out.println(numero);
            }
            if (numero == primeiro) {
                break;
            }
        }
    }

    // Continua com múltiplos do número inicial e encerra no primeiro resto não zero.
    public static void exercicio4(Scanner scanner) {
        System.out.print("Insira um número inicial fixo: ");
        int inicial = scanner.nextInt();

        if (inicial == 0) {
            System.out.println("O número inicial não pode ser zero.");
            return;
        }

        while (true) {
            System.out.print("Insira um número para ser dividido: ");
            int numero = scanner.nextInt();

            if (numero < inicial) {
                System.out.println("Número ignorado!");
                continue;
            }

            if (numero % inicial != 0) {
                System.out.println("Divisão com resto maior que 0. Encerrando...");
                break;
            }

            System.out.println("Divisão com resto zero!");
        }
    }
}
