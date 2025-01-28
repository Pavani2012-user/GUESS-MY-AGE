
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        try(Scanner ab= new Scanner(System.in)){

        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        String birthDateInput = ab.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateInput);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        }
    }
}

