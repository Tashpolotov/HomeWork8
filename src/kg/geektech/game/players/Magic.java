package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {


    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int udar = RPG_Game.random.nextInt(3) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + udar);
            }



        }
}
    }


