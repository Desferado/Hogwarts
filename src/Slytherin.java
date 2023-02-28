public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String secondName, int magicPower, int apparitionLength, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, secondName, magicPower, apparitionLength);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public static void compareStudent(Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.getTrick() + slytherin1.getAmbition() + slytherin1.getDetermination() + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int sum2 = slytherin2.getTrick() + slytherin2.getAmbition() + slytherin2.getDetermination() + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        System.out.print("У " + slytherin1.getName() + " " + slytherin1.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum1);
        System.out.print("У " + slytherin2.getName() + " " + slytherin2.getSecondName() + " ");
        System.out.println("сумма баллов составляет - " + sum2);
        if (sum1 > sum2) {
            System.out.print(slytherin1.getName() + " " + slytherin1.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(slytherin2.getName() + " " + slytherin2.getSecondName());
        } else {
            System.out.print(slytherin2.getName() + " " + slytherin2.getSecondName() + " лучший Пуффендуец, чем ");
            System.out.println(slytherin1.getName() + " " + slytherin1.getSecondName());
        }
        System.out.println();
    }
}
