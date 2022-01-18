public class HelloGoodbye {

    public static void main(String[] args) {

        if (args.length < 2) {
            return;
        }

        String str1 = args[0];
        String str2 = args[1];

        System.out.println("Hello " + str1 + " and " + str2 + ".");
        System.out.println("Goodbye " + str2 + " and " + str1 + ".");
    }
}
