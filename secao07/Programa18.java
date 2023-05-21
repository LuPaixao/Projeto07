//Matrizes parte1
/*
  vetores/arrays/matrizes multi-dimensionais
  
  //vetor
  int n[3];
  n[0] = 1;
  n[1] = 2;
  n[2] = 3;
  
  //matriz 
   * linhas, colunas
   * int n[3][3];
   * n[0][0] = 1;
   * n[0][1] = 2;
   * n[0][2] = 3;
   * n[1][0] = 4;
   * n[1][1] = 5;
   * n[1][2] = 6;
   * n[2][0] = 7;
   * n[2][1] = 8;
   * n[2][2] = 9; 
 */
package br.com.geekuniversity.secao07;

public class Programa18 {
	public static void main(String[] args) {
		//Declarando a matriz
		int valor[][];
		
		//Declaração e definição de tamanho da matriz
		int numeros[][] = new int [3][3];
		System.out.println(numeros);
		
		//Declarar, definir o tamanho e inicializar4
		int n[][] = {{1, 2 ,3}, {4 ,5 , 6}, {7, 8, 9}};
		System.out.println(n);
		
		//Declara uma matriz, informando apenas as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		int nova_matriz[][] = { {1, 2},{4, 6},{8, 9} };
		
		
	}

}
