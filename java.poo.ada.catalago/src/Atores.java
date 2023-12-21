import java.util.Arrays;

public class Atores {
    String[] listaAtores;

    public Atores(String[] listaAtores) {
        this.listaAtores = listaAtores;
    }
    public String[] getListaAtores() {
        return this.listaAtores;
    }

    @Override
    public String toString() {
        return  Arrays.toString(listaAtores);
    }
}
