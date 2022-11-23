//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import model.Classes;
import model.Marks;
import model.Students;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Students std1 = new Students("Baburao", 17, 12);
        Students std2 = new Students("Raju", 16, 11);
        Students std3 = new Students("Kachra", 18, 12);
        new Classes(11, std1.getName());
        new Classes(12, std2.getName());
        new Classes(11, std3.getName());
        Marks mk1 = new Marks(std1.getName(), 74.0, 85.0, 83.0);
        Marks mk2 = new Marks(std2.getName(), 81.0, 94.0, 99.0);
        Marks mk3 = new Marks(std3.getName(), 65.0, 67.0, 98.0);
        std1.details();
        std2.details();
        std3.details();
        System.out.println("\n\nThe total percentage of each student:\n\n");
        mk1.getTotal();
        mk2.getTotal();
        mk3.getTotal();
    }
}