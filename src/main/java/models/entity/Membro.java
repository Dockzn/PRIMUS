package models.entity;

public class Membro extends Aluno{


    public Membro(String nome, String email, String cargo, String matricula, String curso) {
        super(nome, email, cargo, matricula, curso);
        
    }

    private int id;
    private String nome;
    private String email;

    
    // Getters e Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
