import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		int filas=0,columnas=0,a; 
		filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
	    columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
	    int matriz[][]=new int [filas][columnas];
	    matriz arr = new matriz ( filas, columnas , matriz); 
		arr.llenar();
		arr.imprimir();
		
	}
	

}
