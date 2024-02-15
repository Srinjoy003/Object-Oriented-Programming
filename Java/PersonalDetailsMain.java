// Class PersonDetails has methods to accept and show the date of birth of a person. Inner class ageCalculator calculates the age of a person based on the above inputs. 
// Implement the mentioned scenario in a Java program in the following 2 different ways - a. static inner class b. non-static inner class. 
// Also show how you can create objects of the inner class in the main method.

import java.time.LocalDate;
import java.time.Period;

class PersonalDetails{

    private LocalDate dob;

    public PersonalDetails(LocalDate dob_val){
        dob = dob_val;
    }

    static class AgeCalculator1{ //no need to create a object to access inner class

        int CalculateAge(LocalDate dob){
            LocalDate curDate = LocalDate.now();
            int years = Period.between(dob, curDate).getYears();
            return years;
        }
      
    }

    public class AgeCalculator2{ //no need to create a object to access inner class

        int CalculateAge(){ //no need to provide dob argument
            LocalDate curDate = LocalDate.now();
            int years = Period.between(dob, curDate).getYears();
            return years;
        }
      
    }

}



public class PersonalDetailsMain{

    public static void main(String[] args){

    LocalDate dob1 = LocalDate.of(2003, 9, 12);
    LocalDate dob2 = LocalDate.of(2004, 9, 12);

    PersonalDetails.AgeCalculator1 A1 = new PersonalDetails.AgeCalculator1();
    int age = A1.CalculateAge(dob1);
    System.out.println(age);


    PersonalDetails P = new PersonalDetails(dob2);
    PersonalDetails.AgeCalculator2 AgeCal = P.new AgeCalculator2();
    age = AgeCal.CalculateAge();
    System.out.println(age);

    }
}
