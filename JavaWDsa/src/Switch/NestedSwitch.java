package Switch;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId =in.nextInt();
        String department = in.next();

        switch (empId){
            case 1 :
                System.out.println("joe park");
                break;
            case 2 :
                System.out.println("Mira Rao");
                break;
            case 3 :
                System.out.println("arin jp");
                switch ( department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management" :
                        System.out.println("Management Department");
                        break;
                    default :
                        System.out.println("No department entered");
                }
            default:
                System.out.println("Enter correct employee ID!");
        }
    }
}


