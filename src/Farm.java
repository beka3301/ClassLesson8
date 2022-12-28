import java.util.Arrays;

public class Farm{

    private String  address;
    private Cow[] cows;
    private Sheep[] sheep;
    private Hourse[] hourses;

    public Farm(String address, Cow[] cows, Sheep[] sheep, Hourse[] hourses) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.hourses = hourses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Hourse[] getHourses() {
        return hourses;
    }

    public void setHourses(Hourse[] hourses) {
        this.hourses = hourses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", hourses=" + Arrays.toString(hourses) +
                '}';
    }
}
