package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExpection extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExpection(String s) {
        this.mensagem = mensagem;
    }
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
