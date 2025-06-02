// Exercício: Area do Prédio OO
//1. Escreva um programa em OO para calcular o preço do aluguel de todo um prédio comercial. 


// Cada andar do prédio tem um valor de metro quadrado diferente. 
public class Sala {
    double tamanho; // em metros quadrados

// Cada andar do prédio pode ter uma quantidade de salas diferentes.
    public Sala(double t) {
        tamanho = t;
    }
 
 // Cada sala pode ter um tamanho diferente.
    public double pegarTamanho() {
        return tamanho;
    }
}
