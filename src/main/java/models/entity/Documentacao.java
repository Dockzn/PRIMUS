package models.entity;

import java.util.List;

public class Documentacao {
    //ATRIBUTOS//

    private List<Documento> documentos;

    public Documentacao(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}
