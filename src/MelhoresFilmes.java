import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MelhoresFilmes {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://alura-imdb-api.herokuapp.com/movies";
        Requisicao requisicao = new Requisicao();
        String requisicaoResposta = requisicao.bodyRequisicao(url);


        ImpressaoTerminal impresao = new ImpressaoTerminal();
        impresao.imprimeResultado(requisicaoResposta);


    }
}
