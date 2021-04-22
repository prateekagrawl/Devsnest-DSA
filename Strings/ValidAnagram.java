

    public boolean isAnagram(String s, String t) {
        char sc[]= s.toCharArray();
        char st[]= t.toCharArray();
        int n=s.length();
        int m=t.length();
        if(n!=m)
            return false;
        Arrays.sort(sc);
        Arrays.sort(st);
       for(int i=0;i<n;i++){
             if (sc[i]!=st[i])
                return false;
        }
        return true;
    }

OR


public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        char sc[]= s.toCharArray();
        char st[]= t.toCharArray();
        int count[]= new int[26];
        for(int i=0;i<s.length();i++){
             count[sc[i]-'a']++; //increment counter for any letter in s
             count[st[i]-'a']--; //decrement counter for any letter in t so net=0
        }
        for(int c: count){ //check whether count[] has any value !=0
            if(c!=0)
                return false;
        }
    return true;
