package StringPackage;

public class MethodChaining {

    public static void main(String[] args) {

        String city="Des Plaines";
        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());

        System.out.println(city.indexOf("P"));

        // After following method we can do method chaining
        // substring, to UpperCase, to LowerCase, Replace, Trim
        // After following method we cannot do method chaining
        // length, charAt, indexOf, contains, equals, equalsIgnoreCase, startWith, endWith
        // number, char, number, true/false
    }











}
