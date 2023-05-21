//Vetores part2
package br.com.geekuniversity.secao07;

public class Programa17 {

	public static void main(String[] args) {
		//Declara��o e defini��o de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			numeros [i] = i + 3;
		}
		
		System.out.println(numeros[0]); //Primeiro elemento 
		System.out.println(numeros[9]); //�ltimo elemento 
		
		//0... 9
		//numeros[10]; n�o existe
		/*
		 * os vetores/arrays/matrizes possuem tamanhos fixos e n�o
		 * podem ser aumentados/diminuidos
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //primeiro elemento 
		
		//numeros[0] = 3.4f;
		/*
		 * os vetores/arrays/matrizes possuem tipos de dados fixos
		 * e n�o aceitam tipos variados
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			//math � uma biblioteca, e round � arredondando p/ int
			//random � o resultado em double entre 0, e 1
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		System.out.println(numeros[0]); //Primeiro elemento 
		System.out.println(numeros[9]); //�ltimo elemento
		
		//double 0...1
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		//System.out.println(Math.round(Math.random() * 10));

		for (int i : numeros) {
			//Sem condi��o de parada
			System.out.println(i);
		}

	}

}
