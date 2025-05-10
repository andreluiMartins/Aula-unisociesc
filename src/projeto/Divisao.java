package projeto;
//Classe Divisao: realiza a operação de divisão, herda de Operacao
class Divisao extends Operacao {
 // Construtor vazio, chama implicitamente o construtor de Operacao
 public Divisao() {}

 // Sobrescreve o método calcula para dividir os dois valores
 @Override
 public double calcula() {
     // Verifica se o divisor é zero para evitar erro matemático
     if (valor2 == 0) {
         throw new ArithmeticException("Erro: divisão por zero não é permitida."); // Lança exceção
     }
     return valor1 / valor2; // Retorna o resultado da divisão
 }
}