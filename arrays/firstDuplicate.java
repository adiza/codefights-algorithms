

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

