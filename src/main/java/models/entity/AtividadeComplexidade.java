package models.entity;

/*
 * Enum responsável por guardar a complexidade da Atividade
 */



public enum AtividadeComplexidade {
    FACIL(3),
    MEDIO(2),
    DIFICIL(1);

    private final int valor;

    AtividadeComplexidade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
