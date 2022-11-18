import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person{
    private String laptop;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,String laptop) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.laptop=laptop;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Swimming");

    }

    @Override
    public String favoriteLanguage() {
        return "Kyrgyz language";
    }

    @Override
    public Month favoriteMouth() {
        return Month.AUGUST;
    }

    @Override
    public String getLastName() {
        return "Abdraev";
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

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }
}
