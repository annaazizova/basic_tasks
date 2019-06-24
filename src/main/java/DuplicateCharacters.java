import java.util.*;

public class DuplicateCharacters {
    private static String inputString;

    public static void main(String[] args) {
        getStringFromConsole();
        findDuplicateCharacters();
    }

    private static void findDuplicateCharacters() {
        Map<Character, Integer> characters = new HashMap<Character, Integer>();
        for(Character character: inputString.toCharArray()){
            characters.put(character, (characters.get(character) == null ? 0: characters.get(character)) + 1);
        }
        System.out.println("characters = [" + characters + "]");
        for(Map.Entry<Character, Integer> characterIntegerEntry: characters.entrySet()){
            if(characterIntegerEntry.getValue() > 1){
                System.out.printf("Duplicate character is = [%s, %d]\n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
            }
        }
    }

    private static void getStringFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string:");
        inputString = in.nextLine();
        System.out.println("You entered string = [" + inputString + "]");
    }
}
