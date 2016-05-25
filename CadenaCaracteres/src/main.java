import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String cadena;
		int pos,aux; 
		
		cadena=(JOptionPane.showInputDialog("Ingrese la cadena:"));
		aux=cadena.length();
		pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion: "));
        if(pos+1>aux){
        	JOptionPane.showMessageDialog(null, "Posicion Invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
		cadena cad = new cadena(cadena,pos+1); 
        cad.eliminar();}
	
	}

}
