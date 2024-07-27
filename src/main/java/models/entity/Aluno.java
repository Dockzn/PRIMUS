package models.entity;

public class Aluno {
    // Atributos
    private String nome;
    private String email;
    private String cargo;
    private String matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, String email, String cargo, String matricula, String curso) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
