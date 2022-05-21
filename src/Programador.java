// pensando na noção de e-um (exemplo, o programador e-um especie de Funcionairo, por isso herda
public class Programador extends Funcionario {

    public Programador(String nome, String registro) {
        super(nome, registro);
    }

    
    public double getSalario(double horas) {
        // R$ 100,00 Aqui é o quanto a empresa paga por hora para um programador
        double valor = 100;

        return valor * horas;
    }

    public String getNome() {
        return getRegistro() + " - " + super.getNome();
    }
    
}

