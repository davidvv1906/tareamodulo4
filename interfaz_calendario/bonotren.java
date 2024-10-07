package interfaz_calendario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

public class bonotren {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bonotren window = new bonotren();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bonotren() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 192));
		frame.setBounds(100, 100, 596, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSelect = new JLabel("Seleccione el mes para recargar su abono:");
		frame.getContentPane().add(lblSelect);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.getComboBox().setBackground(new Color(0, 255, 255));
		monthChooser.getComboBox().setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(monthChooser);
		
		JButton btnNewButton = new JButton("Recargar Abono");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int mesSeleccionado=monthChooser.getMonth();
				String mes="";
				switch (mesSeleccionado) {
				case 0:
					mes="Enero";
					break;
				case 1:
					mes="Febrero";
					break;
				case 2:
					mes="Marzo";
					break;
				case 3:
					mes="Abril";
					break;
				case 4:
					mes="Mayo";
					break;
				case 5:
					mes="Junio";
					break;
				case 6:
					mes="Julio";
					break;
				case 7:
					mes="Agosto";
					break;
				case 8:
					mes="Septiembre";
					break;
				case 9:
					mes="Octubre";
					break;
				case 10:
					mes="Noviembre";
					break;
				case 11:
					mes="Diciembre";
					break;

				default:
					break;
				}
				JOptionPane.showMessageDialog(null, "Su abono de transporte ha sido recargado para el mes de: "+mes);
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(btnNewButton);
		;
		
	}
}
