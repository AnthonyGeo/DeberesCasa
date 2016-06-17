package safasdasd;

import java.util.Scanner; 
import java.util.Random; 
import javax.swing.JOptionPane;

public class matriz {
    int filas , columnas; 
	int [][]matriz=new int [filas][columnas];
	Scanner sc=new Scanner(System.in);
	public matriz (int filas, int columnas , int [][]matriz ){
		this.filas=filas;
		this.columnas=columnas; 
		this.matriz=matriz; 
	}
	public void llenar(){
		
		Random aux = new Random(); 
		
	    for(int i=0;i<filas;i++){
			for(int x=0;x<columnas;x++){
				matriz[i][x]=aux.nextInt(100)+1; 
			}
		}
	    System.out.println("");
	    System.out.println("Matriz de: "+filas+" * "+columnas);
	    for(int i=0;i<filas;i++){
			for(int x=0;x<columnas;x++){
				if(matriz[i][x]>9)
				System.out.print(matriz[i][x]+" ");
				else
					System.out.print(matriz[i][x]+"  ");
			}
			System.out.println("");
		}
	}
	public void imprimir(){
		int unidad=0,decena=0,centena=0;
		System.out.println("");
		System.out.println("Ingrese el digito: ");
		int digito= sc.nextInt(); 
		
		/*
		unidad = numero % 10;
		decena = (numero / 10) % 10;
		centena = (numero / 10) / 10;*/
		 for(int i=0;i<filas;i++){
				for(int x=0;x<columnas;x++){
					if(matriz[i][x]>=1){
					unidad=matriz[i][x]%10;
					if(unidad==digito)
						System.out.println(matriz[i][x]);
				
					}
					/* if(matriz[i][x]>9 && matriz[i][x]<100){
						unidad=matriz[i][x]%10;					
						decena=(matriz[i][x]/10)%10; 
						if(unidad==digito || decena == digito)
							System.out.println(matriz[i][x]);
						
					 }
					 if (matriz[i][x]>99){
						unidad=matriz[i][x]%10;					
						decena=(matriz[i][x]/10)%10;
						centena=(matriz[i][x]/10)/10;
				if(unidad==digito || decena == digito || centena==digito)
						System.out.println(matriz[i][x]);
					}*/
				}
		 }
	
	}
	
}
