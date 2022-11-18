import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person{
    private String hospital;
    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,String hospital) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.hospital=hospital;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Baseball");
    }

    @Override
    public String favoriteLanguage() {
        return "English";
    }

    @Override
    public Month favoriteMouth() {
        return Month.JANUARY;
    }

    @Override
    public String getLastName() {
        return "Koichubaev";
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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
