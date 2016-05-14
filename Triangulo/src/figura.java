
public class figura {
	int size; 
	
	public int get_size(){
		return this.size; 
	}

	public void set_size(int size){
		this.size = size; 
	}
    
	public void dibujar( int size){
		  int aux=size,aux2=size;
		  for(int x=0;x<size;x++){
		          for(int y=0;y<(size*2)+1;y++){
		             if(y==aux ||y==aux2)
		             System.out.print("*");
		             else
		            	 System.out.print(" ");        
		                  }
		                  aux2--;
		                aux++; 
		                System.out.println();
		          }
		          aux=size*2-3;
		          aux2=1;
		 for ( int x=0; x<(size*2)+1 ; x++){
			 System.out.print("*");
		 }
			 
	}
}
