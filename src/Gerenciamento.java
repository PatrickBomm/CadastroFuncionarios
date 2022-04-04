import java.util.*;

public class Gerenciamento {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Setor> setores = new ArrayList<>();

    private int countId = funcionarios.size() + 1;

    Scanner sc = new Scanner(System.in);

    public void cadastrarFuncionario() {

        boolean cond = true;

        System.out.println("\nDigite o tipo de Funcionario\n1- Funcionário Normal.\n2- Administrador");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("\n\nDigite o nome do Funcionário: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("\nDigite o Cpf do Funcionário: ");
                String cpf = sc.nextLine();
                System.out.println("\nDigite a idade do Funcionário: ");
                int idade = sc.nextInt();
                System.out.println("\nDigite o Id do Funcionário: ");
                int id = sc.nextInt();
                for (Funcionario f : funcionarios) {
                    if (f.getId() == id) {
                        System.out.println("Id já existente!");
                        return;
                    }
                }

                while (cond) {

                    System.out.println("Setores existentes: ");
                    for (Setor s : setores) {
                        System.out.println(s.toString());
                    }
                    System.out.println("\nDigite o Setor: ");
                    sc.nextLine();
                    String setor = sc.nextLine();

                    for (Setor s : setores) {
                        if (s.getNome().equals(setor)) {
                            this.cadastro(nome, cpf, idade, id, s);
                            cond = false;
                            break;
                        } else {
                            return;
                        }

                    }
                }

                break;

            case 2:
                System.out.println("\n\nDigite o nome do Funcionário: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("\nDigite o Cpf do Funcionário: ");
                String cpf2 = sc.nextLine();
                System.out.println("\nDigite a idade do Funcionário: ");
                int age = sc.nextInt();
                System.out.println("\nDigite o nível de Acesso: ");
                sc.nextLine();
                String acesso = sc.nextLine();
                System.out.println("\nDigite o Id do Funcionário: ");
                int id2 = sc.nextInt();
                for (Funcionario f : funcionarios) {
                    if (f.getId() == id2) {
                        System.out.println("Id já existente!");
                        return;
                    }
                }

                while (cond) {

                    System.out.println("Setores existentes: ");
                    for (Setor s : setores) {
                        System.out.println(s.toString());
                    }
                    System.out.println("\nDigite o Setor: ");
                    sc.nextLine();
                    String setor = sc.nextLine();

                    for (Setor s : setores) {
                        if (s.getNome().equals(setor)) {
                            this.cadastro(name, cpf2, age, acesso, s, id2);
                            cond = false;
                            break;
                        } else {
                            return;
                        }

                    }
                }

                break;

            default:
                System.out.println("\n!!!Opção inválida!!!");
                break;
        }

    }

    public void cadastro(String nome, String cpf, int idade, int id, Setor setor) {

        boolean cond = true;

        Funcionario f = new Funcionario(nome, id, cpf, idade, setor);
        funcionarios.add(f);
        while (cond) {
            System.out.println("O funcionário a ser cadastrado sera: " + f.toString());
            System.out.println("Confirmar? (sim/nao)");
            String opc = sc.nextLine();

            if (opc.equals("sim")) {
                cond = false;
                break;
            }
            if (opc.equals("nao")) {
                funcionarios.remove(f);
                cond = false;
                break;
            } else {
                System.out.println("\n!Comando inválido!\nDigite apenas sim ou não!");
                return;
            }
        }
    }

    public void cadastro(String nome, String cpf, int idade, String acesso, Setor setor, int id) {

        boolean cond = true;

        Administrador f = new Administrador(nome, countId, cpf, idade, acesso, setor);
        funcionarios.add(f);
        while (cond) {
            System.out.println("O funcionário a ser cadastrado sera: " + f.toString());
            System.out.println("Confirmar? (sim/nao)");
            String opc = sc.nextLine();

            if (opc.equals("sim")) {
                cond = false;
                break;
            }
            if (opc.equals("nao")) {
                funcionarios.remove(f);
                cond = false;
                break;
            } else {
                System.out.println("\n!Comando inválido!\nDigite apenas sim ou não!");
                return;
            }
        }

    }

    public void pesquisaFuncionario(int id) {

        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                System.out.println(f.toString());
            }
        }

    }

    public void listar() {
        System.out.println("LISTA:");
        for (Funcionario f : funcionarios) {

            System.out.println(f.toString());

        }
    }

    public void pesquisaFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getName() == nome) {
                System.out.println(f.toString());
            }
        }
    }

    public boolean deletarFuncionario(int id) {

        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                System.out.println("\nO Funcionárioa a ser apagado será: ");
                System.out.println(f.toString());
                System.out.println("Deseja prosseguir? (Sim/Nao)");
                String opc = sc.nextLine();
                opc.toUpperCase();
                if (opc.equals("sim")) {
                    funcionarios.remove(f);
                    return true;
                }
                if (opc.equals("nao")) {
                    return false;
                } else {
                    System.out.println("\n!Comando inválido!\nDigite apenas sim ou não!");
                    deletarFuncionario(id);
                }
            }
        }

        return false;
    }


    public void cadastroSetor(){
        System.out.println("\nDigite o nome do Setor: ");
        String nome = sc.nextLine();
        nome.toUpperCase();

        System.out.println("\nDigite o id do Setor: ");
        int id = sc.nextInt();

            for(Setor s: setores){
                if(s.getId() == id){
                    System.out.println("Id já existente!");
                    return;
                }
            }
            cadastro(nome, id);
            return;

    }


    public void cadastro(String nome, int id){
        boolean cond = true;

        Setor s = new Setor(nome, id);
        setores.add(s);
        while (cond) {
            System.out.println("O setor a ser cadastrado sera: " + s.toString());
            System.out.println("Confirmar? (sim/nao)");
            String opc = sc.nextLine();

            if (opc.equals("sim")) {
                cond = false;
                break;
            }
            if (opc.equals("nao")) {
                funcionarios.remove(s);
                cond = false;
                break;
            } else {
                System.out.println("\n!Comando inválido!\nDigite apenas sim ou não!");
                return;
            }
        }

    }
}
