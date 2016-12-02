
public class Enemy implements Character {

    public String getWeapon() {
        return weapon;
    }

    public String weapon = "lightsabre";

    public void attack(){
        System.out.println("The enemy attacks YOU!");
    }
    public void heal(){
        System.out.println("The enemy heals himself");
    }
    public void weaponDraw(){
        System.out.println("Draw out weapon");
    }
}
