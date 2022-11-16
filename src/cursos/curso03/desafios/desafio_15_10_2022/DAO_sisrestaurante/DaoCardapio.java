package cursos.curso03.desafios.desafio_15_10_2022.DAO_sisrestaurante;

public class DaoCardapio {
    private String nomeCardapio;
    private double precoCardapio;
    private String descricaoCardapio;

    public DaoCardapio(){
    }

    public DaoCardapio(String nomeCardapio, double precoCardapio, String descricaoCardapio) {
        this.nomeCardapio = nomeCardapio;
        this.precoCardapio = precoCardapio;
        this.descricaoCardapio = descricaoCardapio;
    }

    public String getNomeCardapio() {
        return nomeCardapio;
    }

    public void setNomeCardapio(String nomeCardapio) {
        this.nomeCardapio = nomeCardapio;
    }

    public double getPrecoCardapio() {
        return precoCardapio;
    }

    public void setPrecoCardapio(double precoCardapio) {
        this.precoCardapio = precoCardapio;
    }

    public String getDescricaoCardapio() {
        return descricaoCardapio;
    }

    public void setDescricaoCardapio(String descricaoCardapio) {
        this.descricaoCardapio = descricaoCardapio;
    }

}
