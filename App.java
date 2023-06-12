import java.util.Scanner;

//Teste

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando o primeiro macaco...");
        System.out.print("Digite o nome do primeiro macaco: ");
        String nome1 = scanner.nextLine();
        Macaco macaco1 = new Macaco(nome1);

        System.out.println("\nCriando o segundo macaco...");
        System.out.print("Digite o nome do segundo macaco: ");
        String nome2 = scanner.nextLine();
        Macaco macaco2 = new Macaco(nome2);

        System.out.print("Quantos alimentos deseja dar para " + macaco1.getNome() + "? ");
        int quantidadeAlimentos1 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeAlimentos1; i++) {
            System.out.print("Digite o alimento " + (i + 1) + " para " + macaco1.getNome() + ": ");
            String alimento = scanner.nextLine();
            macaco1.comer(alimento);
        }

        System.out.print("Quantos alimentos deseja dar para " + macaco2.getNome() + "? ");
        int quantidadeAlimentos2 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeAlimentos2; i++) {
            System.out.print("Digite o alimento " + (i + 1) + " para " + macaco2.getNome() + ": ");
            String alimento = scanner.nextLine();
            macaco2.comer(alimento);
        }
        System.out.println("\nAlimentando os macacos...");

        System.out.println("\nVerificando o conteúdo do estômago dos macacos...");
        macaco1.verEstomago();
        macaco2.verEstomago();

        scanner.close();
    }
}
