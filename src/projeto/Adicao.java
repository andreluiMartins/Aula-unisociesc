package projeto;

//Classe Adicao: realiza a operação de soma, herda de Operacao
class Adicao extends Operacao {
 // Construtor vazio, chama implicitamente o construtor de Operacao
 public Adicao() {}

 // Sobrescreve o método calcula para somar os dois valores
 @Override
 public double calcula() {
     return valor1 + valor2; // Retorna a soma de valor1 e valor2
 }
}