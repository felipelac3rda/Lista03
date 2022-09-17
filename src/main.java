import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a[] = preencherVetor(10);
		int b[] = preencherVetor(10);
		int c[] = preencherVetorPositivo(10);
		int zeroeum[] = preencherVetor0e1(10);
		imprimirVetor(a);
		System.out.println();

		// 1* Questão
		// System.out.println(pesquisa(a, 3));

		// 2* Questão
		// System.out.println(pesquisaIndice(a, 15));

		// 3* Questão
		// separarValores(a); imprimirVetor(a);

		// 4* Questão
		// System.out.println(somatorio(a));

		// 5* Questão
		// imprimirVetor(b);
		// imprimirVetor(juncaoVetor(a,b));

		// 6* Questão
		// imprimirVetor(inversaoOrdem(a));

		// 7* Questão
		// imprimirVetor(b);
		// inversaoVetor(a,b);
		// imprimirVetor(a);
		// imprimirVetor(b);

		// 8* Questão
		// imprimirVetor(priorizacao(a));

		// 10* Questão
		// imprimirVetor(zeroeum);
		// imprimirVetor(compactacao(zeroeum));
		
		// 11* Questão

		// 12* Questão
		// String c[] = new String[26];
		// System.out.println("Digite a frase uma letra por vez: ");
		// for (int i = 0; i < c.length; i++) {
		// c[i] = ler.nextLine();
		// }
		// imprimirVetorString(criptografia(c));

		// 13* Questão
		// imprimirVetorString(descriptografia(c));

		// 14* Questão
		// String d[] = new String[8];
		// System.out.println("Digite uma letra por vez: ");
		// for (int i = 0; i < d.length; i++) {
		// d[i] = ler.nextLine();
		// }
		// contagemCaracteres(d);

		// 15* Questão
		// imprimirVetor(b);
		// imprimirVetor(complementacao(a, b));

		// 16* Questão
		// imprimirVetor(polarizacao(a));

		// 17* Questão
		// int h[] = preencherVetorPositivo(10);
		// imprimirVetor(h);
		// imprimirVetor(explosao(h));

		// 18* Questão
		// imprimirVetor(c);
		// imprimirVetor(organizacao(c));

		// 19* Questão
		// agrupamento(a,2);

		// 20* Questão
		// imprimirVetor(b);
		// imprimirVetor(diferencaA(a, b));

	}

	public static int[] preencherVetor(int tam) {
		int vetor[] = new int[tam];
		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(10) - 3;
		}
		return vetor;

	}
	
	public static int[] preencherVetor0e1(int tam) {
		int vetor[] = new int[tam];
		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(2);
		}
		return vetor;

	}

	public static int[] preencherVetorPositivo(int tam) {
		int vetor[] = new int[tam];
		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(5);
		}
		return vetor;

	}

	public static void imprimirVetor(int vetor[]) {
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void imprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}

	public static void imprimirVetorString(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
		}
		System.out.println("\n");
	}

	public static int pesquisa(int vetor[], int elemento) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return cont;
			}
			cont++;
		}
		return -100;
	}

	public static Object pesquisaIndice(int vetor[], int indice) {
		if (indice >= vetor.length) {
			return null;
		} else {
			return vetor[indice];
		}
	}

	public static void separarValores(int vetor[]) {
		int aux = 0;
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 1; i < vetor.length; i++) {
				aux = 0;
				if (vetor[i] < vetor[i - 1]) {
					aux = vetor[i - 1];
					vetor[i - 1] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}

	public static int somatorio(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	public static int[] juncaoVetor(int vetor[], int vetor2[]) {
		int c[] = new int[vetor.length + vetor2.length];
		for (int i = 0; i < vetor.length; i++) {
			c[i] = vetor[i];
		}
		int j = 0;
		for (int i = vetor.length; i < c.length; i++) {
			c[i] = vetor2[j];
			j++;
		}

		return c;
	}

	public static int[] inversaoOrdem(int vetor[]) {
		int aux = 0;

		for (int i = 0; i < vetor.length / 2; i++) {
			aux = vetor[vetor.length - (i + 1)];
			vetor[vetor.length - (i + 1)] = vetor[i];
			vetor[i] = aux;
		}
		return vetor;
	}

	public static void inversaoVetor(int vetor[], int vetor2[]) {
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			aux = vetor2[i];
			vetor2[i] = vetor[i];
			vetor[i] = aux;
		}
	}

	public static int[] priorizacao(int vetor[]) {
		int cont = 1;
		int media = 0;
		int vetor2[] = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			media = 0;
			for (int j = 0; j <= cont; j++) {
				media += vetor2[j];
			}
			media = media / cont;
			if (vetor[i] > media) {
				vetor2[i] = vetor[i];
				cont++;
			}
		}
		return vetor2;
	}

	public static int[] compactacao(int vetor[]) {

		int cont = 1;
		int cont2 = 0;
	
		int vetorCompactado[] = new int[vetor.length*2];
	
		for(int i = 0; i < vetor.length-1; i++) {
			
			if(vetor[i] == vetor[i+1]) {
				cont++;
			}
			else {
				vetorCompactado[i + cont2] = vetor[i];
				vetorCompactado[i+1+cont2] = cont;
				cont2 = cont2 + 1;
				cont = 1;
			}
		
		}
		
		return vetorCompactado;
	}

	public static void descompactacao(int vetor[]) {

	}

	public static String[] criptografia(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals("a"))
				vetor[i] = "%";
			else if (vetor[i].equals("b"))
				vetor[i] = "*";
			else if (vetor[i].equals("c"))
				vetor[i] = "(";
			else if (vetor[i].equals("d"))
				vetor[i] = "-";
			else if (vetor[i].equals("e"))
				vetor[i] = "+";
			else if (vetor[i].equals("f"))
				vetor[i] = "@";
			else if (vetor[i].equals("g"))
				vetor[i] = "#";
			else if (vetor[i].equals("h"))
				vetor[i] = "1";
			else if (vetor[i].equals("i"))
				vetor[i] = "2";
			else if (vetor[i].equals("j"))
				vetor[i] = "3";
			else if (vetor[i].equals("l"))
				vetor[i] = "4";
			else if (vetor[i].equals("m"))
				vetor[i] = "5";
			else if (vetor[i].equals("n"))
				vetor[i] = "6";
			else if (vetor[i].equals("o"))
				vetor[i] = "7";
			else if (vetor[i].equals("p"))
				vetor[i] = "8";
			else if (vetor[i].equals("q"))
				vetor[i] = "9";
			else if (vetor[i].equals("r"))
				vetor[i] = "{";
			else if (vetor[i].equals("s"))
				vetor[i] = "}";
			else if (vetor[i].equals("t"))
				vetor[i] = "!";
			else if (vetor[i].equals("u"))
				vetor[i] = "&";
			else if (vetor[i].equals("v"))
				vetor[i] = "$";
			else if (vetor[i].equals("x"))
				vetor[i] = "?";
			else if (vetor[i].equals("z"))
				vetor[i] = ":";
			else
				vetor[i] = " ";
		}

		return vetor;
	}

	public static String[] descriptografia(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals("%"))
				vetor[i] = "a";
			else if (vetor[i].equals("*"))
				vetor[i] = "b";
			else if (vetor[i].equals("("))
				vetor[i] = "c";
			else if (vetor[i].equals("-"))
				vetor[i] = "d";
			else if (vetor[i].equals("+"))
				vetor[i] = "e";
			else if (vetor[i].equals("@"))
				vetor[i] = "f";
			else if (vetor[i].equals("#"))
				vetor[i] = "g";
			else if (vetor[i].equals("1"))
				vetor[i] = "h";
			else if (vetor[i].equals("2"))
				vetor[i] = "i";
			else if (vetor[i].equals("3"))
				vetor[i] = "j";
			else if (vetor[i].equals("4"))
				vetor[i] = "l";
			else if (vetor[i].equals("5"))
				vetor[i] = "m";
			else if (vetor[i].equals("6"))
				vetor[i] = "n";
			else if (vetor[i].equals("7"))
				vetor[i] = "o";
			else if (vetor[i].equals("8"))
				vetor[i] = "p";
			else if (vetor[i].equals("9"))
				vetor[i] = "q";
			else if (vetor[i].equals("{"))
				vetor[i] = "r";
			else if (vetor[i].equals("}"))
				vetor[i] = "s";
			else if (vetor[i].equals("!"))
				vetor[i] = "t";
			else if (vetor[i].equals("&"))
				vetor[i] = "u";
			else if (vetor[i].equals("$"))
				vetor[i] = "v";
			else if (vetor[i].equals("?"))
				vetor[i] = "x";
			else if (vetor[i].equals(":"))
				vetor[i] = "z";
			else
				vetor[i] = " ";
		}

		return vetor;
	}

	public static void contagemCaracteres(String vetor[]) {
		String vetoraux[] = new String[vetor.length];
		int cont = 0;
		int cont2 = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i].equals(vetor[j])) {
					cont++;
				}

			}
			vetoraux[i] = vetor[i];
			for (int t = 0; t < vetoraux.length; t++) {
				if (vetor[i].equals(vetoraux[t])) {
					cont2++;
				}
			}

			if (cont2 == 1) {
				System.out.print(vetor[i] + "=" + cont + "  ");
			}
			cont2 = 0;
			cont = 0;
		}
	}

	public static int[] complementacao(int vetor[], int vetor2[]) {
		int vetor3[] = new int[vetor.length];
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			aux = ((vetor[i] + vetor2[i]) - 10) * (-1);
			vetor3[i] = aux;
		}

		return vetor3;
	}

	public static int[] polarizacao(int vetor[]) {
		int aux = 0;
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 1; i < vetor.length; i++) {
				aux = 0;
				if ((vetor[i] % 2 != 0)) {
					aux = vetor[i - 1];
					vetor[i - 1] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

		return vetor;
	}

	public static int[] explosao(int vetor[]) {
		int tam = 0;
		int aux = 0;
		int aux2 = 0;
		int c = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				vetor[i] = vetor[i] * (-1);
			}
			tam += vetor[i];
		}
		int vetor2[] = new int[tam];
		for (int i = 0; i < vetor.length; i++) {
			aux = vetor[i];
			for (int j = aux2; c < aux; j++) {
				vetor2[j] = vetor[i];
				c++;
			}
			aux2 += vetor[i];
			c = 0;
		}
		return vetor2;
	}

	public static int[] organizacao(int vetor[]) {

		int aux = 0;
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			cont = i;
			for (int j = 0; j < vetor.length; j++) {
				if ((vetor[j] == vetor[i]) && (j != i)) {
					if (cont < vetor.length - 1) {
						cont++;
					}
					aux = vetor[cont];
					vetor[cont] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		return vetor;
	}

	public static int[][] agrupamento(int vetor[], int numeroAgrupamento) {
		int resp[][] = new int[numeroAgrupamento][vetor.length / numeroAgrupamento];
		int cont = 0;
		for (int i = 0; i < numeroAgrupamento; i++) {
			for (int j = 0; j < vetor.length / numeroAgrupamento; j++) {

				resp[i][j] = vetor[cont];
				cont++;
			}
		}
		for (int i = 0; i < numeroAgrupamento; i++) {
			for (int j = 0; j < vetor.length / numeroAgrupamento; j++) {
				System.out.print(resp[i][j] + " ");
			}
			System.out.println("");
		}

		return resp;
	}

	public static int[] diferencaA(int vetor[], int vetor2[]) {
		int cont = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int aux = 0;
		int cont5 = 0;

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor[i] == vetor2[j]) {
					cont++;
				}
			}
			if (cont == 0) {
				cont2++;
			}
			cont = 0;
		}
		int resp[] = new int[cont2];
		for (int i = 0; i < vetor.length; i++) {
			aux = vetor[i];
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor[i] == vetor2[j]) {
					cont3++;
				}
			}
			if (cont3 == 0) {
				for(int x = 0; x < resp.length; x++) {
					if(vetor[i] == resp[x]) {
						cont5++;
					}
				}
				if(cont5 == 0) {
					resp[cont4] = vetor[i];
					cont4++;
				}
				cont5 = 0;
				
			}
			cont3 = 0;
		}
		return resp;
	}

}



