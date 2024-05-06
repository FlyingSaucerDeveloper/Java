public class StringBuilders {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // append -> data added to the last of the existing string
        sb.append("Kartik");

        // CharAt
        System.out.println(sb.charAt(4));

        // set Char -> relaces the character
        sb.setCharAt(3, 's');
        System.out.println(sb);

        // insert char -> inserted at the provide index and existing char is moved by +1
        // index
        sb.insert(3, 't');
        System.out.println(sb);

        // delete - end index not included
        sb.delete(4, 5);
        System.out.println(sb);

        // Reverse - manul logic

        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            char fchar = sb.charAt(front);
            char bchar = sb.charAt(back);

            sb.setCharAt(front, bchar);
            sb.setCharAt(back, fchar);

        }
        System.out.println("Manul Reverse : " + sb);

        // Reverse using interal method
        sb.reverse();
        System.out.println("Reverse using internal method: " + sb);

    }

}
