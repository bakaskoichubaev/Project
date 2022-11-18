import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    void favoriteSport();
    String favoriteLanguage();
    Month favoriteMouth();
    String getLastName();
    LocalDate getDateOfBrith(LocalDate localDate);
    String getPhoneNumberAndEmail();
    long [] getPeopleOfAllAges(Person [] people);
}
