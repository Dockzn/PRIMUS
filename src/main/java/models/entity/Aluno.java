package models.entity;

/**
 * A classe Aluno é utilizada no site tanto para ser superclasse da classe Membro , como para fazer parte da lista de alunos cadastrados
 * no site.O Coodenador pode selecionar um deles , por exemplo , para adicionar ao projeto. E o aluno não consegue acessar nenhum projeto 
 * a menos que seja membro de um.
 */
public class Aluno {

    private String nome, email, cargo, matricula, curso;

    public Aluno(String nome, String email, String cargo, String matricula, String curso) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null) this.email = email;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        if(cargo != null) this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    /*
     * Colocamos uma pequena regra de negócio para caso a matrícula seja de tamamnho igual a 6
     */
    public void setMatricula(String matricula) {
        if(matricula != null && matricula.length() == 6){
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if(curso != null) this.curso = curso;
    }
}
