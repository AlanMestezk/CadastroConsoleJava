package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.FuncLocal;
import Entities.FuncTerceiro;
import Entities.Funcionario;
import Entities.Enums.StatusFunc;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		List<Funcionario> list = new ArrayList<>();		
		
		System.out.println();
		System.out.println("Cadastro de funcionário");
		System.out.println();
		
		System.out.println();
		System.out.print("Quantos funcionários seram cadastrados: ");
		int numberFunc = sc.nextInt();
		
		for(int i = 1; i <= numberFunc; i ++) {
			
			System.out.println();
			System.out.println("Funcionário #"+ i);
			System.out.print("Terceiro ou Local: ");
			String response = sc.next();
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Cargo: ");
			String role = sc.next();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			System.out.print("Horas obrigatorias por semana: ");
			int hourWork = sc.nextInt();
			System.out.print("Status do funcionário: ");
			StatusFunc status = StatusFunc.valueOf(sc.next());
			
			if(response.equals("Local")) {
				
				System.out.print("Desconto de transporte: ");
				double transportFee = sc.nextDouble();
				System.out.print("Desconte vale-refeição: ");
				double voucherFee = sc.nextDouble();
				
				list.add(new FuncLocal(id, name, role, salary, hourWork, status, voucherFee, transportFee));
				
			}
			else {
				
				System.out.print("Qual a taxa de desconto: ");
				double taxPeyment = sc.nextDouble();
				
				list.add(new FuncTerceiro(id, name, role, salary, hourWork, status, taxPeyment));
				
			}
			
		}
		
		System.out.println();
		System.out.println("Funcionários cadastrados");
		System.out.println();
		
		for(Funcionario func: list) {
			System.out.println("=> Id: "+ func.getId());
			System.out.println("    "+ func.getName());
			System.out.println("    "+ func.getRole());
			System.out.println("    "+ func.getStatus());
			System.out.println("   Valor a ser pago por semana: " + String.format("%.2f", func.finalValue()));
			System.out.println();
		}
		

	}


}
