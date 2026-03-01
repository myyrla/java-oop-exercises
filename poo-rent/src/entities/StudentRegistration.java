package entities;

public class StudentRegistration {
    private String nome;
    private String email;

    public StudentRegistration(String name, String email) {
        this.nome = nome;
        this.email = this.email;
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
