package kg.geektech.game.players;

public abstract class GameEntity {
    private int Health;
    private int Damage;
    private String Name;

    public GameEntity(int health, int damage, String name) {
        this.Health = health;
        this.Damage = damage;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }


    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.Health = 0;
        } else {


        Health = health;
    }
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    @Override
    public String toString() {
        return this.getName()+  " Health: " + this.getHealth() +
                " damage: " + this.getDamage();
    }
}
