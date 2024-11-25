import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Disco> discos;

    public Catalogo() {
        this.discos = new ArrayList<>();
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco disponível.");
            return;
        }
        for (Disco disco : discos) {
            System.out.println(disco);
            System.out.println("-------------------");
        }
    }

    public Disco buscarDisco(String titulo) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                return disco;
            }
        }
        return null;
    }
}
