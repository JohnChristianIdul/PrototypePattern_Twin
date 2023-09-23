public class identicalTwin extends Person {

    public identicalTwin() {
    }

    public identicalTwin(String name, String gender, float height, float weight, String hair_color) {
        super(name, gender, height, weight, hair_color);
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
        System.out.println("Hair Color: " + getHair_color());
    }

    @Override
    public Person clone() {
        return new identicalTwin(getName(),getGender(),getHeight(),getWeight(),getHair_color());
    }
}
