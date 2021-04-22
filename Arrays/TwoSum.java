 public int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> hs= new HashMap<>();
        for(int i=0;i<a.length;i++){
            int x= target- a[i];
            if(hs.containsKey(x))
             return new int[]{hs.get(x),i};   
            hs.put(a[i],i);
        }
        throw new IllegalArgumentException();
    }