package FinalExamPrep2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());

        final int maxHitPoints = 100;
        final int maxManaPoints = 200;

        for (int hero = 1; hero <= countHeroes; hero++) {
            String heroInfo = scanner.nextLine();
            String[] heroData = heroInfo.split("\\s+");

            String heroName = heroData[0];
            int heroHP = Integer.parseInt(heroData[1]);
            int heroMP = Integer.parseInt(heroData[2]);

            if (heroHP <= maxHitPoints) {
                heroesHP.put(heroName, heroHP);
            }
            if (heroMP <= maxManaPoints) {
                heroesMP.put(heroName, heroMP);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandsActions = command.split("\\s+-\\s+");

            switch (commandsActions[0]) {
                //1. "CastSpell – {hero name} – {MP needed} – {spell name}"
                case "CastSpell" :
                    String heroName = commandsActions[1];
                    int mpNeeded = Integer.parseInt(commandsActions[2]);
                    String spellName = commandsActions[3];

                    int currentMP = heroesMP.get(heroName); //get the mp for the hero

                    if(currentMP >= mpNeeded) {
                        int mpLeft = currentMP - mpNeeded;
                        heroesMP.put(heroName, mpLeft); //reduce the hero mp
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage" :
                    //2. "TakeDamage – {hero name} – {damage} – {attacker}"
                    heroName = commandsActions[1];
                    int damage = Integer.parseInt(commandsActions[2]);
                    String attacker = commandsActions[3];

                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;

                    if (currentHP > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                        heroesHP.put(heroName, currentHP);
                    } else {
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;

                case "Recharge" :
                    //3. "Recharge – {hero name} – {amount}"
                    heroName = commandsActions[1];
                    int amountMPRecovered = Integer.parseInt(commandsActions[2]);
                    currentMP = heroesMP.get(heroName);
                    currentMP += amountMPRecovered;

                    if(currentMP > maxManaPoints) {
                        currentMP = maxManaPoints;
                    }

                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMP - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMP);
                    break;

                case "Heal" :
                    //4. "Heal – {hero name} – {amount}"
                    heroName = commandsActions[1];
                    int amountHPRecovered = Integer.parseInt(commandsActions[2]);
                    currentHP = heroesHP.get(heroName);
                    currentHP += amountHPRecovered;

                    if(currentHP > maxHitPoints) {
                        currentHP = maxHitPoints;
                    }

                    System.out.printf("%s healed for %d HP!%n", heroName, currentHP - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHP);
                    break;
                }
                command = scanner.nextLine();
            }

        heroesHP.forEach((key, value) -> {
            System.out.println(key);
            System.out.println("  HP: " + value);
            System.out.println("  MP: " + heroesMP.get(key));
        });
    }
}
