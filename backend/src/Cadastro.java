import java.util.Scanner;

public class Cadastro {

    private Scanner scanner;

    public Cadastro(Scanner scanner) {
        this.scanner = scanner;
    }
    public void cadastrar() {

        String nome;

      while (true){
        System.out.println("Digite o nome: ");
        nome = scanner.nextLine();

        if (!nome.isBlank()) {
            System.out.println("Cadastrando usuario: " + nome);
            break;
        }
        else System.out.println("Nome invalido. Tente novamente.");
      }
    }
    public void listar() {
        System.out.println("Pegue a lista chefe...");
    }
    public void editar() {
        System.out.println("back to the filter, patrão -_-");
    }
    public void excluir() {
        System.out.println("Obliterado ^0^");
    }
}
