import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> twins =new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Clone yourself and have a twin!");
        System.out.println("Select I for IdenticalTwin or F for FraternalTwin: ");
        String option = scan.nextLine();
        if(option.equalsIgnoreCase("I")){
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter height: ");
            float height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float weight = scan.nextFloat();
            scan.nextLine();
            System.out.print("Enter hair color: ");
            String hair_color = scan.nextLine();

            identicalTwin identicalTwin1 = new identicalTwin();
            identicalTwin1.setName(name);
            identicalTwin1.setHeight(height);
            identicalTwin1.setWeight(weight);
            identicalTwin1.setHair_color(hair_color);

            twins.add(identicalTwin1);

            System.out.println();
            System.out.println("Twin's Information!");
            System.out.print("Enter name: ");
            String t_name = scan.nextLine();
            System.out.print("Enter weight: ");
            float t_weight = scan.nextFloat();

            identicalTwin identicalTwin2 = (identicalTwin) identicalTwin1.clone();
            identicalTwin2.setName(t_name);
            identicalTwin2.setWeight(t_weight);
            identicalTwin2.setHeight(identicalTwin1.getHeight());
            identicalTwin2.setHair_color(identicalTwin1.getHair_color());

            twins.add(identicalTwin2);

            System.out.println();
            System.out.println("Twin 1 Details:");
            identicalTwin1.print();

            System.out.println();
            System.out.println("Twin 2 Details:");
            identicalTwin2.print();
        } else {
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter height: ");
            float height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float weight = scan.nextFloat();
            scan.nextLine();
            System.out.print("Enter hair color: ");
            String hair_color = scan.nextLine();

            fraternalTwin f_twin1 = new fraternalTwin();
            f_twin1.setName(name);
            f_twin1.setHeight(height);
            f_twin1.setWeight(weight);
            f_twin1.setHair_color(hair_color);

            twins.add(f_twin1);

            System.out.println();
            System.out.println("Twin's information");
            System.out.print("Enter name: ");
            String f_name = scan.nextLine();
            System.out.print("Enter height: ");
            float f_height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float f_weight = scan.nextFloat();
            scan.nextLine();
            System.out.print("Enter hair color: ");
            String f_hair_color = scan.nextLine();

            fraternalTwin f_twin2 = (fraternalTwin) f_twin1.clone();
            f_twin2.setName(f_name);
            f_twin2.setWeight(f_weight);
            f_twin2.setHeight(f_height);
            f_twin2.setHair_color(f_hair_color);

            twins.add(f_twin2);

            System.out.println();
            System.out.println("Twin 1 Details:");
            f_twin1.print();

            System.out.println();
            System.out.println("Twin 2 Details:");
            f_twin2.print();
        }

    }
}
