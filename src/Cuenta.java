public class Cuenta {

    private  Double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;
    public double ingreso;
    public double retiro;
    public String tipoCuenta;

    public Cuenta( String nombreDelTitular,Double saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta + this.ingreso - this.retiro;
        this.nombreDelTitular = nombreDelTitular;
        long leftLimit = 198L;
        long rightLimit = 100000000L;
        this.tipoCuenta=" Current";
        this.numeroDeCuenta= (long) (Math.random() * (rightLimit - leftLimit));

    }
    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void setRetiro(double retiro){
        this.retiro=retiro;
    }

    public Double getSaldoDeCuenta() {
        this.saldoDeCuenta=  this.saldoDeCuenta-this.retiro+this.ingreso;
        return saldoDeCuenta;
    }
    public void getDatoscuenta() {
        System.out.println( "Name :"+ this.nombreDelTitular+" Acount balance  : $"+ this.saldoDeCuenta +
                " Number acount :"+this.numeroDeCuenta + " Type acount  :" +this.tipoCuenta );
    }

}
