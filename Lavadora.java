package evaluacion;

public class Lavadora extends Electrodomestico {
	
	private final static int cargaDefault=5;
	
	private int carga;
	
	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double extra = super.precioFinal();
		
		if (carga>50) {
			extra=+50;
		}
		return extra;
	}
	
	public Lavadora(){
        this(precioDefault, pesoDefault, consumoDefault, colorDefault, cargaDefault);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, consumoDefault, colorDefault, cargaDefault);
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
