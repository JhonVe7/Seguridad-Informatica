package cifradoMatriz;


public class Main {
	
public void matriz (){
	int x [][];
	 
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			
		}
	}
}

public char cifrado (int num) {
	char aux = '0';
	
	if (num <= 0 && num > 27 ) {
	}
	else {
		switch (num) {
			case 1:aux = 'a';
			case 2:aux = 'b';
			case 3:aux = 'c';
			case 4:aux = 'd';
			case 5:aux = 'e';
			case 6:aux = 'f';
			case 7:aux = 'g';
			case 8:aux = 'h';
			case 9:aux = 'i';
			case 10:aux = 'j';
			case 11:aux = 'k';
			case 12:aux = 'l';
			case 13:aux = 'm';
			case 14:aux = 'n';
			case 15:aux = 'ñ';
			case 16:aux = 'o';
			case 17:aux = 'p';
			case 18:aux = 'q';
			case 19:aux = 'r';
			case 20:aux = 's';
			case 21:aux = 't';
			case 22:aux = 'u';
			case 23:aux = 'v';
			case 24:aux = 'w';
			case 25:aux = 'x';
			case 26:aux = 'y';
			case 27:aux = 'z';
		} 
	} 
	
	return aux;		
}

}
