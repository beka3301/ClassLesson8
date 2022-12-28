public class Hourse extends Animal{
private String color;
    public Hourse(String color,int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
        this.color=color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Hourse{" +
                "color='" + color + '\'' +
                super.toString()+
                '}';
    }
}
