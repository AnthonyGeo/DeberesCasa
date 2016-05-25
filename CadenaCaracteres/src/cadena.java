
import javax.swing.JOptionPane;

public class cadena {

	String cadena, cadena1,cadena2; 
	int pos;
	
	public  cadena(String cadena, int pos){
		this.cadena= cadena; 
		this.pos= pos; 
		
	}
	
	public void eliminar(){
		cadena1=cadena.substring(0,pos-1);
		cadena2=cadena.substring(pos);
		JOptionPane.showMessageDialog(null, cadena1+cadena2);
	}
	
}
