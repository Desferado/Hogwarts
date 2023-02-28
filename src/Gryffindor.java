public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, String secondName, int magicPower, int apparitionLength, int nobility, int honor, int bravery) {
        super(name, secondName, magicPower, apparitionLength );
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility<0){
            System.out.println("Значение благородства не должно быть отрицательным");
            return;
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor<0){
            System.out.println("Значение чести не должно быть отрицательным");
            return;
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery<0){
            System.out.println("Значение храбрости не должно быть отрицательным");
            return;
        }
        this.bravery = bravery;
    }
    public static void compareStudent(Gryffindor gryffindor1, Gryffindor gryffindor2){
        int sum1 = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getBravery();
        int sum2 = gryffindor2.getNobility() + gryffindor2.getHonor() + gryffindor2.getBravery();
        System.out.print("У " + gryffindor1.getName() + " " + gryffindor1.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum1);
        System.out.print("У " + gryffindor2.getName() + " " + gryffindor2.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum2);
        if (sum1 > sum2) {
            System.out.print(gryffindor1.getName() + " " + gryffindor1.getSecondName() + " лучший Гриффиндорец, чем ");
            System.out.println(gryffindor2.getName() + " " + gryffindor2.getSecondName());
        } else {
            System.out.print(gryffindor2.getName() + " " + gryffindor2.getSecondName() + " лучший Гриффиндорец, чем ");
            System.out.println(gryffindor1.getName() + " " + gryffindor1.getSecondName());
        }
        System.out.println();
    }
}
