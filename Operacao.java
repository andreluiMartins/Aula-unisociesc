package projeto;

//Importa a classe Scanner para ler entradas do usuário
import java.util.Scanner;

//Classe abstrata Operacao: define a estrutura base para operações matemáticas
abstract class Operacao {
 // Atributos protegidos para os dois valores da operação
 protected double valor1; // Primeiro operando
 protected double valor2; // Segundo operando

 // Construtor vazio, necessário para inicializar objetos das subclasses
 public Operacao() {}

 // Método getter para obter o valor de valor1
 public double getValor1() { 
     return valor1; 
 }

 // Método setter para definir o valor de valor1
 public void setValor1(double valor1) { 
     this.valor1 = valor1; // "this" diferencia o atributo da variável local
 }

 // Método getter para obter o valor de valor2
 public double getValor2() { 
     return valor2; 
 }

 // Método setter para definir o valor de valor2
 public void setValor2(double valor2) { 
     this.valor2 = valor2; 
 }

 // Método abstrato que as subclasses devem implementar
 public abstract double calcula(); // Define o contrato para o cálculo
}