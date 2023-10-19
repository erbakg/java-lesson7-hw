import Heroes.Hero;
import Heroes.Magic;
import Heroes.Medic;
import Heroes.Warrior;

public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {new Medic(250, 60), new Warrior(300, 90), new Magic(250, 60)};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if(hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
        }
    }
}