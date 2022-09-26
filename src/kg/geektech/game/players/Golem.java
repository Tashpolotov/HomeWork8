package kg.geektech.game.players;

public class Golem extends Hero{
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.URON);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBoss = boss.getDamage()/5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0){
                heroes[i].setHealth(heroes[i].getHealth() - damageBoss);
                System.out.println("Golem otrazil uder: " + damageBoss);
                break;
                 }

        }
    }
}
