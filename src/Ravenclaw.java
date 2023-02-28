public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int wit;
    private int creative;

    public Ravenclaw(String name, String secondName, int magicPower, int apparitionLength, int smart, int wise, int wit, int creative) {
        super(name, secondName, magicPower, apparitionLength);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (smart<0){
            System.out.println("Значение ума не должно быть отрицательным");
            return;
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise<0){
            System.out.println("Значение мудрости не должно быть отрицательным");
            return;
        }
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit<0){
            System.out.println("Значение остроумия не должно быть отрицательным");
            return;
        }
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        if (creative<0){
            System.out.println("Значение творчества не должно быть отрицательным");
            return;
        }
        this.creative = creative;
    }
    public static void compareStudent(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int sum1 = ravenclaw1.getSmart() + ravenclaw1.getWise() + ravenclaw1.getWit() + ravenclaw1.getCreative();
        int sum2 = ravenclaw2.getSmart() + ravenclaw2.getWise() + ravenclaw2.getWit() + ravenclaw2.getCreative();
        System.out.print("У " + ravenclaw1.getName() + " " + ravenclaw1.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum1);
        System.out.print("У " + ravenclaw2.getName() + " " + ravenclaw2.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum2);
        if (sum1 > sum2) {
            System.out.print(ravenclaw1.getName() + " " + ravenclaw1.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(ravenclaw2.getName() + " " + ravenclaw2.getSecondName());
        } else {
            System.out.print(ravenclaw2.getName() + " " + ravenclaw2.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(ravenclaw1.getName() + " " + ravenclaw1.getSecondName());
        }
        System.out.println();
    }
}