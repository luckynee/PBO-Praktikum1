package praktikum1;

public class Player {
    private int id;
    private int direction;
    private int strength;

    public Player() {

    }

    public Player(int id, int direction, int strength) {
        this.id = id;
        this.direction = direction;
        this.strength = strength;
    }

    public void Info(String infoPlayer) {
        System.out.println(
                "" + infoPlayer + " ID : " + this.id + " Direction : " + this.direction + " Strenght : "
                        + this.strength);
    }

}
