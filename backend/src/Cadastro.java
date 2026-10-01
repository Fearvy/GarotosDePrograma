import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    private Scanner scanner;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;

    public Cadastro(Scanner scanner) {

        this.scanner = scanner;
    }

    public void cadastrar() {

        String nome;

        while (true) {

            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            if (!nome.isBlank()) {

                Usuario usuario = new Usuario(proximoId, nome);

                usuarios.add(usuario);
                proximoId++;

                System.out.print("Cadastrando usuario: " + nome);
                break;
            } else {
                System.out.println("Nome invalido. Tente novamente.");
            }
        }
    }

    public void listar() {

        if (usuarios.isEmpty()) {
            System.out.print("Tem nada aqui tio");
            return;
        }

        System.out.println("Pegue a lista chefe...");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.id + "-" + usuario.nome);
        }
    }

    public void editar() {

        System.out.println("back to the filter, patrão -_-");
    }

    public void excluir() {
        System.out.print("Digite o ID a ser pulverizado: ");

        int id = scanner.nextInt();

        for (Usuario usuario : usuarios) {

            if (usuario.id == id) {

                System.out.print(usuario.nome + " obliterado ^0^");
                usuarios.remove(usuario);
                break;
            } else {
                System.out.println("ACERTA O ID PORRA"); /*tem que ajustar isso, ta com erro*/
            }

        }
    }
}
