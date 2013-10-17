package asdf;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class adff {
	public static void main (String[] args) throws IOException, InterruptedException {
	/*
		double a[] = new double [10];
	int b = 3 ;
	double c ;
	double d;
	double f;
	double g;	
	double e[] = new double [10];
	  
	   
	
	for(int i=0;i<10;i++){
	e[i] = i;
}
	//for(int i=100;i>0;i--){
	//e[i] = i;
}
	
	for(int i=0;i<10;i++){
		
		f = Math.pow(e[i],b);

		for(int j=0;j<10;j++){
		a[j]= j;
		d = Math.pow(a[j],b);
		g=f+d;
		c = Math.pow(g,.33333333333333333);
		System.out.println(a[j] +" "+ b +" "+ c +" "+ d +" "+ e[i] +" "+ f +" "+ g);
	//System.out.println(a[j]+"^"+b+"+"+e[i]+"^"+b+"="+c+"^"+b);
		}
		System.out.println();
		
		*/
		int a,b,c,d;
		a = 5;
		b = 1;
		c = 3;
		d = 4;
		
		System.out.print(a + " = "+ b + " " + c + " " + d);
		for(double i=0;i<100;i++){
			for(double j=0;j<100;j++){
				for(double k=0;k<100;k++){
					for(double l=0;l<100;l++){
						for(double m=0;m<100;m++){
							for(double n=0;n<100;n++){
								if((i*i*i*i*i == n*n*n*n*n+m*m*m*m*m+l*l*l*l*l+j*j*j*j*j+k*k*k*k*k) && (i != j)  && (i != k)  && (i != l) && (i != m) && (i != n) ) {
									System.out.println(i+" = "+j+' '+k+' '+l+' '+m+' '+n);
									break;
								}
							}
						}
					}					
				}
			}
			System.out.print(i +" ");
		}
		System.out.println("EnD");
}
}
