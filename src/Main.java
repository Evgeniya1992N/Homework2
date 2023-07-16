public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper =  763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog -3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var fighterOne = 78.2;
        var fighterTwo = 82.7;
        var fightersWeightTogether = fighterOne + fighterTwo;
        System.out.println(fightersWeightTogether);
        var fightersWeightDifference = fighterTwo - fighterOne;
        System.out.println(fightersWeightDifference);


        fightersWeightDifference = fighterTwo - fighterOne;
        System.out.println(fightersWeightDifference);
        fightersWeightDifference = fighterTwo % fighterOne;
        System.out.println(fightersWeightDifference);


        var workingHours = 640;
        var workingHoursProEmployee = 8;
        var employees = workingHours / workingHoursProEmployee;
        System.out.println("Всего работников в компании - " + employees + " человек.");

        employees = employees + 94;
        workingHours = workingHoursProEmployee * employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + workingHours +" часов работы может быть поделено между сотрудниками.");


    }
}