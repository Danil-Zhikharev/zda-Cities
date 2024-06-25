public class Starter {
    // Задача 1.6.10

    public static void main(String[] args) {
        // Создаем города
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Задаем пути
        A.addPath(B, 5);
        A.addPath(F, 1);
        A.addPath(D, 6);

        B.addPath(C, 3);

        C.addPath(B, 3);
        C.addPath(D, 4);

        D.addPath(C, 4);
        D.addPath(E, 2);
        D.addPath(A, 6);

        E.addPath(F, 2);

        F.addPath(B, 1);
        F.addPath(E, 2);

        // Печатаем информацию о городах
        System.out.println("City " + A);
        System.out.println("City " + B);
        System.out.println("City " + C);
        System.out.println("City " + D);
        System.out.println("City " + E);
        System.out.println("City " + F);

        // Добавление существующего пути
        A.addPath(B, 5);

        // Удаление пути
        A.removePath(F);
        System.out.println("City " + A);
        A.removePath(F);
    }
}
