public abstract class Person implements Cloneable{
    protected String name;
    protected float height;
    protected String hair_color;
    protected float weight;

    public Person(){

    }

    public Person(String name, float height, String hair_color, float weight) {
        this.name = name;
        this.height = height;
        this.hair_color = hair_color;
        this.weight = weight;
    }

    public void print(){}
    public abstract Person clone();
}
