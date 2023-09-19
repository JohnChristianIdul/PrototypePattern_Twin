import java.util.ArrayList;
import java.util.Scanner;

public abstract class Main{

    public static void main(String[] args) {
        ArrayList<Person> twins =new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Clone yourself and have a twin!");
        System.out.print("Select 'I' for IdenticalTwin or 'F' for FraternalTwin: ");
        String option = scan.nextLine();
        if(option.equalsIgnoreCase("I")){

            identicalTwin identicalTwin1 = new identicalTwin();

            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter Gender: ");
            String gender = scan.nextLine();
            System.out.print("Enter hair color: ");
            String hair_color = scan.nextLine();
            System.out.print("Enter height: ");
            float height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float weight = scan.nextFloat();


            identicalTwin1.setName(name);
            identicalTwin1.setGender(gender);
            identicalTwin1.setHeight(height);
            identicalTwin1.setWeight(weight);
            identicalTwin1.setHair_color(hair_color);

            twins.add(identicalTwin1);

            identicalTwin identicalTwin2 = (identicalTwin) identicalTwin1.clone();

            System.out.println();
            System.out.println("Twin's Information!");
            System.out.print("Enter name: ");
            String t_name = scan.nextLine();
            scan.nextLine();
            System.out.print("Enter height: ");
            float t_height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float t_weight = scan.nextFloat();

            identicalTwin2.setName(t_name);
            identicalTwin2.setGender(identicalTwin1.getGender());
            identicalTwin2.setHeight(t_height);
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
            fraternalTwin f_twin1 = new fraternalTwin();

            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter Gender: ");
            String gender = scan.nextLine();
            System.out.print("Enter hair color: ");
            String hair_color = scan.nextLine();
            scan.nextLine();
            System.out.print("Enter height: ");
            float height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float weight = scan.nextFloat();

            f_twin1.setName(name);
            f_twin1.setGender(gender);
            f_twin1.setHeight(height);
            f_twin1.setWeight(weight);
            f_twin1.setHair_color(hair_color);

            twins.add(f_twin1);

            fraternalTwin f_twin2 = (fraternalTwin) f_twin1.clone();

            System.out.println();
            System.out.println("Twin's information");
            System.out.print("Enter name: ");
            String f_name = scan.nextLine();
            System.out.print("Enter Gender: ");
            String f_gender = scan.nextLine();
            System.out.print("Enter hair color: ");
            String f_hair_color = scan.nextLine();
            scan.nextLine();
            System.out.print("Enter height: ");
            float f_height = scan.nextFloat();
            System.out.print("Enter weight: ");
            float f_weight = scan.nextFloat();

            f_twin2.setName(f_name);
            f_twin2.setGender(f_gender);
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
