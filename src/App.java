import java.io.ObjectInputStream.GetField;

public class App {
    public static void main(String[] args) throws Exception {
        
        Gerenciamento ger = new Gerenciamento();

        ger.cadastro("RH", 1);
        ger.cadastro("CEO", 2);

        for(Setor s: ger.setores){
            if(s.getNome() == "RH"){
                ger.cadastro("João", "05523548714", 1, 18, s);
                ger.cadastro("Pedro", "44784123005", 2, 28, s);
                ger.cadastro("Paulo", "32551632520", 36, "Acesso A", s, 4);
            }
            if(s.getNome() == "CEO"){
                ger.cadastro("Patrick", "05014778445", 19, "Máx", s, 3);
            }
        }

        if(ger.funcionarios.size() > 0){
            System.out.println("Dados Carregados!");
        }

        ger.listar();

        int a = 3;
        int b = 4;
        ger.pesquisaFuncionario(a);
        ger.pesquisaFuncionario(b);
        
    }

}
