import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Twins> twins =new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Clone yourself and have a twin!");
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter height: ");
        float height = scan.nextFloat();
        System.out.print("Enter weight: ");
        float weight = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter hair color: ");
        String hair_color = scan.nextLine();

        Person p1 = new Person();
        p1.setName(name);
        p1.setHeight(height);
        p1.setWeight(weight);
        p1.setHair_color(hair_color);

        twins.add(p1);

        System.out.println();
        System.out.println("Twin's attribute!");
        System.out.print("Enter name: ");
        String t_name = scan.nextLine();
        System.out.print("Enter height: ");
        float t_height = scan.nextFloat();
        System.out.print("Enter weight: ");
        float t_weight = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter hair color: ");
        String t_hair_color = scan.nextLine();

        Person p2 = (Person) p1.clone();
        p2.setName(t_name);
        p2.setHeight(t_height);
        p2.setWeight(t_weight);
        p2.setHair_color(t_hair_color);

        twins.add(p2);

        System.out.println();
        System.out.println("Twin 1 Details:");
        p1.print();

        System.out.println();
        System.out.println("Twin 2 Details:");
        p2.print();
    }
}
