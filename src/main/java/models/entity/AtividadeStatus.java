package models.entity;
/*
 * Enum responsável por guardar o status da Atividade
 * 
 * 
 */
public enum AtividadeStatus {
    AFAZER(3),
    FAZENDO(2),
    FEITO(1);

    private final int valor;

    AtividadeStatus(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
