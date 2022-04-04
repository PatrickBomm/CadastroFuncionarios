public class Funcionario {

    private String name;
    private int id;
    private String cpf;
    private int age;
    private Setor setor;

    public Funcionario(String name, int id, String cpf, int age, Setor setor) {
        this.name = name;
        this.id = id;
        this.cpf = cpf;
        this.age = age;
        this.setor = setor;
    }

    public Funcionario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {

        return "Funcionario [Nome=" + name + ", Id=" + id + ", Cpf=" + cpf + ", Idade=" + age + ", Setor= " + setor.getNome()
                + "]";
    }

}