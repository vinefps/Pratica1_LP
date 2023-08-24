import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        System.out.print("Digite o consumo do veículo (em km/l): ");
        double consumoVeiculo = scanner.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double consumoCombustivel = distancia / consumoVeiculo;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Consumo de combustível: " + consumoCombustivel + " litros");

        scanner.close();
    }
}
