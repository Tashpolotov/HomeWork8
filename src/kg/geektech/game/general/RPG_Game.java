package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {

        private static int roundNumber;
        public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss(1000, 50, "Tanos");
        Warrior warrior = new Warrior(290, 10, "Baki");
        Medic doc = new Medic(250, 10, 15, "Strange");
        Magic magic = new Magic(280, 20, "Potter");
        Berserk berserk = new Berserk(270, 15, "Viking");
        Medic assistant = new Medic(260, 5, 5, "Stone");
        Thor thor = new Thor(180, 10, "thore");
        Golem golem = new Golem(300, 5, "golem");
        Antman antman = new Antman(200, 10, "antman");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant, thor, golem, antman};

            printStatistics(boss, heroes);
            while (!isGameFinish(boss,heroes)){
                playRound(boss, heroes);
            }
        }

        private static void playRound (Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getAbility().toString() != boss.getDefence() && heroes[i].getHealth() > 0) {
                    heroes[i].attack(boss);
                    heroes[i].applySuperPower(boss, heroes);
                }
            }
            printStatistics(boss,heroes);
        }

        private static void printStatistics (Boss boss, Hero [] heroes) {
            System.out.println("ROUND: " + roundNumber + " --------------");
            System.out.println(boss);
            for (int i = 0; i < heroes.length; i++) {
                System.out.println(heroes[i]);
            }

        }

        private static boolean isGameFinish (Boss boss, Hero [] heroes) {
            if (boss.getHealth() <=0) {
                System.out.println("Heroes Won!!!");
                return true;
            }
            boolean allHeroesDead = true;
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() >0){
                    allHeroesDead = false;
                    break;
                }

            }
            if (allHeroesDead) {
                System.out.println("Boss Won!!!!");
            }
            return allHeroesDead;
        }
}
