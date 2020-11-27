package lessons;

public class StringMain {


    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "hello";

        //comparison
        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        //change string
        String string1UpperCases = string1.toUpperCase();
        System.out.println(string1UpperCases);

        boolean startsWith = string1.startsWith("He");
        System.out.println(startsWith);

        System.out.println("check if string is empty");
        //check if string is empty
        System.out.println("    ".isBlank()); // not include spaces
        System.out.println("  ".isEmpty()); //include spaces

        //replacements
        String replace = string1.replace("llo", "QWE");
        System.out.println(replace);

        //replace all in strings
        System.out.println(string1.replaceAll("l", "dupa"));

        //take a part of string
        System.out.println(string1.substring(1,4)); //last index is not counted

        String textWithWhiteSpaces = "    this is text  ";
        System.out.println(textWithWhiteSpaces.length());

        String textWithRemovedSpaces = textWithWhiteSpaces.strip();
        System.out.println(textWithRemovedSpaces.length());

    }
}
