package projeto;

import java.util.Scanner;

//Classe principal Main: contém o ponto de entrada do programa
public class Main {
 // Método main: ponto de entrada onde a execução começa
 public static void main(String[] args) {
     // Cria um objeto Scanner para ler entradas do usuário via System.in
     Scanner scanner = new Scanner(System.in);

     // Bloco try: tenta executar o código que pode gerar exceções
     try {
         // Solicita e lê o primeiro valor do usuário
         System.out.println("Digite o primeiro valor:");
         double v1 = scanner.nextDouble(); // Lê um número double

         // Solicita e lê o segundo valor do usuário
         System.out.println("Digite o segundo valor:");
         double v2 = scanner.nextDouble(); // Lê outro número double

         // Solicita e lê o operador (+ ou /)
         System.out.println("Digite o operador (+ ou /):");
         char operador = scanner.next().charAt(0); // Lê o primeiro caractere da entrada

         // Declara uma variável do tipo Operacao (polimorfismo)
         Operacao operacao;

         // Escolhe a operação com base no operador fornecido
         switch (operador) {
             case '+': // Se o operador for '+'
                 operacao = new Adicao(); // Instancia a classe Adicao
                 break;
             case '/': // Se o operador for '/'
                 operacao = new Divisao(); // Instancia a classe Divisao
                 break;
             default: // Se o operador não for reconhecido
                 throw new IllegalArgumentException("Erro: operador inválido."); // Lança exceção
         }

         // Define os valores nos atributos da instância usando setters
         operacao.setValor1(v1); // Atribui o primeiro valor
         operacao.setValor2(v2); // Atribui o segundo valor

         // Executa o cálculo chamando o método calcula da subclasse
         double resultado = operacao.calcula();

         // Exibe o resultado da operação
         System.out.println("Resultado da operação: " + resultado);

     } catch (IllegalArgumentException | ArithmeticException e) {
         // Captura exceções de operador inválido ou divisão por zero
         System.out.println("Erro ao calcular a operação: " + e.getMessage()); // Exibe mensagem de erro
     } finally {
         // Bloco finally: executado sempre, independentemente de exceções
         scanner.close(); // Fecha o Scanner para liberar recursos
     }
 }
}