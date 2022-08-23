package Task4;

public class Main {
    public static void main(String[] args) {
        Computer[]computer = new Computer[5];
        for (int i = 0; i < computer.length; i++) {
            computer[i]=new Computer("computer" +(i+1));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(computer[i].name);
        }
    }
}
