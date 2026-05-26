class Solution {
    public String thousandSeparator(int n) {
        if(n<1000){
           return  String.valueOf(n) ;
        }
        StringBuilder sb = new StringBuilder();
        while(n>=1000){
            int part = n%1000;
            String group = String.format("%03d" , part);
            sb.insert(0,'.'+group);
            n = n/1000;

        }
        sb.insert(0,n);
        return sb.toString();
        
    }
}