

public class figura {
 int size; 
 
  public int get_size(){
	  return this.size; 
  }
  
  public void set_size(int size){
	  this.size= size; 
  }
  
  public void dibujar(int size){
	 size=size+1;
	  int aux=size-1,aux2=size-1;
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
	  for(int x=size+1;x<(size*2);x++){
	          for(int y=0;y<(size*2);y++){
	             if(y==aux ||y==aux2)
	            	 System.out.print("*");
	             else
	            	 System.out.print(" ");
	              
	                  }
	                  aux2++;
	                aux--; 
	                System.out.println();
	          }    
  }
}
