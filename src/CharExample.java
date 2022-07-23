public class CharExample {
    public static void main(String[] args) {
        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //Cast from int to char
        System.out.println((char) 122);

        //Print out all lower case alphabet letters

        char letter = 'a';
        for(int l = letter; l <= 122; l++){
            System.out.print((char) l + " ");
        }

        //Karlis approach
        for (int i = 97; i <=122; i++){
            System.out.print((char)i + " ");
        }
    }
}


