import java.util.List;
import java.util.Map;

public class ImpressaoTerminal {

    public void imprimeResultado(String requisicaoResposta) {


        var parser = new JsonParser();

        List<Map<String, String>> listaDeFilmes = parser.parse(requisicaoResposta);

        for (Map<String,String> filme : listaDeFilmes) {

            double nota = Double.parseDouble(filme.get("imDbRating"));
            double notaRound = Math.round(nota);


            System.out.println("\u001b[30;1m \u001b[43;1m 📽️ " + filme.get("title") + " \u001b[m");
            System.out.println("\u001b[30m \u001b[47m 🖼️ Baixar pôster " + filme.get("image") + " \u001b[m");
            for (int i = 0; i < notaRound; i++) {
                System.out.print("\uD83D\uDD25");
            }
            System.out.println();
            System.out.println();
        }
    }




}
