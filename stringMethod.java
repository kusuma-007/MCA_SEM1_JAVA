class StringMethod {

    public static void main(String args[]) {

        String s = "Aditya";

        System.out.println("Uppercase: " + s.toUpperCase()); // conversion

        System.out.println("Lowercase: " + s.toLowerCase());

        System.out.println("Trimmed: " + s.trim()); // White space removal

        System.out.println("Starts with 'I': " + s.startsWith("I")); // check start and end

        System.out.println("Ends with 'e': " + s.endsWith("e"));

        System.out.println("charAt(0): " + s.charAt(0)); // character access

        System.out.println("charAt(3): " + s.charAt(3));

        System.out.println("First index of 'd': " + s.indexOf('d')); // index search

        System.out.println("Length: " + s.length()); // length

        System.out.println("Last index of 'y': " + s.lastIndexOf('y'));
        System.out.println("Replace 'e' -> 'y': " + s.replace("e", "y")); // replace

        System.out.println("Substring(0,3): " + s.substring(0,3)); // substring

        String s1 = "Aditya";

        System.out.println("Equals: " + s.equals(s1)); // equals check

        System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase(s1));

        System.out.println("Contains 'ya': " + s.contains("ya")); // contains

        String s3 = "";

        System.out.println("Is empty string: " + s3.isEmpty()); // is empty

        System.out.println("Concatenation: " + s.concat(" University")); // concat
    }
}