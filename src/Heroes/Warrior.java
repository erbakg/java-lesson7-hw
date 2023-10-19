package Heroes;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbilities.WARRIOR_ABILITY);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + this.getSuperAbilities());
    }
}
