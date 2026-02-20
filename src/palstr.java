public class palstr {
    public static boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;

    while (i < j) {
        while(!Character.isLetter(s.charAt(i)))
            i++;
        while(!Character.isLetter(s.charAt(j)))
            j--;
        if(s.charAt(i)!=s.charAt(j))
            return false;
        i++;
        j--;
    }

    return true;
}
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s.toLowerCase()));

    }
}
