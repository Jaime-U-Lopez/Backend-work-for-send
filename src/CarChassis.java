public class CarChassis {

    private  int idCarChassis;
    private static int contadorCarChassis;
    private int capacity;
    private String colour;

    public CarChassis( int capacity, String colour){

        this.capacity=capacity;
        this.colour=colour;

        this.idCarChassis=CarChassis.contadorCarChassis++;

    }


    public void getSeeChassis(){

        System.out.println("\n idCarChasssis : "+ this.idCarChassis+ " Capacity : "+
                this.capacity+" Color :" + this.colour
                );

    }


}
