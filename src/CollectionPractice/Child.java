package CollectionPractice;

import com.sun.jdi.event.StepEvent;

public class Child {

    private String name;
    private int age;
    private String city;
    private char gender;

    public Child(String name, int age, String city, char gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public boolean goToSchool() {
        if (age > 6) {

            System.out.println("Child can go to school");
            return true;
        }
        System.out.println("Child cannot go to school");
        return false;
    }

    public boolean isPalindrome(String str) {
        boolean palindrome = false;
        int k = str.length();// 5;
        for (int i = 0; i < k; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return true;
            }
        }
        if (palindrome) {
            return true;
        }
        return false;

    }
}


