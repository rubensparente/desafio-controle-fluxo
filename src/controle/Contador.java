package controle;

import java.util.Scanner;

import org.xml.sax.helpers.ParserAdapter;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		}catch(ParametrosInvalidosException e){
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		int contagem = parametroDois - parametroUm;
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO");
		}
	
		System.out.println("Você digitou como 1º parametro " + parametroUm + " e " +parametroDois+ " como 2º parametro. Os números impressos serão a substração desses dois números. O resultado foi " +contagem);
				
		// realizar o for para imprimir os números com base na variável contagem
		for (int contador = 1; contador <= contagem; contador++) {
			System.out.println("Imprissão número " +contador);

		}
		
	}	

}

class ParametrosInvalidosException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}

