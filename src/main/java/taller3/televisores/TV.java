package taller3.televisores;

class TV {
    private static int NumTV = 0;
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
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