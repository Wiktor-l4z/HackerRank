import java.util.HashMap;
import java.util.Map;


public class DictionaryPractice {
    public static void main(String[] args) {

        // English to Polish Dictionary
        Map<String, String> englPolishDictionary = new HashMap<String, String>();
        // Putting things inside our dictionary
        englPolishDictionary.put("Monday", "Poniedzialek");
        englPolishDictionary.put("Tuesday", "Wtorek");
        englPolishDictionary.put("Wednesday", "Sroda");
        englPolishDictionary.put("Thursday", "Czwartek");
        englPolishDictionary.put("Friday", "Piatek");
        englPolishDictionary.put("Saturday", "Sobota");
        englPolishDictionary.put("Sunday", "Niedziela");

        // Retrieve things from our dictionary
        System.out.println(englPolishDictionary.get("Monday"));
        System.out.println(englPolishDictionary.get("Tuesday"));
        System.out.println(englPolishDictionary.get("Wednesday"));
        System.out.println(englPolishDictionary.get("Thursday"));
        System.out.println(englPolishDictionary.get("Friday"));
        // Print out all keys
        System.out.println(englPolishDictionary.keySet());
        // Print out all values
        System.out.println(englPolishDictionary.values());
        // Print out size
        System.out.println("The Size of Dictionary is " +englPolishDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.TRUE);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        // Key-Value Pairs PrintOut
        System.out.println(shoppingList.toString());
        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());

    }
}
