// pensando na noção de e-um (exemplo, o programador e-um especie de Funcionairo, por isso herda
public class Gerente extends Funcionario {

    public Gerente(String nome, String registro) {
        super(nome, registro);
    }

    
    public double getSalario(double horas) {
        // R$ 150,00 Aqui é o quanto a empresa paga por hora para um gerente
        double valor = 150;
        // R$ 4.000,00 Aqui é quanto a empresa paga como bonificação para o gerente
        double gratificacao = 4000;

        return valor * horas + gratificacao;
    }
    
        
    public String getNome() {
        return "Gerente " + super.getNome();
    }

}
