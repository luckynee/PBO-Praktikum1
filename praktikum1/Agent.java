package praktikum1;

public class Agent {

    private int health;
    private int pos_x;
    private int pos_y;
    private String nama;

    public Agent() {

    }

    public Agent(int health, int pos_x, int pos_y, String nama) {

        this.health = health;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.nama = nama;

    }

    public void Info(String infoAgent) {
        System.out.println(
                "" + infoAgent + "Nama : " + this.nama + " Health : " + this.health + " X : " + this.pos_x + " Y : "
                        + this.pos_y);
    }

}
