// 1 - Pacote
package fundamentos;
// 2 - Bibliotecas

import java.util.Objects;
import java.util.Scanner;

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // instanciar o objeto de leitura do console

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        String opcao = null;
        int area = 0; //receber o resultado dos cálculos de área

        while (!opcao.toUpperCase().equals("S")){
            System.out.println("Calcula o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Círculo");
        System.out.println("(5) - Fibonacci");
        System.out.println("(6) - Contagem Regressiva");
        System.out.println("(S) - Sair");
        opcao = entrada.nextLine(); // Leitura da opção
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaCirculo();
                break;
            case "5":
                fibonacci();
                break;
            case "6":
                regressiva();
                break;
            case "S":
                break;
            case "s":
                break;
            default:
                System.out.println("Opção inválida: " + opcao);

        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }
        System.out.println("Agradecemos pela preferência!");

}

    public static int calcularAreaDoQuadrado() {

        int lado; // área do quadrdado a ser calculado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt();  // Leitura do tamanho do lado

        // Desenhar quadrado

        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println(""); // Saltar linha
        return lado * lado; // retorna a área do quadrado

    }

    public static int calcularAreaDoRetangulo() {
        int ladoRetanguloMenor;
        int ladoRetanguloMaior;
        System.out.println("Digite o tamanho do lado Menor: ");
        ladoRetanguloMenor = entrada.nextInt();
        System.out.println("Digite o tamanho do lado Maior: ");
        ladoRetanguloMaior = entrada.nextInt();
        return ladoRetanguloMaior * ladoRetanguloMenor;
    }

    public static int calcularAreaDoTriangulo() {
        int comprimentoTriangulo;
        int alturaTriangulo;
        System.out.println("Digite o comprimento do triângulo: ");
        comprimentoTriangulo = entrada.nextInt();
        System.out.println("Digite a altura do triângulo: ");
        alturaTriangulo = entrada.nextInt();
        return (comprimentoTriangulo * alturaTriangulo) / 2;
    }

    public static int calcularAreaCirculo() {
        int calculoRaio;
        System.out.println("Digite o raio do circulo ");
        calculoRaio = entrada.nextInt();
        return (calculoRaio * 2) * 3;
    }

    public static void fibonacci() {
        System.out.println("Quantos números deseja calcular na sequencia?");
        byte numero = entrada.nextByte();
        switch (numero) {
            case 0:
                System.out.println("A sequência está vazia.");
                break;
            case 1:
                System.out.println("Sequência de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequência de Fibonacci: 1 ");

                for (int i = 2; i <= numero; i++) {
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }
    }

    public static void regressiva() {

        System.out.println("Começar a contagem a partir de qual número?");
        int numero = entrada.nextInt();
        System.out.println("Diminuindo de quantos em quantos nuúmeros por vez?");
        int decrescimo = entrada.nextInt();
        for (int i = numero; i >= 0; i-=decrescimo) {
            System.out.print(i +" ");

        }

    }

}