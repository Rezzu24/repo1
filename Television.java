package evaluacion;

public class Television extends Electrodomestico{
	
    private final static int resDefault=20;
  
    private int resolucion;
  
    private boolean sintonizadorTDT;
  
    public double precioFinal(){
    
        double plus=super.precioFinal();
  
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
  
        return plus;
    }
  
    public Television(){
        this(precioDefault, pesoDefault,consumoDefault, colorDefault, resDefault, false);
    }
  
    public Television(double precioBase, double peso){
        this(precioBase, peso, consumoDefault, colorDefault, resDefault, false);
    }
  
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}