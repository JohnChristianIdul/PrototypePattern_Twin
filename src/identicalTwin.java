public class identicalTwin extends Person {
    private String name;
    private float height;
    private String gender;
    private String hair_color;
    private float weight;

    public identicalTwin(String name, float height, String gender, String hair_color, float weight, String name1, float height1, String hair_color1, float weight1) {
        super(name, height, gender, hair_color, weight);
        this.name = name1;
        this.height = height1;
        this.gender = gender;
        this.hair_color = hair_color1;
        this.weight = weight1;
    }

    public identicalTwin(String name, float height, String gender, String hair_color, float weight) {
        super(name, height, gender, hair_color, weight);
    }

    public identicalTwin() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Hair Color: " + getWeight());
    }

    @Override
    public Person clone() {
        return new identicalTwin();
    }
}
