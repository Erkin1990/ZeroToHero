package Methods;


public class StringReverse {

    public void StringReverse(String str) {

        String[] words = str.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reversed += words[i] + " ";

        }
        reversed.trim();
        System.out.println(reversed);
    }

    public static void main(String[] args) {

        StringReverse test = new StringReverse();
        String name = "Process finished with exit code 0";
        test.StringReverse(name);

    }
}