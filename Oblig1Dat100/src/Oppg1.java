import javax.swing.JOptionPane;

public class Oppg1 {

	public static void main(String[] args) {
		String inntektAsString= JOptionPane.showInputDialog("Tast inn bruttoinntekt.");
		int inntekt= Integer.parseInt(inntektAsString);
		double trinnskatt;
		if(inntekt<164101) {
			trinnskatt=inntekt*0;
		} else if(inntekt<230951) {
			trinnskatt=inntekt*0.0093;
		}else if(inntekt<580651) {
			trinnskatt=inntekt*0.0241;
		}else if(inntekt<934951) {
			trinnskatt=inntekt*0.1152;
		}else {
			trinnskatt=inntekt*0.1452;
		}
		JOptionPane.showMessageDialog(null,"Trinnskatt: " + trinnskatt);
	}

}
