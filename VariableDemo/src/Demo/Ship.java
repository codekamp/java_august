package Demo;

/**
 * Created by cerebro on 10/09/16.
 */
public class Ship {
    private int damage = 0;
    private int bombCount = 10;
    public String name;


    // ship1.fire(ship2);
    public void fire(Ship enemy) {
        System.out.println(this.name + " has fired " + enemy.name);
        enemy.increaseDamage();
        this.descreaseBombCount();
    }

    private void descreaseBombCount() {
        this.bombCount--;

        if(this.bombCount == 0) {
            System.out.println(this.name + " lost");
        }
    }

    private void increaseDamage() {
        this.damage += 20;

        if(this.damage == 100) {
            System.out.println(this.name + " lost");
        }
    }
}
