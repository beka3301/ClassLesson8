public class Main {
    public static void main(String[] args) {
        Sheep[] sheep = {
                new Sheep(67, 56, "dhth", "fh"),
                new Sheep(12, 13, "human", "barbos"),
                new Sheep(10, 1, "woman", "asd"),
        };
        Cow[] cows = {
                new Cow(123, 10, "human", "bala"),
                new Cow(90, 4, "human", "bory"),
                new Cow(200, 16, "woman", "masha"),
                new Cow(222, 5, "woman", "dasha"),
                new Cow(111, 9, "human", "leo")
        };
        Hourse[] hourses = {
                new Hourse("black", 90, 16, "human", "puly"),
                new Hourse("Белый", 100, 15, "woman", "groza"),
        };
        Sheep[] sheep1 = {new Sheep(90, 23, "human", "bazar")};
        Cow[] cow1 = {new Cow(90, 11, "woman", "aaaa")};
        Hourse[] hourse1 = {new Hourse("dsa", 123, 22, "asd", "asd")};
        Farm farm1 = new Farm("Beks", cows, sheep, hourses);
        Farm farm2 = new Farm("Siu", cow1, sheep1, hourse1);
        System.out.print(farm1);

    }
}