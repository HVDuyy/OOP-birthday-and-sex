import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class selfStudy {
    private String name;
    private boolean sex; // true = Male, false = Female
    private Date birthday;

    // Constructor
    public selfStudy() {}
    public selfStudy(String name, boolean sex, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
    public void enter(Scanner scanner){
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Sex: ");
        sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Enter Birthday: ");
        try {
            String dateInput = scanner.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            birthday = formatter.parse(dateInput);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter in dd/MM/yyyy format.");
        }
    }
    // Method to display information
    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + (sex ? "Male" : "Female"));
        System.out.println("Birthday: " + sdf.format(birthday));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        selfStudy x = new selfStudy();
        x.enter(scanner);
        x.display();
        scanner.close();
    }
}
