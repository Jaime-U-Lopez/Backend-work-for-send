public  class Comparendo {

    private int id;
    private static int contadorID=100;

    public Comparendo(Vehiculo vehiculo) {
        this.id=Comparendo.contadorID++;
    }

    public Comparendo(){};

    public void construirFotoMulta(int velocidad, Vehiculo vehiculo) {
        int calculoMulta = calcularComparendo(velocidad, vehiculo);
        String enviarCorreo = enviarCorreoFotomulta(vehiculo);
        if (calculoMulta == -1) {
            System.out.println("No hay calculo para el tipo de vehiculo " + vehiculo + " conduce bien ");
        } else {
            System.out.println("----Numero comparendo   : "+this.id+" \n ----El tipo de comparendo fue: " + calculoMulta + " \n ----Para el :  " + vehiculo+ " con placa :"+ vehiculo.getPlaca() +"  \n----Cuerpo del correo" + enviarCorreo +"\n\n");
        }
    }

    public int calcularComparendo(int velocidad, Vehiculo vehiculo) {

        if (vehiculo!=null) {
            if (velocidad <= vehiculo.getLimiteInferiorVehiculo() ) {
                return 0;
            } else if (velocidad >= vehiculo.getLimiteInferiorIntermedioVehiculo()
                    && velocidad <= vehiculo.getLimiteSuperiorVehiculo()) {
                return 1;
            }
            return 2;
        }
        return -1;
    }


    public String enviarCorreoFotomulta(Vehiculo vehiculo ) {

        if (vehiculo!=null) {
            String cuerpoMensaje = "//enviando correo para el tipo "+ vehiculo;
            String asunto = "//asunto: comparendo :" +vehiculo;
            return asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }

}
