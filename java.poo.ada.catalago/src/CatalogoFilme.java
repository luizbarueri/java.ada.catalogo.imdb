import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CatalogoFilme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeFilme = "Busca da felicidade";
        String nomeDiretor = "Stive";
        LocalDate  dataLancamento = LocalDate.of(2010,12,12);
        double orcamento = 200000;
        String descricao = "Estagio da Bolsa de Valores - Emprego";
        String[] listaAtores = {"Ana", "Marcos", "Valquiria"};

        //Cria objeto Filme
        Filme filme = new Filme(listaAtores);
        //Cria Lista dinamica para armazenar novos filmes
        List<Filme> catalogoDeFilmes = new <Filme>ArrayList();

        System.out.println("******* CADASTRE  3 - FILMES *******");

        for (int i = 1; i < 4; i++) {
            System.out.println("Nome do filme: ");
            String nomeNovoFilme = scanner.nextLine();

            filme = new Filme(listaAtores);

            filme.setNomeFilme(nomeNovoFilme);
            filme.setNomeDiretor(nomeDiretor);
            filme.setDataLancamento(dataLancamento);
            filme.setOrcamento(orcamento);
            filme.setDescricao(descricao);

            catalogoDeFilmes.add(filme);
        }

        //Lista os filmes cadastrados
        for (Filme item : catalogoDeFilmes) {
            System.out.println("Cadastrado novo Filme:");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Filme:     " + item.getNomeFilme());
            System.out.println("Diretor:   " + item.getNomeDiretor());
            System.out.println("Data Lan:  " + item.getDataLancamento());
            System.out.println("Orçamento: " + item.getOrcamento());
            System.out.println("Descrição: " + item.getDescricao());
            System.out.println("Atores:    " + Arrays.toString(item.getListaAtores()));
            System.out.println("==================================================================");
        }

        //Procurar um filme no catálogo
        System.out.println("Procurar FILME por nome:");
        System.out.println("====================================================");
        System.out.println("Nome do filme:");
        nomeFilme = scanner.nextLine();

        scanner.close();
    }

   }
