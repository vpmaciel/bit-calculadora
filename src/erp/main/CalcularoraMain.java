package erp.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import erp.utilitarios.calculadora.CalculadoraJan;

public class CalcularoraMain {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			CalculadoraJan calculadoraJan = new CalculadoraJan();

			calculadoraJan.setLocationRelativeTo(null);
			calculadoraJan.setVisible(true);
			calculadoraJan.setResizable(false);
			calculadoraJan.toFront();

		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException
				| UnsupportedLookAndFeelException exception) {
			exception.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}