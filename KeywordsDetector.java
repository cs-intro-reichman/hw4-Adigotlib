public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) 
    {
        for (int i = 0; i < sentences.length; i++)
        {
            for (int z = 0; z < keywords.length; z++)
            {
                if (contains(sentences[i],keywords[z]) == true)
                {
                    System.out.println(sentences [i]);
                    break;
                }
              
            }
        }
    }

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
       String newstr1 = str1.toLowerCase();
       String newstr2 = str2.toLowerCase();
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
    

