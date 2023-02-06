package Ejercicio3Profesiones;

public class Profesion {

    private long sueldo;
    private long bono;




    public Profesion(long bono ) {
        this.sueldo = 2000000;
        this.bono=bono;
    }

    public long calcularSueldo() {

        long total = this.sueldo + this.bono;
        return total;

    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }
}
