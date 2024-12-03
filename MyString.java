public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++)
        {
        char ch = str.charAt(i);
        boolean Big = ((ch > 'A') && (ch  < 'Z')) ^ (ch == 'A') ^ (ch == 'Z') ;
        if (Big == true)
         {
            ch =  (char) (ch + 32);
            newstr = newstr +ch;

         }   
         else
         {
            newstr = newstr +ch;
         }

        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2)
     {
        if (str1. length() < str2.length())
        {
            return false;
        }
        if (str2.length() == 0 )
        {
            return true;
        }
        String newstr1 = lowerCase(str1);
        String newstr2 = lowerCase(str2);
        boolean iscontains = false; 
        for (int i= 0; i < str2.length(); i++)
        {
            if (newstr1.charAt(i) == newstr2.charAt(0))
            {
                for ( int z = 0; z < newstr2.length(); z++)
                { 
                        if (newstr1.charAt(i) != newstr2.charAt(z))
                        {
                            return false;
                        }
                    i++;
                }
                return true;
            }
        }
        return iscontains;
    }
}
