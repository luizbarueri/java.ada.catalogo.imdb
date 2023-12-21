import java.time.LocalDate;
import java.util.Arrays;

public class Filme extends Atores{
    //propriedades
    private String nomeFilme;
    private String nomeDiretor;
    private LocalDate dataLancamento;
    private Double orcamento;
    private String descricao;
    private String[] listaAtores;


    public Filme(String[] listaAtores) {
        super(listaAtores);
    }

    //GET SET
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(String[] listaAtores) {
        this.listaAtores = listaAtores;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nomeFilme='" + nomeFilme + '\'' +
                ", nomeDiretor='" + nomeDiretor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", orcamento=" + orcamento +
                ", descricao='" + descricao + '\'' +
                ", listaAtores=" + Arrays.toString(listaAtores) +
                '}';
    }
}
