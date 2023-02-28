public class printInfo {
    public static void print(Gryffindor gryffindor) {
        System.out.println("Факультет - " + gryffindor.getClass());
        System.out.println("Имя ученика - " + gryffindor.getName() + " " + gryffindor.getSecondName());
        System.out.println("Магическая сила = " + gryffindor.getMagicPower());
        System.out.println("Дистанция трансгрессии = " + gryffindor.getApparitionLength());
        System.out.println("Благородство = " + gryffindor.getNobility());
        System.out.println("Честь = " + gryffindor.getHonor());
        System.out.println("Храбрость = " + gryffindor.getBravery());
        System.out.println();
    }
    public static void print(Hufflepuff hufflepuff){
        System.out.println("Факультет - " + hufflepuff.getClass());
        System.out.println("Имя ученика - " + hufflepuff.getName() + " " + hufflepuff.getSecondName());
        System.out.println("Магическая сила = " + hufflepuff.getMagicPower());
        System.out.println("Дистанция трансгрессии = " + hufflepuff.getApparitionLength());
        System.out.println("Трудолюбие = " + hufflepuff.getIndustriousness());
        System.out.println("Верность = " + hufflepuff.getLoyalty());
        System.out.println("Честность = " + hufflepuff.getHonesty());
        System.out.println();
    }
    public static void print(Slytherin slytherin){
        System.out.println("Факультет - " + slytherin.getClass());
        System.out.println("Имя ученика - " + slytherin.getName() + " " + slytherin.getSecondName());
        System.out.println("Магическая сила = " + slytherin.getMagicPower());
        System.out.println("Дистанция трансгрессии = " + slytherin.getApparitionLength());
        System.out.println("Хитрость = " + slytherin.getTrick());
        System.out.println("Решительность = " + slytherin.getDetermination());
        System.out.println("Амбициозность = " + slytherin.getAmbition());
        System.out.println("Находчивость = " + slytherin.getResourcefulness());
        System.out.println("Жажда власти = " + slytherin.getLustForPower());
        System.out.println();
    }
    public static void print(Ravenclaw ravenclaw){
        System.out.println("Факультет - " + ravenclaw.getClass());
        System.out.println("Имя ученика - " + ravenclaw.getName() + " " + ravenclaw.getSecondName());
        System.out.println("Магическая сила = " + ravenclaw.getMagicPower());
        System.out.println("Дистанция трансгрессии = " + ravenclaw.getApparitionLength());
        System.out.println("Ум = " + ravenclaw.getSmart());
        System.out.println("Мудрость = " + ravenclaw.getWise());
        System.out.println("Остроумие = " + ravenclaw.getWit());
        System.out.println("Творчество = " + ravenclaw.getCreative());
        System.out.println();
    }
}
