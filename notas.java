package marujo;
import java.util.Scanner;
public class fortnight {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	int op,op1,operacao,finala,finalb,finalc,finald;
	int finale,finalf,finalg,finalh,finalj;
	int a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4,f1,f2,f3,f4;
	
	System.out.println("Aperte 1 para iniciar o sistema.");
	operacao = input.nextInt();
	
	if(operacao == 1) {
		//Iniciar o projeto.
		
		System.out.println("Ele está no Ensino Fundamental ? 1 - Sim , 2 - Não");
		op = input.nextInt();
		// Escolher Ensino Fundamental 
		if(op == 1 ) {
			
			System.out.println("Bem vindo ao Ensino Fundamental. Notas : 1 - Primeiro bimestre"
					+ " 2 - Segundo Bimestre , 3 - Terceiro Bimestre , 4 - Quarto Bimestre ");
			
			op1 = input.nextInt();
			// Escolher os Bimestres.
			if(op1 == 1) {
				System.out.println("Notas no primeiro Bimestre");
				System.out.printf("Português : ");
				a1 = input.nextInt();
				if(a1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Matemática : ");
				b1 = input.nextInt();
				if(b1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Ciências : ");
				c1 = input.nextInt();
				if(c1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Inglês : ");
				d1= input.nextInt();
				if(d1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("História : ");
				e1 = input.nextInt();
				if(e1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Geografia : ");
				f1 = input.nextInt();
				if(f1 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				
				
				
				op1 = input.nextInt();
				if(op1 == 2) {
					System.out.println("Notas no Segundo Bimestre");
					System.out.printf("Português : ");
					a2 = input.nextInt();
					if(a2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
					System.out.printf("Matemática : ");
					b2 = input.nextInt();
					if(b2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
					System.out.printf("Ciências : ");
					c2 = input.nextInt();
					if(c2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
					System.out.printf("Inglês : ");
					d2 = input.nextInt();
					if(d2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
					System.out.printf("História : ");
					e2 = input.nextInt();
					if(e2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
					System.out.printf("Geografia : ");
					f2 = input.nextInt();
					if(f2 >= 26){
						System.out.println("Nota digitada errada.");
					}else {
						System.out.println("Nota Registrada.");
					}
				
		
				
			op1 = input.nextInt();
			if(op1 == 3) {
				System.out.println("Notas no Terceiro Bimestre");
				System.out.printf("Português : ");
				a3 = input.nextInt();
				if(a3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Matemática : ");
				b3 = input.nextInt();
				if(b3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Ciências : ");
				c3 = input.nextInt();
				if(c3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Inglês : ");
				d3 = input.nextInt();
				if(d3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("História : ");
				e3 = input.nextInt();
				if(e3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
				}
				System.out.printf("Geografia : ");
				f3 = input.nextInt();
				if(f3 >= 26){
					System.out.println("Nota digitada errada.");
				}else {
					System.out.println("Nota Registrada.");
					
				} 
				op1 = input.nextInt();
				if(op1 == 4) {
						
						System.out.println("Notas no Quarto Bimestre");
						System.out.printf("Português : ");
						a4 = input.nextInt();
						if(a4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
						System.out.printf("Matemática : ");
						b4 = input.nextInt();
						if(b4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
						System.out.printf("Ciências : ");
						c4 = input.nextInt();
						if(c4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
						System.out.printf("Inglês : ");
						d4 = input.nextInt();
						if(d4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
						System.out.printf("História : ");
						e4 = input.nextInt();
						if(e4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
						System.out.printf("Geografia : ");
						f4 = input.nextInt();
						if(f4 >= 26){
							System.out.println("Nota digitada errada.");
						}else {
							System.out.println("Nota Registrada.");
						}
					 
						
						
					finala = a1+a2+a3+a4;
					if(finala<60) {
						System.out.println("O aluno foi reprovado em Português com "+finala+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finala+" pontos !!!");
					}
					finalb = b1+b2+b3+b4;
					if(finalb<60) {
						System.out.println("O aluno foi reprovado em Matemática com "+finalb+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finalb+" pontos !!!");
					}
					finalc = c1+c2+c3+c4;
					if(finalc<60) {
						System.out.println("O aluno foi reprovado em Ciências com "+finalc+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finalc+" pontos !!!");
					}
					finald = d1+d2+d3+d4;
					if(finald<60) {
						System.out.println("O aluno foi reprovado em Inglês com"+finald+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finald+" pontos !!!");
					}
					finale = e1+e2+e3+e4;
					if(finale<60) {
						System.out.println("O aluno foi reprovado em História com "+finale+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finale+" pontos !!!");
					}
					finalf = f1+f2+f3+f4;
					if(finalf<60) {
						System.out.println("O aluno foi reprovado em Geografia com "+finalf+" pontos!!!");
					}else {
						System.out.println("O aluno passou com "+finalf+" pontos !!!");
					}
				}
			
				
				
			
				
			
		}else {
			System.out.println("Comando não detectado.");
		}
	
	}
	
	}
	}
	}
	}
}
