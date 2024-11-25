import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Disco");
            System.out.println("2. Listar Discos");
            System.out.println("3. Remover Disco");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Título do Disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de Lançamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome do Artista: ");
                    String nomeArtista = scanner.nextLine();
                    System.out.print("Gênero Musical: ");
                    String genero = scanner.nextLine();
                    Artista artista = new Artista(nomeArtista, genero);

                    Disco disco = new Disco(titulo, ano, artista);
                    System.out.println("Digite as faixas (digite 'fim' para encerrar): ");
                    while (true) {
                        String faixa = scanner.nextLine();
                        if (faixa.equalsIgnoreCase("fim")) break;
                        disco.adicionarFaixa(faixa);
                    }
                    catalogo.adicionarDisco(disco);
                    break;
                case 2:
                    catalogo.listarDiscos();
                    break;
                case 3:
                    System.out.print("Título do Disco a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    catalogo.removerDisco(tituloRemover);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
