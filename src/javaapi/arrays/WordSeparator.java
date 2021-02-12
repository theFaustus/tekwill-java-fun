package javaapi.arrays;

public class WordSeparator {
    public static String separate(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(' ').append(Character.toLowerCase(input.charAt(i)));
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(WordSeparator.separate("SongIsAGreatWayOfRelaxing"));
    }
}
