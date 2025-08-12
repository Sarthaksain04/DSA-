package String.Basics;

public class operations {
    public static void main(String[] args) {
        String name = "Sarthak";
        System.out.println(name);// Print string
        System.out.println(name.length()); // Get length
        System.out.println(name.toUpperCase());// Convert to upper case
        System.out.println(name.toLowerCase());// Convert to lower case
        System.out.println(name.charAt(2));//Returns char at index
        System.out.println(name.substring(1, 3));//	Substring from start to end-1
        System.out.println(name.contains("rt"));//	Checks if text is present
        System.out.println(name.equals("Sarthak"));//	Compares string value
        System.out.println(name.equalsIgnoreCase("Sarthak"));//Ignores case while comparing
        System.out.println(name.startsWith("Sa"));//	Checks prefix
        System.out.println(name.endsWith("ak"));//	Checks suffix
        System.out.println(name.indexOf('S'));//	First index of char
        System.out.println(name.lastIndexOf('r')); //	Last index of char
        System.out.println(name.trim()); //	Removes leading and trailing spaces
        System.out.println(name.replace("S" , "R")); //Replaces a with b
    }
}
