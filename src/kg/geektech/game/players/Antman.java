package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{
    public Antman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.JIZN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean jizn = RPG_Game.random.nextBoolean();
        int Live = RPG_Game.random.nextInt(20)+1;
        if (jizn == true) {
            this.setHealth(getHealth() + Live);
            this.setDamage(getDamage() + Live) ;
            System.out.println( this.getName() + " Uvelichil udar i jizn: " + Live);
        } else if (jizn == false){
            this.setHealth(getHealth() - Live);
            this.setDamage(getDamage() - Live);
            System.out.println(this.getName() + " Umenwil Jizn i udar: " + Live);
        }

    }
}
