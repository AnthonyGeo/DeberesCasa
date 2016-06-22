package modelos;

import java.util.Scanner; 
import javax.swing.JOptionPane;

public class estructura  extends modelos{ 
	Scanner op = new Scanner(System.in); 
	int op1,aux5=0,op2,a1=0,a2=0,a3=0,a4=0,au1=0,au2=0,au3=0,au4=0,op3,a_1=0,a_2=0,a_3=0,a_4=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
    int j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,op4;
	public void menu(){
	do{
		op1=Integer.parseInt(JOptionPane.showInputDialog("OP1: Ingrese la compra a realizar"+"\n"+"OP2: Volumen total de ventas"+"\n"+"OP3: Volumen de ventas por centro"+"\n"+"OP4: Porcentaje de modelos vendidos"+"\n"+"OP5: Salir"));
	switch(op1){
	case 1:
		aux5++;
		op3=Integer.parseInt(JOptionPane.showInputDialog("OP1: Centro 1"+"\n"+"OP2: Centro 2"+"\n"+"OP3: Centro 3"+"\n"+"OP4: Centro 4"));
		switch(op3){
		case 1:
	    au1++;
		System.out.println("Ingrese el modelo a comprar: "); 
		op2=op.nextInt();
		if(op2==1){
			j++;
			System.out.println(this.modelo1+" "+this.precio1);
		    a1=relacion1(); 
		   
		}
		
		if(op2==2){
			k++;
			System.out.println(this.modelo2+" "+this.precio2);
		    a2=relacion2(); 
		    
		}
		
		if(op2==3){
			l++;
			System.out.println(this.modelo3+" "+this.precio3);
		    a3=relacion3(); 
		}
		
		if(op2==4){
			m++;
			System.out.println(this.modelo4+" "+this.precio4);
		    a4=relacion4(); 
		}
		break;
		case 2:
			 au2++;
			System.out.println("Ingrese el modelo a comprar: "); 
			op2=op.nextInt();
			if(op2==1){
				n++;
				System.out.println(this.modelo1+" "+this.precio1);
			    a_1=relacion5(); 
			}
			
			if(op2==2){
				o++;
				System.out.println(this.modelo2+" "+this.precio2);
			    a_2=relacion6(); 
			}
			
			if(op2==3){
				p++;
				System.out.println(this.modelo3+" "+this.precio3);
			    a_3=relacion7(); 
			}
			
			if(op2==4){
				q++;
				System.out.println(this.modelo4+" "+this.precio4);
			    a_4=relacion8(); 
			}
			break;
		case 3:
			 au3++;
			System.out.println("Ingrese el modelo a comprar: "); 
			op2=op.nextInt();
			if(op2==1){
				r++;
				System.out.println(this.modelo1+" "+this.precio1);
			    a=relacion9(); 
			}
			
			if(op2==2){
				s++;
				System.out.println(this.modelo2+" "+this.precio2);
			    b=relacion10();
			}
			
			if(op2==3){
				t++;
				System.out.println(this.modelo3+" "+this.precio3);
			    c=relacion11();
			}
			
			if(op2==4){
				u++;
				System.out.println(this.modelo4+" "+this.precio4);
			    d=relacion12();
			}
			break;
		case 4:
			 au4++;
			System.out.println("Ingrese el modelo a comprar: "); 
			op2=op.nextInt();
			if(op2==1){
				v++;
				System.out.println(this.modelo1+" "+this.precio1);
			    e=relacion13(); 
			}
			
			if(op2==2){
				w++;
				System.out.println(this.modelo2+" "+this.precio2);
			    f=relacion14();
			}
			
			if(op2==3){
				x++;
				System.out.println(this.modelo3+" "+this.precio3);
			    g=relacion15();
			}
			
			if(op2==4){
				y++; 
				System.out.println(this.modelo4+" "+this.precio4);
			    h=relacion16();
			}
			break;
		}
	break; 
	
	case 2:
		JOptionPane.showMessageDialog(null, "Total de ventas: " + Integer.toString(aux5)+"\n"+" Monto: "+ Integer.toString(a1+a2+a3+a4+a_1+a_2+a_3+a_4+a+b+c+d+e+f+g+h));
	break; 
	case 3:
		JOptionPane.showMessageDialog(null, " Centro 1 "+" Total ventas: "+Integer.toString(au1) +" Monto: "+ Integer.toString(a1+a2+a3+a4)+"\n"+" Centro 2 "+" Total ventas: "+Integer.toString(au2)+" Monto: "+ Integer.toString(a_1+a_2+a_3+a_4)+"\n"+" Centro 3 "+" Total ventas: "+Integer.toString(au3) +" Monto: "+ Integer.toString(a+b+c+d)+"\n"+" Centro 4 "+" Total ventas: "+Integer.toString(au4) +" Monto: "+ Integer.toString(e+f+g+h));
	break;
	case 4:
		if(aux5!=0){
		op4=Integer.parseInt(JOptionPane.showInputDialog("Centro 1"+"\n"+"Centro 2"+"\n"+"Centro 3"+"\n"+"Centro 4")); 
	switch(op4){
	case 1:
		if(au1!=0){
		JOptionPane.showMessageDialog(null, "Modelo 1: "+this.modelo1+" Porcentaje: "+ Integer.toString((j*100)/au1));
		JOptionPane.showMessageDialog(null, "Modelo 2: "+this.modelo2+" Porcentaje: "+ Integer.toString((k*100)/au1));
		JOptionPane.showMessageDialog(null, "Modelo 3: "+this.modelo3+" Porcentaje: "+ Integer.toString((l*100)/au1));
		JOptionPane.showMessageDialog(null, "Modelo 4: "+this.modelo4+" Porcentaje: "+ Integer.toString((m*100)/au1));	
		}else
			JOptionPane.showMessageDialog(null, "No se han registrado ventas en este centro","Error",JOptionPane.ERROR_MESSAGE);
			
	break; 
	
	case 2:
		if(au2!=0){
		JOptionPane.showMessageDialog(null, "Modelo 1: "+this.modelo1+" Porcentaje: "+ Integer.toString((n*100)/au2));
		JOptionPane.showMessageDialog(null, "Modelo 2: "+this.modelo2+" Porcentaje: "+ Integer.toString((o*100)/au2));
		JOptionPane.showMessageDialog(null, "Modelo 3: "+this.modelo3+" Porcentaje: "+ Integer.toString((p*100)/au2));
		JOptionPane.showMessageDialog(null, "Modelo 4: "+this.modelo4+" Porcentaje: "+ Integer.toString((q*100)/au2));	
		}else
			JOptionPane.showMessageDialog(null, "No se han registrado ventas en este centro","Error",JOptionPane.ERROR_MESSAGE);
	break;
	
	case 3:
		if(au3!=0){
		JOptionPane.showMessageDialog(null, "Modelo 1: "+this.modelo1+" Porcentaje: "+ Integer.toString((r*100)/au3));
		JOptionPane.showMessageDialog(null, "Modelo 2: "+this.modelo2+" Porcentaje: "+ Integer.toString((s*100)/au3));
		JOptionPane.showMessageDialog(null, "Modelo 3: "+this.modelo3+" Porcentaje: "+ Integer.toString((t*100)/au3));
		JOptionPane.showMessageDialog(null, "Modelo 4: "+this.modelo4+" Porcentaje: "+ Integer.toString((u*100)/au3));	
		}else
			JOptionPane.showMessageDialog(null, "No se han registrado ventas en este centro","Error",JOptionPane.ERROR_MESSAGE);
	break;
	
	case 4:
		if(au4!=0){
		JOptionPane.showMessageDialog(null, "Modelo 1: "+this.modelo1+" Porcentaje: "+ Integer.toString((v*100)/au4));
		JOptionPane.showMessageDialog(null, "Modelo 2: "+this.modelo2+" Porcentaje: "+ Integer.toString((w*100)/au4));
		JOptionPane.showMessageDialog(null, "Modelo 3: "+this.modelo3+" Porcentaje: "+ Integer.toString((x*100)/au4));
		JOptionPane.showMessageDialog(null, "Modelo 4: "+this.modelo4+" Porcentaje: "+ Integer.toString((y*100)/au4));	
		}else
			JOptionPane.showMessageDialog(null, "No se han registrado ventas en este centro","Error",JOptionPane.ERROR_MESSAGE);
	break;
	}
	
	
	
	}
		else
			JOptionPane.showMessageDialog(null, "No se han registrado ventas","Error",JOptionPane.ERROR_MESSAGE);
	break;
	
	case 5:
		JOptionPane.showMessageDialog(null, "Saliendo","Atencion",JOptionPane.WARNING_MESSAGE);
	break;
	}
	}while(op1!=5);
	
	}
	
	
	
	
}
