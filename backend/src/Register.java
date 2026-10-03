import java.util.Scanner;
import java.util.ArrayList;

public class Register {

    private final Scanner scanner;
    private final ArrayList<User> users = new ArrayList<>();
    private int proximoId = 1;

    public Register(Scanner scanner) {

        this.scanner = scanner;

        users.add(new User(proximoId++, "Norbit"));
        users.add(new User(proximoId++, "Fernanda"));
        users.add(new User(proximoId++, "Davi"));
        users.add(new User(proximoId++, "Arthur"));

    }

    public void signUp() {

        String name;

        while (true) {

            System.out.print("Digite o nome: ");
            name = scanner.nextLine();

            if (!name.isBlank()) {

                User user = new User(proximoId, name);

                users.add(user);
                proximoId++;

                System.out.print("Cadastrando usuario: " + name);
                break;
            } else {
                System.out.println("Nome invalido. Tente novamente.");
            }
        }
    }

    public void list() {

        if (users.isEmpty()) {
            System.out.print("Tem nada aqui tio");
            return;
        }

        System.out.println("Pegue a lista chefe...");

        for (User user : users) {
            System.out.println(user.id + "-" + user.name);
        }
    }

    public void edit() {

        System.out.println("back to the filter, patrão -_-");
    }

    public void delete() {
        System.out.print("Digite o ID a ser pulverizado: ");

        int id = scanner.nextInt();

        User findUser = null;

        for (User user : users) {

            if (user.id == id) {

                findUser = user;
                break;
            }
        }

        if (findUser !=null){

            System.out.println(findUser.name + " obliterado ^0^");
            users.remove(findUser);

        } else {
            System.out.println("ACERTA O ID PORRA");
        }

    }
}
