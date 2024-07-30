package models.entity;

import java.util.List;

public class Documentacao {
    //ATRIBUTOS//
    /** 
     * COmentar sobre as classes
     */
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documentacao{documentos=");
        for (Documento doc : documentos) {
            sb.append(doc.toString()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append('}');
        return sb.toString();
    }

    

}
