public class JavaTypes {
    public static void main(String[] args) {
        System.out.println("Here we will discuss about Java Types:");
        /*
        Primitive Types:
        1. byte - 1 [-128 to 127]
        2. short - 2
        3. int - 4 (1, 2, 3)
        4. long - 8
        5. float - 4 (3.14)
        6. double - 8
        7. char - 2 (a, b, c, d)
        8. boolean - 1 (true/false)
         */
        byte age = 30;
        int phone = 1234567890; //This is the max capacity
        long phone2 = 12345678900L; // L for long values
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        /*
        Non-primitive or reference types:
        1. String (two ways) and it's immutable in Java
         */
        String name = "Ovinno";
        String friend = new String("Laila");
        System.out.println("Name length: " + name.length());

        // String Operations:

        // 1. Concatenate
        String name1 = "Ovinno";
        String name2 = "Laila";
        String love = name1 + " and " + name2;
        System.out.println(love);

        // 2. charAt
        String MyName = "Ovinno";
        System.out.println(MyName.charAt(0));
        System.out.println(MyName.charAt(1));

        // 3. length
        System.out.println(MyName.length());

        // 4. replace
        String ModifiedMyName = MyName.replace('v', 'k');
        System.out.println(ModifiedMyName);
        System.out.println(MyName);

        // 5. substring
        String loveAgain = "Ovinno" + " and " + "Laila";
        System.out.println(love.substring(7, 10));
    }
}
