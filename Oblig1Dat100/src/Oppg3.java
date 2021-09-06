import javax.swing.JOptionPane;

public class Oppg3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("n:"));
		int fakultet=1;
		while(n!=0) {
			fakultet *= n;
			n--;
		}
		System.out.println("n!= " + fakultet);
	}

}
