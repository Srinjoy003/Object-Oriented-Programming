


// Department interface
interface Department {
    String depName = "";
    String depHead = "";
    void getData(String depName, String depHead);
    void printData();
}

// Hostel class
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int noOfRooms;

    public void getData(String hostelName, String hostelLocation, int noOfRooms) {

        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.noOfRooms = noOfRooms;
    }

    public void printData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }


}

class X;

// Student class implementing Department interface
class Student extends Hostel implements Department {
    private String studentName;
    private String regNo;
    private String electiveSubject;
    private double avgMarks;
    private String depName;
    private String depHead;

    public Student(String studentName, String regNo, String electiveSubject, double avgMarks) {
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    @Override
    public void getData(String depName, String depHead) {
        this.depName = depName;
        this.depHead = depHead;
    }

    @Override
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }

    public Object[] get(){
        Object[] obj = {studentName, regNo, avgMarks};
        return obj;
    }
}

// Driver class to test the Student class
public class InterfaceMain {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "S12345", "Mathematics", 85.5);
        student.getData("Math Department", "Prof. Smith");
        Object obj[] = student.get();
        System.out.println(obj[0] + " " + obj[2]);
        // Print all the details of the student including depName and depHead
        // student.printData();
    }
}
