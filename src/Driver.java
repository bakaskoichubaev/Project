import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person {
    private String car;

    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String car) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.car = car;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Football");
    }

    @Override
    public String favoriteLanguage() {

        return "Russian";
    }

    @Override
    public Month favoriteMouth() {
        return Month.APRIL;
    }

    @Override
    public String getLastName() {
        String [] fullName=getFullName().split(" ");
        return fullName[1];
    }

    @Override
    public LocalDate getDateOfBrith(LocalDate localDate) {
        return localDate;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return null;
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

}
