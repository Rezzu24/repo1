package evaluacion;

public class Electrodomestico {
	   
    protected final static String colorDefault="blanco";
    protected final static char consumoDefault='F';
    protected final static double precioDefault=100;
    protected final static double pesoDefault=5;
    protected double precioBase;
    protected String color;
    protected char consumo;
   
    protected double peso;
   
    private void comprobarColor(String color){
   
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=colorDefault;
        }
          
          
    }
   
    public void comprobarConsumoEnergetico(char consumo){
          
        if(consumo>=65 && consumo<=70){
            this.consumo=consumo;
        }else{
            this.consumo=consumoDefault;
        }
          
    }
   
    public double getPrecioBase() {
        return precioBase;
    }
    
    public String getColor() {
        return color;
    }
   
    public char getConsumo() {
        return consumo;
    }
  
    public double getPeso() {
        return peso;
    }
  
    public double precioFinal(){
        double extra=0;
        switch(consumo){
            case 'A':
                extra+=100;
                break;
            case 'B':
                extra+=80;
                break;
            case 'C':
                extra+=60;
                break;
            case 'D':
                extra+=50;
                break;
            case 'E':
                extra+=30;
                break;
            case 'F':
                extra+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            extra+=10;
        }else if(peso>=20 && peso<49){
            extra+=50;
        }else if(peso>=50 && peso<=79){
            extra+=80;
        }else if(peso>=80){
            extra+=100;
        }
   
        return precioBase+extra;
    }
   
    public Electrodomestico(){
        this(precioDefault, pesoDefault, consumoDefault, colorDefault);
    }
  
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, consumoDefault, colorDefault);
    }
   
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
   
}