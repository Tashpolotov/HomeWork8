package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {

    private int savedDamage;


    public Berserk(int health, int damage, String  name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        savedDamage = RPG_Game.random.nextInt(50) + 1;
        this.setDamage(this.getDamage() + savedDamage);
        boss.setHealth(boss.getHealth() - savedDamage);


        }
    }





