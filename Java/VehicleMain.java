

class Vehicle{

    protected int licenceNum;
    protected int speed;
    protected String colour;
    protected String ownerName;

    public Vehicle(int licenceNum, int speed, String colour, String ownerName){
        this.licenceNum = licenceNum;
        this.speed = speed;
        this.colour = colour;
        this.ownerName = ownerName;
    }

    public void Set(int licenceNum, int speed, String colour, String ownerName){
        this.licenceNum = licenceNum;
        this.speed = speed;
        this.colour = colour;
        this.ownerName = ownerName;
    }

    public void ShowData(){
        System.out.println("Licence Number: " + licenceNum);
        System.out.println("Speed: " + speed);
        System.out.println("Colour: " + colour);
        System.out.println("Owner Name: " + ownerName);
    }

}

class Bus extends Vehicle{
    private String routeTo;

    public Bus(int licenceNum, int speed, String colour, String ownerName, String routeTo){
        super(licenceNum, speed, colour, ownerName);                                          //to use parent constructor
        this.routeTo = routeTo;

    }

    public void Set(int licenceNum, int speed, String colour, String ownerName, String routeTo){
        super.Set(licenceNum, speed, colour, ownerName);                                        //to use parent Set
        this.routeTo = routeTo;

    }

    public void ShowData(){
        super.ShowData();
        System.out.println("Route To: " + routeTo);
    }
}

class Car extends Vehicle{
    private String mName;

    public Car(int licenceNum, int speed, String colour, String ownerName, String mName){
        super(licenceNum, speed, colour, ownerName);
        this.mName = mName;

    }

    public void Set(int licenceNum, int speed, String colour, String ownerName, String mName){
        super.Set(licenceNum, speed, colour, ownerName);
        this.mName = mName;

    }

    public void ShowData(){
        super.ShowData();
        System.out.println("Manufacture Name: " + mName);
    }
}


public class VehicleMain{

    public static void main(String[] args){
        Bus B = new Bus(1000, 40, "blue", "Mark", "Kolkata");
        Car C = new Car(1001, 41, "red", "Jack", "Toyota");

        B.ShowData();
        System.out.println();
        C.ShowData();

    }
}