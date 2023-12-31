public class fraternalTwin extends Person {

    public fraternalTwin() {
    }

    public fraternalTwin(String name, String gender, float height, float weight, String hair_color) {
        super(name, gender, height, weight, hair_color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
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
        super.print();
    }

    @Override
    public fraternalTwin clone() {
        return new fraternalTwin(getName(),getGender(),getHeight(), getWeight(), getHair_color());
    }
}
