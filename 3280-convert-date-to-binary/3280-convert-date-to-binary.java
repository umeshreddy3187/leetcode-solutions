class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");
        StringBuilder s= new StringBuilder();
        for(int i=0;i<parts.length;i++){
            if(i>0){
                s.append("-");
            }
            s.append(Integer.toBinaryString(Integer.parseInt(parts[i])));
        }
        return s.toString();
        
    }
}