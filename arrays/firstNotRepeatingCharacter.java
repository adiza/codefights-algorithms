

char firstNotRepeatingCharacter(String s) {
    
    int[] repeats = new int[26];
    
    for( int i = 0; i < s.length(); i++)
    {
        // repeated characters values are indexed
        repeats[(int) s.charAt(i) - 97] += 1;
        
    }

    for ( int i = 0; i < s.length(); i++)
    {
        if ( repeats[(int) s.charAt(i) - 97] == 1 )
        {
               return s.charAt(i);
        }
                         
    }
    // given nothing is found 
    return (char) '_';
}