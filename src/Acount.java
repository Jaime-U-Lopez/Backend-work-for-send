public class Acount {

    private Double saldoDeCuenta;
    private long numeroDeCuenta;
    public double ingreso;
    public double retiro;
    public String tipoCuenta;

    public Acount(Double saldoDeCuenta) {

        this.saldoDeCuenta = saldoDeCuenta + this.ingreso - this.retiro;

        long leftLimit = 198L;
        long rightLimit = 100000000L;
        this.tipoCuenta = " Current";
        this.numeroDeCuenta = (long) (Math.random() * (rightLimit - leftLimit));

    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void setRetiro(double retiro) {

        if (this.saldoDeCuenta >= this.retiro) {
            this.retiro = retiro;

        } else {
            System.out.println("saldoDeCuenta insufficient balance for whithdraw  money = " + saldoDeCuenta);

        }
    }

    public Double getSaldoDeCuenta() {

        if (this.saldoDeCuenta >= this.retiro) {
            this.saldoDeCuenta = this.saldoDeCuenta - this.retiro + this.ingreso;
            return saldoDeCuenta;

        } else {
            System.out.println("saldoDeCuenta insufficient balance for whithdraw  money  = " +  this.retiro+ " \n acount balance is: "+ saldoDeCuenta);
            return saldoDeCuenta;
        }
    }

    public void getDatoscuenta() {
        System.out.println("Name :" + " Acount balance  : $" + this.saldoDeCuenta +
                " Number acount :" + this.numeroDeCuenta + " Type acount  :" + this.tipoCuenta);
    }


    @Override
    public String toString() {
        return "Acount{" +
                "saldoDeCuenta=" + saldoDeCuenta +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", ingreso=" + ingreso +
                ", retiro=" + retiro +

                '}';
    }
}
