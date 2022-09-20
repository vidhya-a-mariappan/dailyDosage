public class characterCount {
    static String charNCharCount(String input) {
        int[] count=new int[256];
        String resString="";
        for (int i = 0; i < input.length(); i++)
            count[(int) input.charAt(i)]++;
        for (int i = 0; i < 256; i++)
        {
            if (count[i] != 0)
                resString=resString+(char)i+count[i];
        }
        return resString;
        }
        public static void main(String[] args) {
        String inputString = "aabbccddabcdab";
        String resultString = charNCharCount(inputString);
        System.out.println("The Required String is " + resultString);
    }
}
