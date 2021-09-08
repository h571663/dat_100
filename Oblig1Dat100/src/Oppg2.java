import javax.swing.JOptionPane;

public class Oppg2 {

	public static void main(String[] args){

		char karakter = 0;

		for (int i = 1; i < 11; i++) {

			int poengsum = Integer.parseInt(JOptionPane.showInputDialog("Tast inn et poengsum:"));
			karakter = Karakter(poengsum);
			if (karakter != 0) {
				System.out.println("Elev(" + i + ")" + "sin karakter:" + karakter);
			} else {
				i--;
				System.out.println("Ugyldig input!");
			}
		}
	}

	public static char Karakter(int poengsum){
		char karakter = 0;

		if (poengsum < 40 && poengsum >= 0) {
			karakter = 'F';
		} else if (poengsum < 50 && poengsum >= 40) {
			karakter = 'E';
		} else if (poengsum < 60 && poengsum >= 50) {
			karakter = 'D';
		} else if (poengsum < 80 && poengsum >= 60) {
			karakter = 'C';
		} else if (poengsum < 90 && poengsum >= 80) {
			karakter = 'B';
		} else if (poengsum <= 100 && poengsum >= 90) {
			karakter = 'A';
		} else {
			karakter = 0;
		}

		return karakter;

	}
}
