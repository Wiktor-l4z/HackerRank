import java.util.Random;
import java.util.regex.Matcher;

public class StarWarsInterfacePractice {


    public static Character summonCharacter(){
        Random random = new Random();
        if(Math.abs(random.nextInt()) % 2 == 0){
            return new Enemy();
        } else {
            return new Hero();
        }
    }


    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero ObiWanKanobi = new Hero();
        darthVader.attack();
        ObiWanKanobi.attack();
        darthVader.heal();
        ObiWanKanobi.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWanKanobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();

    }
}
