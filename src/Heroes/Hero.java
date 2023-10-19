package Heroes;

public class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private SuperAbilities superAbilities;

    public Hero(int health, int damage, SuperAbilities superAbilities) {
        this.damage = damage;
        this.health = health;
        this.superAbilities = superAbilities;
    }

    public SuperAbilities getSuperAbilities() {
        return superAbilities;
    }

    @Override
    public void applySuperAbility() {
    }
}
