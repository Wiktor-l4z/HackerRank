public class Hero implements Character {
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String weapon = "lighsabre";

    public void attack(){
        System.out.println("The Hero attacks enemy!");
    }
    public void heal(){
        System.out.println("The Hero heals you");
    }
    public void weaponDraw(){
        System.out.println("Draw out weapon");
    }

}
