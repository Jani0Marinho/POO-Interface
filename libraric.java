import java.util.*;

public class libraric {
    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca();
        int op = 0;
        String login = "n", controle, menu = "n";

        try (Scanner sc = new Scanner(System.in)) {
            while (op != -1) {

                while (menu != "s") {
                    System.out.println("Você possui login ? S/N");
                    controle = sc.next();

                    if (controle.equalsIgnoreCase("S")) {
                        login = biblioteca.login();
                        if(login == "logado"){
                            menu = "s";
                        }
                        else{
                            System.out.println("Tente novamente!\n");
                            login = biblioteca.login();
                                if(login == "logado"){
                                    menu = "s";
                                }
                                else{
                                    System.out.println("Verifique suas informações e tente novamente mais tarde!\n");
                                }
                        }
                    } else {
                        biblioteca.cadastrar_usuario();
                    }
                }

                while (menu == "s") {
                    System.out.println(
                            "[1] para editar perfil\n[2] (ADMIN) para adicionar um livro\n[3] para verificar livros disponíveis\n[4] (ADMIN) para remover um livro do acervo\n[5] para locar um livro do acervo\n[6] para devolver um livro ao acervo\n[7] para ver quais livros você locou\n[8] (ADMIN) para ver quais livros os usuários notificaram devolução\n[9] verificar se você possui multas pendentes\n[10] (ADMIN) confirmar pagamento de multas pelos usuários\n[11] (ADMIN) para verificar todas as contas cadastradas no Libraric\n[12] para deslogar do Libraric\n[13] para encerrar o programa\n");
                    op = sc.nextInt();

                    switch (op) {
                        
                        case 1:
                            biblioteca.editar_perfil();
                            break;

                        case 2:
                            biblioteca.add_livro();
                            break;

                        case 3:
                            biblioteca.mostrar_livros();
                            break;

                        case 4:
                            biblioteca.remover_livro();
                            break;

                        case 5:
                            biblioteca.locar_livro();
                            break;

                        case 6:
                            biblioteca.devolver_livro();
                            break;

                        case 7:
                            biblioteca.livros_locados();
                            break;

                        case 8:
                            biblioteca.livros_devolvidos();
                            break;

                        case 9:
                            biblioteca.verificar_multas();
                            break;

                        case 10:
                            biblioteca.multas_pagas();
                            break;

                        case 11:
                            biblioteca.listar_usuarios();
                            break;

                        case 12:
                            System.out.println("Deslogado\n");
                            menu = "n";
                            login = "deslogado";
                            break;

                        case 13:
                            op = -1;
                            menu = "n";
                            break;
                    }
                }

            }
        }
    }
}
