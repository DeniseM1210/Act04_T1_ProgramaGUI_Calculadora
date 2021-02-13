import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class VentanaCalc extends JFrame{
	JTextField cajaNum;
	JButton btnPorcentaje, btnRaiz, btnCuadrado, btnUnoX, btnCE,
	btnC, btnBorrar, btnDividir, btnNum7, btnNum8, btnNum9, btnMulti,
	btnNum4, btnNum5, btnNum6, btnResta, btnNum1, btnNum2, btnNum3,
	btnSuma, btnMasMenos, btnNum0, btnPunto, btnIgual;
	public VentanaCalc() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(245, 480);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel txtTexto1 = new JLabel("Calculadora");
		txtTexto1.setBounds(0, 0, 200, 20);
		add(txtTexto1);
		
		cajaNum  = new JTextField(10);
		cajaNum.setBounds(0, 20, 230, 80);
		add(cajaNum);
		
		btnPorcentaje = new JButton("%");
		btnPorcentaje.setBounds(0, 100, 55, 55);
		add(btnPorcentaje);
		
		btnRaiz = new JButton();
		btnRaiz.setBounds(57, 100, 55, 55);
		add(btnRaiz);
		
		btnCuadrado = new JButton();
		btnCuadrado.setBounds(114, 100, 55, 55);
		add(btnCuadrado);
		
		btnUnoX = new JButton("1/x");
		btnUnoX.setBounds(171, 100, 55, 55);
		add(btnUnoX);
		
		btnCE = new JButton("CE");
		btnCE.setBounds(0, 157, 55, 55);
		add(btnCE);
		
		btnC = new JButton("C");
		btnC.setBounds(57, 157, 55, 55);
		add(btnC);
		
		btnBorrar = new JButton("<-");
		btnBorrar.setBounds(114, 157, 55, 55);
		add(btnBorrar);
		
		btnDividir = new JButton("/");
		btnDividir.setBounds(171, 157, 55, 55);
		add(btnDividir);
		
		btnNum7 = new JButton("7");
		btnNum7.setBounds(0, 214, 55, 55);
		add(btnNum7);
		
		btnNum8 = new JButton("8");
		btnNum8.setBounds(57, 214, 55, 55);
		add(btnNum8);
		
		btnNum9 = new JButton("9");
		btnNum9.setBounds(114, 214, 55, 55);
		add(btnNum9);
		
		btnMulti = new JButton("X");
		btnMulti.setBounds(171, 214, 55, 55);
		add(btnMulti);
		
		btnNum4 = new JButton("4");
		btnNum4.setBounds(0, 271, 55, 55);
		add(btnNum4);
		
		btnNum5 = new JButton("5");
		btnNum5.setBounds(57, 271, 55, 55);
		add(btnNum5);
		
		btnNum6 = new JButton("6");
		btnNum6.setBounds(114, 271, 55, 55);
		add(btnNum6);
		
		btnResta = new JButton("-");
		btnResta.setBounds(171, 271, 55, 55);
		add(btnResta);
		
		btnNum1 = new JButton("1");
		btnNum1.setBounds(0, 328, 55, 55);
		add(btnNum1);
		
		btnNum2 = new JButton("2");
		btnNum2.setBounds(57, 328, 55, 55);
		add(btnNum2);
		
		btnNum3 = new JButton("3");
		btnNum3.setBounds(114, 328, 55, 55);
		add(btnNum3);
		
		btnSuma = new JButton("+");
		btnSuma.setBounds(171, 328, 55, 55);
		add(btnSuma);
		
		btnMasMenos = new JButton("+-");
		btnMasMenos.setBounds(0, 385, 55, 55);
		add(btnMasMenos);
		
		btnNum0 = new JButton("0");
		btnNum0.setBounds(57, 385, 55, 55);
		add(btnNum0);
		
		btnPunto = new JButton(".");
		btnPunto.setBounds(114, 385, 55, 55);
		add(btnPunto);
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(171, 385, 55, 55);
		add(btnIgual);
		
		setVisible(true);
	}
}
public class PruebaCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaCalc();
				
			}
		});
	}

}
