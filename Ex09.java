package selectionStructures;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {

		int t1, t2, t3;

		t1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input triangle a: "));

		t2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input triangle b: "));

		t3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input triangle c: "));

		if (t1 <= 0 || t2 <= 0 || t3 <= 0) {
			JOptionPane.showMessageDialog(null, "Only positive values and greater than zero are available!");
		}

		else if (t1 == t2 && t1 == t3 && t2 == t3) {

			JOptionPane.showMessageDialog(null, "This is an Equilateral Triangle.");

		}

		else if (t1 == t2 || t2 == t3 || t1 == t3) {

			JOptionPane.showMessageDialog(null, "This is an Isosceles Triangle.");

		}

		else {

			JOptionPane.showMessageDialog(null, "This is a Scalene Triangle.");
		}

	}

}
