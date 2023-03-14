import java.util.*;

public class Libraric {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int op = 0, bookoption = 0;
        String login = "n", controle, menu = "n";

        Scanner sc = new Scanner(System.in);

        while (op != -1) {

            while (menu != "s") {
                System.out.println("Você possui login ? S/N");
                controle = sc.next();

                if (controle.equalsIgnoreCase("S")) {
                    while (!login.equals("logado")) {
                        login = biblioteca.login();
                    }
                    menu = "s";
                } else {
                    biblioteca.cadastrar_usuario();
                }
            }

            while (menu == "s") {
                System.out.println("[1] para editar perfil");
                System.out.println("[2] (ADMIN) para adicionar um livro ou um audiobook");
                System.out.println("[3] para locar um livro ou um audiobook");
                System.out.println("[6] mostrar livros disponíveis ou audiosbook's disponíveis");
                System.out.println("[7] (ADMIN) para remover um livro ou um audiobook");
                System.out.println("[10] para devolver um livro do acervo");
                System.out.println("[11] para verificar os livros locados");
                System.out.println("[12] (ADMIN) para ver quais livros foram devolvidos");
                System.out.println("[13] verificar se você possui multas pendentes");
                System.out.println("[14] (ADMIN) confirmar pagamento de multas pelos usuários");
                System.out.println("[15] (ADMIN) para verificar todas as contas cadastradas no Libraric");
                System.out.println("[16] para deslogar do Libraric");
                System.out.println("[17] para encerrar o programa");
                op = sc.nextInt();
                switch (op) {

                    case 1:
                        biblioteca.editar_perfil();
                        break;

                    case 2:
                        System.out.println("Para adicionar um livro digite 1, para adicionar um audiobook digite 2");
                        bookoption = sc.nextInt();
                        if(bookoption == 1){
                            biblioteca.add_livro();
                        }
                        else if(bookoption == 2){
                            biblioteca.add_audiobook();
                        }
                        else{
                            System.out.println("Opção inválida!");
                        }
                        biblioteca.add_livro();
                        break;

                    case 3:
                        System.out.println("Para locar um livro digite 1, para locar um audiobook digite 2");
                        bookoption = sc.nextInt();
                        if(bookoption == 1){
                            biblioteca.locar_livro();
                        }
                        else if(bookoption == 2){
                            biblioteca.locar_audio();
                        }
                        else{
                            System.out.println("Opção inválida!");
                        }
                        break;

                    case 4:
                        biblioteca.add_audiobook();
                        break;

                    case 5:
                        biblioteca.locar_audio();
                        break;

                    case 6:
                        System.out.println("Para mostrar os livros disponíveis digite 1, para mostrar os audiobooks disponíveis digite 2");
                        bookoption = sc.nextInt();
                        if(bookoption == 1){
                            biblioteca.mostrar_livros();
                        }
                        else if(bookoption == 2){
                            biblioteca.mostrar_audios();
                        }
                        else{
                            System.out.println("Opção inválida!");
                        }
                        break;

                    case 7:
                        System.out.println("Para mostrar os livros disponíveis digite 1, para mostrar os audiobooks disponíveis digite 2");
                        bookoption = sc.nextInt();
                        if(bookoption == 1){
                            biblioteca.remover_livro();
                        }
                        else if(bookoption == 2){
                            biblioteca.remover_audios();
                        }
                        else{
                            System.out.println("Opção inválida!");
                        }
                        break;

                    case 8:
                        break;

                    case 9:
                        biblioteca.remover_livro();
                        break;

                    case 10:
                        biblioteca.devolver_livro();
                        break;

                    case 11:
                        biblioteca.livros_locados();
                        break;

                    case 12:
                        biblioteca.livros_devolvidos();
                        break;

                    case 13:
                        biblioteca.verificar_multas();
                        break;

                    case 14:
                        biblioteca.multas_pagas();
                        break;

                    case 15:
                        biblioteca.listar_usuarios();
                        break;

                    case 16:
                        System.out.print("Deslogado\n");
                        menu = "n";
                        login = "deslogado";
                        break;

                    case 17:
                        op = -1;
                        menu = "n";
                        break;
                }
            }

        }
        sc.close();
    }
}
