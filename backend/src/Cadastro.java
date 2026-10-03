import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    private final Scanner scanner;
    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;

    public Cadastro(Scanner scanner) {

        this.scanner = scanner;

        usuarios.add(new Usuario(proximoId++, "Norbit"));
        usuarios.add(new Usuario(proximoId++, "Fernanda"));
        usuarios.add(new Usuario(proximoId++, "Davi"));
        usuarios.add(new Usuario(proximoId++, "Arthur"));

    }

    public void signUp() {

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

        Usuario usuarioEncontrado = null;

        for (Usuario usuario : usuarios) {

            if (usuario.id == id) {

                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado!=null){

            System.out.println(usuarioEncontrado.nome + " obliterado ^0^");
            usuarios.remove(usuarioEncontrado);

        } else {
            System.out.println("ACERTA O ID PORRA"); /*tem que ajustar isso, ta com erro*/
        }

    }
}
