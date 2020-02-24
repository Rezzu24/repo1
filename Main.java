package evaluacion;

public class Main {
	 
    public static void main(String[] args) {
   
        Electrodomestico lista[]=new Electrodomestico[10];
   
        //este es un ejemplo, no alcance a terminar ingresos por el usuario :(
        
        lista[0]=new Electrodomestico(200, 60, 'C', "Verde");
        lista[1]=new Lavadora(150, 30);
        lista[2]=new Television(500, 80, 'E', "negro", 42, false);
        lista[3]=new Electrodomestico();
        lista[4]=new Electrodomestico(600, 20, 'D', "gris");
        lista[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        lista[6]=new Television(250, 70);
        lista[7]=new Lavadora(400, 100, 'A', "verde", 15);
        lista[8]=new Television(200, 60, 'C', "naranja", 30, true);
        lista[9]=new Electrodomestico(50, 10);
   
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        for(int i=0;i<lista.length;i++){
           
            if(lista[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=lista[i].precioFinal();
            }
            if(lista[i] instanceof Lavadora){
                sumaLavadoras+=lista[i].precioFinal();
            }
            if(lista[i] instanceof Television){
                sumaTelevisiones+=lista[i].precioFinal();
            }
        }
        
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
   
}