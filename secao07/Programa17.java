//Vetores part2
package br.com.geekuniversity.secao07;

public class Programa17 {

	public static void main(String[] args) {
		//Declaração e definição de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			numeros [i] = i + 3;
		}
		
		System.out.println(numeros[0]); //Primeiro elemento 
		System.out.println(numeros[9]); //último elemento 
		
		//0... 9
		//numeros[10]; não existe
		/*
		 * os vetores/arrays/matrizes possuem tamanhos fixos e não
		 * podem ser aumentados/diminuidos
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //primeiro elemento 
		
		//numeros[0] = 3.4f;
		/*
		 * os vetores/arrays/matrizes possuem tipos de dados fixos
		 * e não aceitam tipos variados
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			//math é uma biblioteca, e round é arredondando p/ int
			//random é o resultado em double entre 0, e 1
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		System.out.println(numeros[0]); //Primeiro elemento 
		System.out.println(numeros[9]); //último elemento
		
		//double 0...1
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		//System.out.println(Math.round(Math.random() * 10));

		for (int i : numeros) {
			//Sem condição de parada
			System.out.println(i);
		}

	}

}
