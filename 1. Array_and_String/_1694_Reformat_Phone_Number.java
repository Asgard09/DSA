public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();

        //Filter out non-digit characters
        for(char c: number.toCharArray()) {
            //It converts a String into an array of characters (char[])
            if(c>='0' && c<='9')    
            sb.append(c);
        }
        
        StringBuilder ans = new StringBuilder();
        String s = sb.toString();
        //determine whether to append a hyphen (-) before the next group of digits in the formatted string.
        boolean flag =false;
        for(int i=0;i<s.length();){
            if(s.length()-i==4){
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+2));
                ans.append("-");
                ans.append(s.substring(i+2,i+4));
                break;
            }
            else if(s.length()-i==2){
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+2));
                break;
            }
            else{
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+3));
                flag=true;
                i+=3;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String number = "123 4-567";
        System.out.println(reformatNumber(number).toString());

    }
}
