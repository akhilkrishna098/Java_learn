package Interface;

public class VehicleCarMain implements Car{

    public void travel(){
        System.out.println("A vehicle can travel");
    }


    public void tyres() {
        System.out.println("A Car has 4 Tyres");
    }

    public static void main(String[] args) {
        VehicleCarMain vcm1 = new VehicleCarMain();
        vcm1.travel();
        vcm1.tyres();
    }

}
