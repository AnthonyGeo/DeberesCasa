
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		figura diamond =  new figura();
		diamond.set_size(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o:")));
		System.out.print("Tama�o: ");
		System.out.println(diamond.get_size());
		diamond.dibujar(diamond.get_size());
	}

}
