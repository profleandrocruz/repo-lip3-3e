import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {

		double media = 6.0;
		
		if( media >= 6.0 ) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}

	}

}
