package praktikum1;

public class MainClass {
    public static void main(String[] args) {

        Agent Agent1 = new Agent();
        Agent Agent2 = new Agent(10000, 0, 0, "Uyeee");

        Player Player1 = new Player();
        Player Player2 = new Player(12, 5, 1000);

        Agent1.Info("");
        Agent2.Info("");

        Player1.Info("");
        Player2.Info("");

    }
}
