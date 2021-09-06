import javax.swing.JOptionPane;

public class Oppg2 {

	public static void main(String[] args) throws Exception {
		
		char karakter = 0;
		
		inner:	
		for (int i=1;i<11;i++) {
			try {
				int poengsum =Integer.parseInt(JOptionPane.showInputDialog("Tast inn et poengsum:"));		
				karakter= Karakter(poengsum);
			} catch (Exception e) {
				i--;
				continue inner;
			}
				System.out.println("Elev("+i+") sin karakter:" + karakter);
		}
	}
	
	public static boolean gyldigPoengsum(int x) throws Exception {
		if(x< 0 || x>100) {
			throw new Exception("Ugyldig poengsum");
		}
		return true;
	}
	public static char Karakter(int poengsum) throws Exception{
		 char karakter=0;
		if(gyldigPoengsum(poengsum)) {
			if(poengsum<40) {
				karakter ='F';
			}else if(poengsum<50) {
				karakter ='E';
			}else if(poengsum<60) {
				karakter ='D';
			}else if(poengsum<80) {
				karakter ='C';
			}else if(poengsum<90) {
				karakter ='B';
			}else if(poengsum<=100) {
				karakter ='A';
			}			
		}
		
		return karakter;
	}
}



