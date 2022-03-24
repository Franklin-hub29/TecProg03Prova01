package br.edu.unvas.main;

import java.util.ArrayList;
import java.util.Scanner;


import br.edu.unvas.vo.Aluno;

public class StartApp {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		menu();
		int option =0;
		option = scanner.nextInt();
		if(option==1) {
		cadastrar(scanner,alunos);
		}else if(option == 2) {
			System.out.println("Lista de aluno com posgraduação"+alunos.get(option));
		}else if(option == 3) {
			
		}else if(option ==4) {
			
			
		}
		
		
	}
	
	public static void menu() {
		System.out.println("Digite 1 para cadastrar aluno");
		System.out.println("Digite 2 para lista de aluno posgraduado");
		System.out.println("Digite 3 para lista de aluno com Mestrado");
		System.out.println("Digite 4 para sair");
	}
	
	public static void cadastrar(Scanner scanner,ArrayList<Aluno>alunos) {
		       
		Aluno aluno = new Aluno();
		int option=0;
		
		for(int i=0;i>alunos.size();i++) {
		
		     System.out.println("Iforme o nome do aluno");
		     if(aluno.equals(alunos)) {
		    	 System.out.println("Aluno já cadastrado");
		     }else {
		     aluno.setNome(scanner.nextLine());
		     System.out.println("Iforme o cpf do aluno");
		     aluno.setCpf(scanner.nextInt());
		     scanner.nextLine();
		     System.out.println("Infome o email do aluno");
		     aluno.setEmail(scanner.nextLine());
		     
		     
		     
		     }
		     
		}   
		    alunos.add(aluno); 
		
	}
	
	public static void listaAlunoPos(Scanner scanner ,ArrayList<Aluno>alunos) {
		
		
		
		
	}
	


}
