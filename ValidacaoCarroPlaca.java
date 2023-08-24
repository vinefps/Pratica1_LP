import java.util.Scanner;

public class ValidacaoCarroPlaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o ano de fabricação do carro: ");
        int anoFabricacao = scanner.nextInt();

        // Validar a situação do carro com base no ano de fabricação
        String situacaoCarro;
        if (anoFabricacao < 2010) {
            situacaoCarro = "Carro Velho";
        } else if (anoFabricacao >= 2011 && anoFabricacao <= 2021) {
            situacaoCarro = "Carro Semi novo";
        } else if (anoFabricacao == 2022) {
            situacaoCarro = "Carro Novo";
        } else {
            situacaoCarro = "Ano inválido";
        }

        // Substituir vogais na placa por *
        String placaFormatada = placa.replaceAll("[aeiouAEIOU]", "*");

        System.out.println("Situação do carro: " + situacaoCarro);
        System.out.println("Placa formatada: " + placaFormatada);

        scanner.close();
    }
}
