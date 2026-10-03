import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(scanner);

        int opcao = -1;

        while (opcao !=0) {

            System.out.println("=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    cadastro.signUp();
                    break;

                case 2:
                    cadastro.listar();
                    break;

                case 3:
                    cadastro.editar();
                    break;

                case 4:
                    cadastro.excluir();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida.");
            }


        }

        scanner.close();

    }

}