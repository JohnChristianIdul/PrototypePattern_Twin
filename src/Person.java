public abstract class Person implements Cloneable{
    protected String name;
    protected float height;
    protected String gender;
    protected String hair_color;
    protected float weight;

    public Person(){
    }

    public Person(String name, String gender, float height, float weight, String hair_color) {
        this.name = name;
        this.height = height;
        this.gender = gender;
        this.hair_color = hair_color;
        this.weight = weight;
    }


    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Hair Color: " + hair_color);
    }
    public abstract Person clone();
}
