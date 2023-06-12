import java.util.Scanner;

public class Macaco {
    private String nome;
    private String estomago;

    public Macaco(String nome) {
        this.nome = nome;
        this.estomago = "";
    }

    public String getNome() {
        return nome;
    }

    public void comer(String alimento) {
        if (!estomago.isEmpty()) {
            estomago += ", ";
        }
        estomago += alimento;
    }

    public void verEstomago() {
        if (estomago.isEmpty()) {
            System.out.println(nome + " está de estômago vazio.");
        } else {
            System.out.println(nome + " consumiu esses alimentos: " + estomago);
        }
    }

    public void alimentarMacaco(Scanner scanner) {
        System.out.print("\nQuantos alimentos deseja dar para " + nome + "? ");
        int quantidadeAlimentos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeAlimentos; i++) {
            System.out.print("Digite o alimento " + (i + 1) + ": ");
            String alimento = scanner.nextLine();
            comer(alimento);
        }
    }
}
