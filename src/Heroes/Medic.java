package Heroes;

public class Medic extends Hero {

    private int healPoints = 10;

    public Medic(int health, int damage) {
        super(health, damage, SuperAbilities.MEDIC_ABILITY);
    }

    public void increaseExperience() {
        this.healPoints += (int) (this.healPoints * 0.1);
        System.out.println("Medic применил способность increaseExperience " + this.healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + this.getSuperAbilities());
    }
}
