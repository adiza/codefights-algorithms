/*

 find the first duplicate number for which the second occurrence has the minimal index.
 For example, a = [2, 3, 3, 1, 5, 2], the output should be
 firstDuplicate(a) = 3

*/

int firstDuplicate(int[] a) {
    
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    for(int i =0; i < a.length; i++)
    {
        // in map already so increment
        if ( hm.get(a[i]) != null )
        {
            return a[i];
        }
        // not in map, then add to map
        if( hm.get(a[i]) == null )
        {
            hm.put(a[i], 1);
        }
        
        
        
    }
    return -1;

}

