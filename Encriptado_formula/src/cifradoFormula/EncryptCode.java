package cifradoFormula;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class EncryptCode {
	
	static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
	static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	
	//variables
	private static int descifrado [];
	private static String mensaje ;
	private static String clave ;
	private static String[] cifrado;
	private static String[] cifradoClave;
		
	public char AbecedarioDescifrado (int num) {
		char aux = '0';
		if (num <= 0 && num > 27 ) {
		}
		else {
			switch (num) {
				case 1 :aux = 'a';break;
				case 2 :aux = 'b';break;
				case 3 :aux = 'c';break;
				case 4 :aux = 'd';break;
				case 5 :aux = 'e';break;
				case 6 :aux = 'f';break;
				case 7 :aux = 'g';break;
				case 8 :aux = 'h';break;
				case 9 :aux = 'i';break;
				case 10 :aux = 'j';break;
				case 11 :aux = 'k';break;
				case 12 :aux = 'l';break;
				case 13 :aux = 'm';break;
				case 14 :aux = 'n';break;
				case 15 :aux = 'ñ';break;
				case 16 :aux = 'o';break;
				case 17 :aux = 'p';break;
				case 18 :aux = 'q';break;
				case 19 :aux = 'r';break;
				case 20 :aux = 's';break;
				case 21 :aux = 't';break;
				case 22 :aux = 'u';break;
				case 23 :aux = 'v';break;
				case 24 :aux = 'w';break;
				case 25 :aux = 'x';break;
				case 26 :aux = 'y';break;
				case 27 :aux = 'z';break;
			} 
		} 
		
		return aux;		
	}
	
	public static int AbecedarioCifrado (String letra) {
		int aux = 0;
		
			switch (letra) {
				case "a":aux = 1;break;
				case "b":aux = 2;break;
				case "c":aux = 3;break;
				case "d":aux = 4;break;
				case "e":aux = 5;break;
				case "f":aux = 6;break;
				case "g":aux = 7;break;
				case "h":aux = 8;break;
				case "i":aux = 9;break;
				case "j":aux = 10;break;
				case "k":aux = 11;break;
				case "l":aux = 12;break;
				case "m":aux = 13;break;
				case "n":aux = 14;break;
				case "ñ":aux = 15;break;
				case "o":aux = 16;break;
				case "p":aux = 17;break;
				case "q":aux = 18;break;
				case "r":aux = 19;break;
				case "s":aux = 20;break;
				case "t":aux = 21;break;
				case "u":aux = 22;break;
				case "v":aux = 23;break;
				case "w":aux = 24;break;
				case "x":aux = 25;break;
				case "y":aux = 26;break;
				case "z":aux = 27;break;
			} 
		return aux;		
	}
	
	public static String[] cifrarClave (String clave) throws IOException {
		
		//split words in letters 
		cifradoClave = clave.split("");
		int aux = 0;
		//run array
		for (int i = 0; i < cifradoClave.length; i++){	
			aux =( AbecedarioCifrado( cifradoClave[i]));
			System.out.print(aux);	
		}
		return cifradoClave;
	}
	
	public static String[] cifrar (String mensaje) throws IOException {
		
		//split words in letters 
		cifrado = mensaje.split("");
		int aux = 0;
		
		//run array
		for (int i = 0; i < cifrado.length; i++){	
			aux = AbecedarioCifrado(cifrado[i])* 7;
			System.out.print(aux);	
		}
		return cifrado;
	}
	
	public static String[] descifrar (String mensaje) throws IOException {
		
		//split words in letters 
		cifrado = mensaje.split("");
		int aux = 0;
		
		//run array
		for (int i = 0; i < cifrado.length; i++){	
			aux = AbecedarioCifrado(cifrado[i])/ 7;
	
			System.out.print(aux);	
		}
		return cifrado;
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
		/*
		//menú
		bw.write("digite la accion que desea realizar: "+"\n");
		bw.flush();
		System.out.println("1: cifrar ");
		System.out.println("2: descifrar ");
		*/
			
			
		/*ingreso de la clave 
		 * (si no coincide el mensaje no se podrá leer).
		 */
		bw.write("digite la clave: "+"\n");
		bw.flush();
		clave = br.readLine();
		cifrarClave(clave);
			
		
		//ingreso del texto en blanco
		bw.write("\n"+"digite el mensaje en letras minusculas: "+"\n");
		bw.flush();
		mensaje = br.readLine();
		cifrar(mensaje);
		
		bw.write("\n"+"digite la clave para descifrar el mensaje: "+"\n");
		bw.flush();
		clave = br.readLine();
		descifrar(clave);
		
		
		}catch(IOException e) {}
	}

}
