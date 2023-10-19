package Heroes;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbilities.MAGIC_ABILITY);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + this.getSuperAbilities());
    }
}
