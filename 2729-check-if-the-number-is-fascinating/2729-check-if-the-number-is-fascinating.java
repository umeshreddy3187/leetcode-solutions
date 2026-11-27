class Solution {
    public boolean isFascinating(int n) {
        String r="" +n +(2*n)+(3*n);
        if(r.length()!=9) return false;
        List<Character> list=new ArrayList<>(
            Arrays.asList('1','2','3','4','5','6','7','8','9')
        );
        for(int i=0;i<r.length();i++){
            if(list.contains(r.charAt(i))){
                list.remove(Character.valueOf(r.charAt(i)));
            }
        }
        return list.isEmpty();
    }
}