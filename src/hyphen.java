public class hyphen {
    public static String movehy(String str) {
        if(str.length()==0)
            return null;
        else{
            String result = "";
            for(int i = 0; i< str.length();i++) {
                char ch = str.charAt(i);
                if (ch == '-')
                    result = ch + result;
                else
                    result += ch;
            }
            return result;
            }
        }

    public static void main(String[] args) {
        System.out.println(movehy("dqdqd-dqdqd-dqdqd"));

    }
    }

