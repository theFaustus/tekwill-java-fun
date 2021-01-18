package methods;

public class CharPrinter {
    public static void printChars(char ch1, char ch2, int numberOfCharsPerLine) {
        for (char currentChar = ch1, i = 1; currentChar < ch2; currentChar++, i++) {
            System.out.print(currentChar + " ");
            if (i % numberOfCharsPerLine == 0)
                System.out.println();

        }
    }

    public static void main(String[] args) {
        printChars(' ', '~', 10);
    }
}
