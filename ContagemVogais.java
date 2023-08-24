import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais na frase: " + contadorVogais);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        for (char letra : texto.toCharArray()) {
            if (isVogal(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean isVogal(char letra) {
        char lowerCase = Character.toLowerCase(letra);
        return lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u';
    }
}
