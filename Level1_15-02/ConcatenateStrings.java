public class ConcatenateStrings {
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " How", " are", " you?"};
        String result = concatenateStrings(words);
        System.out.println("Concatenated String: " + result);
    }
}

