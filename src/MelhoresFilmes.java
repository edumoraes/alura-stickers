import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MelhoresFilmes {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Conexão HTTP
        String url = "https://alura-imdb-api.herokuapp.com/movies";
        Requisicao requisicao = new Requisicao();
        String requisicaoResposta = requisicao.bodyRequisicao(url);

        //parser
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(requisicaoResposta);

        //exibir e manipular
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }
    }
}
