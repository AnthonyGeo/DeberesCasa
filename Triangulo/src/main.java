
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		figura triangulo = new figura();
		triangulo.set_size(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o:")));
		System.out.print("Tama�o: ");
		System.out.println(triangulo.get_size());
		triangulo.dibujar(triangulo.get_size());
		

	}

}
