import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Driver driver1 = new Driver(1,"Beksultan Rizaev",(byte)25,'m',"bakas@gmail.com","+996777777777",50000.50,"Mercedes-Benz");

        System.out.println("- - - Driver1 - - -");
        System.out.println("ID: "+driver1.getId());
        System.out.println("Full name: "+driver1.getFullName());
        System.out.println("Last name: "+driver1.getLastName());
        System.out.println("Age: "+driver1.getAge());
        System.out.println("Gender: "+driver1.getGender());
        System.out.println("Email: "+driver1.getEmail());
        System.out.println("Phone number: "+driver1.getPhoneNumber());
        System.out.println("Government salary: "+driver1.getGovernmentsSalary());
        System.out.println("Date of birth: " + driver1.getDateOfBrith(LocalDate.of(2000, 6, 12)));
        System.out.println("Car: "+driver1.getCar());
        driver1.favoriteSport();
        driver1.favoriteLanguage();
        System.out.println(driver1.getClass());

        System.out.println();

        Doctor doctor1 = new Doctor(2,"Bakai Koichubaev",(byte)30,'m',"bakai@gmail.com","+996555555555",60000.50,"Hospital");
        System.out.println("- - - Doctor1 - - -");
        System.out.println("ID: "+doctor1.getId());
        System.out.println("Full name: "+doctor1.getFullName());
        System.out.println("Age: "+doctor1.getAge());
        System.out.println("Gender: "+doctor1.getGender());
        System.out.println("Email: "+doctor1.getEmail());
        System.out.println("Phone number: "+doctor1.getPhoneNumber());
        System.out.println("Government salary: "+doctor1.getGovernmentsSalary());
        System.out.println("Date of birth: " + doctor1.getDateOfBrith(LocalDate.of(1990, 4, 2)));
        System.out.println("Hospital: "+doctor1.getHospital());
        System.out.println(doctor1.getClass());

        System.out.println();

        Programmer programmer1 = new Programmer(3,"Uluk",(byte)5,'m',"uluk@gmail.com","+996222222222",0.00,"Laptop");
        System.out.println("- - - Programmer1 - - -");
        System.out.println("ID: "+programmer1.getId());
        System.out.println("Full name: "+programmer1.getFullName());
        System.out.println("Age: "+programmer1.getAge());
        System.out.println("Gender: "+programmer1.getGender());
        System.out.println("Email: "+programmer1.getEmail());
        System.out.println("Phone number: "+programmer1.getPhoneNumber());
        System.out.println("Government salary: "+programmer1.getGovernmentsSalary());
        System.out.println("Date of birth: " + programmer1.getDateOfBrith(LocalDate.of(1995, 4, 1)));
        System.out.println("Laptop: "+programmer1.getLaptop());
        System.out.println(programmer1.getClass());

    }
}