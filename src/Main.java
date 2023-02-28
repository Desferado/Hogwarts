public class Main {
    public static void main(String[] args) {
        Gryffindor [] gryffindors = {
                new Gryffindor ("Гарри", "Поттер", 20, 30,40,30, 60),
                new Gryffindor("Гермиона",  "Грейнджер", 30, 40,20,30, 40),
                new Gryffindor("Рон",  "Уизли", 10, 40,20, 10, 70),
        };
        Slytherin [] slytherins = {
                new Slytherin("Драко", "Малфой", 30,20, 50, 40,30, 40, 80),
                new Slytherin("Грэхэм", "Монтегю",10, 20, 20, 30, 10, 40, 50),
                new Slytherin("Грегори", "Гойл", 30, 20, 50, 20, 30, 40, 60),
        };
        Hufflepuff [] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 40, 50, 30, 40,60),
                new Hufflepuff("Седрик", "Диггори", 20, 40, 20, 30, 60),
                new Hufflepuff("Джастин", "Финч-Флетчли", 30, 20, 10, 20, 30)
        };
        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг",30,10, 40, 30, 20, 50),
                new Ravenclaw("Падма", "Патил", 10, 20,60, 40,30,70),
                new Ravenclaw("Маркус", "Белби", 40,30,50,40,30,80)
        };
        printInfo.print(gryffindors[1]);
        printInfo.print(hufflepuffs[2]);
        printInfo.print(slytherins[0]);
        printInfo.print(ravenclaws[1]);
        Gryffindor.compareStudent(gryffindors[2],gryffindors[0]);
        Hufflepuff.compareStudent(hufflepuffs[1], hufflepuffs[2]);
        Ravenclaw.compareStudent(ravenclaws[0], ravenclaws[1]);
        Slytherin.compareStudent(slytherins[2],slytherins[1]);
        Hogwarts.compareStudent(gryffindors[0], slytherins[0]);
    }
}