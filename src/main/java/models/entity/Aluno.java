package models.entity;


/*
 * A classe Aluno é utilizada no site tanto para ser superclasse da classe Membro , como para fazer parte da lista de alunos cadastrados
 * no site.O Coodenador pode selecionar um deles , por exemplo , para adicionar ao projeto. E o aluno não consegue acessar nenhum projeto 
 * a menos que seja membro de um.
 */

public class Aluno {
    // Atributos
    private String nome, email, cargo, matricula, curso;

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

    //se nome é diferente de nulo
    public void setNome(String nome) {
        if(nome != null) this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    // Se email != nulo
    public void setEmail(String email) {
        if(email != null) this.email = email;
    }

    public String getCargo() {
        return cargo;
    }
    
    // Se cargo for diferente de nulo
    public void setCargo(String cargo) {
        if(cargo != null) this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    //  SETTER da matricula, onde matricula deve ser diferente de nulo e o tamanho obrigatório de 6 numeros
    public void setMatricula(String matricula) {
        if(matricula != null && matricula.length() == 6){
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    // Se curso for diferente de nulo
    public void setCurso(String curso) {
        if(curso != null) this.curso = curso;
    }

}
