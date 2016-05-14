
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		figura diamond =  new figura();
		diamond.set_size(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño:")));
		System.out.print("Tamaño: ");
		System.out.println(diamond.get_size());
		diamond.dibujar(diamond.get_size());
	}

}
