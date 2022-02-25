package AlgoExpert.Easy;

public class RunLengthEncoding {

    public String runLengthEncoding(String string) {
        StringBuilder characters = new StringBuilder();
        int length = 1;
        for (int x = 0; x < string.length() - 1; x++) {
            char currentCharacter = string.charAt(x);
            char nextCharacter = string.charAt(x + 1);

            if (currentCharacter == nextCharacter && length == 9) {
                characters.append(Integer.toString(length));
                characters.append(currentCharacter);
                length = 1;
            } else if (currentCharacter == nextCharacter) {
                length += 1;
            } else {
                characters.append(Integer.toString(length));
                characters.append(currentCharacter);
                length = 1;
            }
        }
        characters.append(Integer.toString(length));
        characters.append(string.charAt(string.length() - 1));

        return characters.toString();
    }
}

