package Lab_1;

public class palindrome_string {

    public boolean checkPalindrome(String original)
    {
        boolean flag=false;
        String reverse="";

        for(int i=original.length()-1;i>-1;i--)
            reverse=reverse+original.charAt(i);

        if(original.equals(reverse))
            flag=true;
        else
            flag=false;
        return flag;
    }
}
