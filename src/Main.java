import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик", "рыжий");
        Cat cat3 = new Cat("Васька", "черный", 5);
        Cat cat4 = new Cat("Рыжик", "рыжий");
        Cat cat5 = new Cat("Матроскин", "белый", 8);
        Cat cat6 = new Cat("Том", "серый", 3);
        Cat cat7 = new Cat("Гарфилд", "рыжий", 6);
        Cat cat8 = new Cat("Кузя", "серый", 2);
        Cat cat9 = new Cat("Леопольд", "белый", 4);
        Cat cat10 = new Cat("Базилио", "черный", 7);

        System.out.println("Количество котов: " + Cat.getAllCatsCount());

        ArrayList<Cat> catsByName = new ArrayList<>();
        catsByName.add(cat1);
        catsByName.add(cat2);
        catsByName.add(cat3);
        catsByName.add(cat4);
        catsByName.add(cat5);
        catsByName.add(cat6);
        catsByName.add(cat7);
        catsByName.add(cat8);
        catsByName.add(cat9);
        catsByName.add(cat10);

        Collections.sort(catsByName, Comparator.comparing(Cat::getName));
        System.out.println("\nСписок котов по имени:");
        for (Cat cat : catsByName) {
            System.out.println(cat.getName() + " - " + cat.getColor() + " - " + cat.getAge());
        }

        Collections.sort(catsByName, Comparator.comparingInt(Cat::getAge));
        System.out.println("\nСписок котов по возрасту:");
        for (Cat cat : catsByName) {
            System.out.println(cat.getName() + " - " + cat.getColor() + " - " + cat.getAge());
        }
    }
}