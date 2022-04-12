package br.soulcode.Aula01_04;

public class ZeroAMilhao {

	public static void main(String[] args) {
		
		int cont = 0;
		
		for(int i = 0; i <= 50; i++) {
			
			System.out.println(i);
			cont++;
			
			if(cont == 25) {
				break;
			}
			
		}
		
	}

}
