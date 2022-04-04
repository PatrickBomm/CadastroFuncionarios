import java.util.Set;

public class Administrador extends Funcionario {
    
    private String nivelAcesso;


    
    public Administrador(String name, int id, String cpf, int age, String nivelAcesso, Setor setor) {
        super(name, id, cpf, age, setor);
        this.nivelAcesso = nivelAcesso;
    }


    public String getNivelAcesso() {
        return nivelAcesso;
    }


    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Administrador[Nome: " + getName() + ", Id: " + getId() + ", Idade: " + getAge() + ", Nível de Acesso: " + getNivelAcesso() + ", Setor: " + getSetor().getNome() + "]";
    }

}
