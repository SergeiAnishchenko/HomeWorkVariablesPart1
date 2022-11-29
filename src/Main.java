public class Main {
    public static void main(String[] args) {

        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух боксеров равен " + totalWeight + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров составляет " + weightDifference + " кг");
        System.out.println("Разница в весе боксеров составляет " + boxer2 % boxer1 + " кг");

        var totalWorkHours = 640;
        var oneEmployeeWorkHours = 8;
        var employeesNumber = totalWorkHours / oneEmployeeWorkHours;
        System.out.println("Всего работников в компании " + employeesNumber + " человек");
        employeesNumber = employeesNumber + 94;
        totalWorkHours = employeesNumber * 8;
        System.out.println("Если в компании работает " + employeesNumber + " человек, то всего "
                + totalWorkHours + " часов работы может быть поделено между сотрудниками");

    }
}