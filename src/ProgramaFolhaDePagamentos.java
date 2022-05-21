
//Anotações
//Será criada uma Folha de Pagamento simples
//Atributos ou variáveis serão: nome, regisrtro, cargos dos funcionários serão programador e gerente.  
//O salário dos programadores = valor fixo por hora * horas trabalhadas.
//O salário dos gerentes = valor fixo por hora * horas trabalhadas + gratificação.

//Aqui segue a relação dos funcionários e a respectiva carga horária:

//  Alan - programador - 200h;
//  Bianca - programadora - 220h;
//  Carlos - gerente - 260h;
//  Daniela - gerente - 260h;
//  Evandro - programador - 220h.


public class ProgramaFolhaDePagamentos {
    
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[6];
        funcionarios[0] = new Programador("Alan", "123");
        funcionarios[1] = new Programador("Bianca", "124");
        funcionarios[2] = new Gerente("Fabricio", "100");
        funcionarios[3] = new Gerente("Tamiris", "101");
        funcionarios[4] = new Programador("Evandro", "125");
        funcionarios[5] = new Programador("Fabio", "126");

        double[] horas = new double[6];
        horas[0] = 200;
        horas[1] = 80;
        horas[2] = 260;
        horas[3] = 260;
        horas[4] = 220;
        horas[5] = 100;

        double total = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            double salario = funcionarios[i].getSalario(horas[i]);
            total = total + salario;
            System.out.println(funcionarios[i].getNome() + " - R$ " + salario);
        }
        System.out.println("Total da folha de pagamento - R$ " + total);
    
    }
}


        
        
        
        
    




