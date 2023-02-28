public abstract class Hogwarts {
    private String name;
    private String secondName;
    private int magicPower;
    private int apparitionLength;

    public Hogwarts(String name, String secondName, int magicPower, int apparitionLength) {
        this.name = name;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.apparitionLength = apparitionLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0) {
            System.out.println("Сила магии не должна быть отрицательной");
            return;
        }
        this.magicPower = magicPower;
    }

    public int getApparitionLength() {
        return apparitionLength;
    }

    public void setApparitionLength(int apparitionLength) {
        if (apparitionLength < 0) {
            System.out.println("Расстояние трансгрессии не должно быть отрицательным");
            return;
        }
        this.apparitionLength = apparitionLength;
    }
    public static void compareStudent(Hogwarts hogwarts1, Hogwarts hogwarts2){
        if (hogwarts1.getMagicPower() + hogwarts1.getApparitionLength() < hogwarts2.getMagicPower() + hogwarts2.getApparitionLength()){
            System.out.print(hogwarts2.getName() + " " + hogwarts2.getSecondName() + " обладает бОльшей мощностью магии чем ");
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSecondName());
        } else {
            System.out.print(hogwarts1.getName() + " " + hogwarts1.getSecondName() + " обладает бОльшей мощностью магии, чем ");
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSecondName());
        }
        System.out.println();
    }

}

