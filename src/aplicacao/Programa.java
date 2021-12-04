package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc= new Conta(1001, "Alex", 0.0);
		ContaEmpresarial bacc = new ContaEmpresarial(1002, "Maria",0.0,500.0);
		
		//UPCASTING-  subclasse para super classe
		Conta acc1 = bacc;
		Conta acc2 = new ContaEmpresarial(1003,"Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING- superclasse para sub classe
		
		ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
		acc4.emprestimo(100.0);
		
		//ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
		
		if (acc3 instanceof ContaEmpresarial) {
			ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("Atualizado!");
		}
		
		
	}

}
