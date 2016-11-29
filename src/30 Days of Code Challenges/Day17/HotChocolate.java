import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double teaTemp)
        throws TooHotException,TooColdException {
        if (teaTemp >= tooHot) {
            throw new TooHotException();
        } else if (teaTemp <= tooCold) {
            throw new TooColdException();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        double currentTemp = 150;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentTemp);
                System.out.printf("That tea was good");
                wrongTemp = false;
            } catch (TooHotException e1){
                System.out.println("That's too hot!");
                currentTemp = currentTemp -5;
            } catch (TooColdException e2){
                System.out.println("That's too cold!");
                currentTemp = currentTemp +5;
            }
            TimeUnit.SECONDS.sleep(2);

        }
    }
}
