class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map =new HashMap<>();

        List<List<String>> ls = new ArrayList<List<String>>();
        for(String str : strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);

            String key = new String(ca);
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        for(Map.Entry<String ,List<String>> e : map.entrySet()){
            ls.add(e.getValue());
        }
        return ls;
        
    }
}