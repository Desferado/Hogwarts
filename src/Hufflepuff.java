public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String secondName, int magicPower, int apparitionLength, int industriousness, int loyalty, int honesty) {
        super(name, secondName, magicPower, apparitionLength);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness<0){
            System.out.println("Значение трудолюбия не должно быть отрицательным");
            return;
        }
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty<0){
            System.out.println("Значение верности не должно быть отрицательным");
            return;
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty<0){
            System.out.println("Значение честности не должно быть отрицательным");
            return;
        }
        this.honesty = honesty;
    }
    public static void compareStudent(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sum1 = hufflepuff1.getIndustriousness() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = hufflepuff2.getIndustriousness() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        System.out.print("У " + hufflepuff1.getName() + " " + hufflepuff1.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum1);
        System.out.print("У " + hufflepuff2.getName() + " " + hufflepuff2.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum2);
        if (sum1 > sum2) {
            System.out.print(hufflepuff1.getName() + " " + hufflepuff1.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(hufflepuff2.getName() + " " + hufflepuff2.getSecondName());
        } else {
            System.out.print(hufflepuff2.getName() + " " + hufflepuff2.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(hufflepuff1.getName() + " " + hufflepuff1.getSecondName());
        }
        System.out.println();
    }
}
