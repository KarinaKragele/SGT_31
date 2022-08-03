public class StringExample {
    public static void main(String[] args) {

        String text1 = "This is text example";
        String text2 = text1.intern();
        System.out.println(text2);

        //CONCATENATION OF THE STRINGS
        String input1 = "This is ";
        String input2 = "input text.";

        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //COMPARING STRINGS
        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));
        System.out.println(val2.equals(val1));

        //STRING CLASS METHODS
        String inputText = "This is my text";
        //Length
        System.out.println(inputText.length());

        //To uppercase
        System.out.println(inputText.toUpperCase());
        System.out.println(inputText); //did not assigned, just converted above, that is why this will be printed as it is

        //To lowercase
        System.out.println(inputText.toLowerCase());

        //STRING CLASS METHODS - INDEXOF()
        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf(" is "));

        //REPLACE ALL()
        //Sudas

        String textForTV = "This phone is complete sudas. And this case also is sudas.";
        System.out.println(textForTV.replaceAll("sudas", "s***s"));

        //Character index
        System.out.println(textForTV.charAt(textForTV.length()-1));

        //Substring
        System.out.println(textForTV.substring(5));
        System.out.println(textForTV.substring(5,10));

        //Parsing
        //Converting String to primitive Data type

        String intValue = "165";
        String floatValue = "2.8";
        String doubleValue = "2.4545345";
        String boolValue = "true";
        String longValue = "1000000000";

        /*intValue +=4;
        System.out.println(intValue);*/

        System.out.println(Integer.parseInt(intValue) +4);
        System.out.println(Float.parseFloat(floatValue));
        System.out.println(Double.parseDouble(doubleValue));
        System.out.println(Boolean.parseBoolean(boolValue));
        System.out.println(Long.parseLong(longValue));
    }
}
