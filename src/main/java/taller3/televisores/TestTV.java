package taller3.televisores;

class Marca {
	String nombre;

	public Marca(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

class Control {
	private TV tv;

	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}
	public void turnOn(){
		tv.turnOn();	
	}
	public void turnOff(){
        tv.turnOff();    
    }
	public void canalUp(){
        if(tv.getCanal() < 120){
            tv.canalUp();
        }
    }
	public void canalDown(){
        if(tv.getCanal() > 1){
            tv.canalDown();
        }
	}
	public void volumenUp(){
		tv.volumenUp();
	}
	public void volumenDown(){
        tv.volumenDown();
    }
	public void setCanal(int canal){
		tv.setCanal(canal);
	}
	public void setPrecio(int precio){
        tv.setPrecio(precio);
    }
}

class TV {
	private static int NumTV = 0;
	Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	private Control control;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getCanal() {
		return canal;
	}

	public Marca getMarca() {
		return marca;
	}

	public Control getControl() {
		return control;
	}

	public int getVolumen() {
		return volumen;
	}
	public int getPrecio() {
		return precio;
	}

	public static void setNumTV(int numTV) {
		NumTV = numTV;
	}

	public static int getNumTV() {
		return NumTV;
	}

	public void turnOn() {
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}

	public void canalUp() {
		if (this.estado) {
			this.canal++;
		}
	}

	public void canalDown() {
		if (this.estado) {
			this.canal--;
		}
	}

	public void volumenUp() {
		if (this.estado && this.volumen > 0 && this.volumen <= 7) {
			this.volumen++;
		}
	}

	public void volumenDown() {
		if (this.estado && this.volumen > 0 && this.volumen <= 7) {
			this.volumen--;
		}
	}
}

public class TestTV {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Semsung");
		Marca marca2 = new Marca("Lj");

		TV tv1 = new TV(marca1, true);
		TV tv2 = new TV(marca2, false);

		tv1.setPrecio(2000);
		tv2.setCanal(90);
		tv1.setCanal(121);
		tv2.setVolumen(7);

		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();

		System.out.println(tv2.getCanal());
		System.out.println(tv1.getPrecio());
		System.out.println(tv1.getMarca().getNombre());
		System.out.println(tv1.getCanal());
	}
}