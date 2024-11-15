package taller3.televisores;

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

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        if (tv.getCanal() < 120) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv.getCanal() > 1) {
            tv.canalDown();
        }
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
    }

    public void setCanal(int canal) {
        tv.setCanal(canal);
    }

    public void setPrecio(int precio) {
        tv.setPrecio(precio);
    }
}
