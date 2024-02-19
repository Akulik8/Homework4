public class Cat {
    private String name;
    private String color;
    private int age;

    private static int catCount = 0;

    public Cat(String name) {
        this(name, "серый", 0);
    }

    public Cat(String name, String color) {
        this(name, color, 0);
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;
    }

    public static int getAllCatsCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
