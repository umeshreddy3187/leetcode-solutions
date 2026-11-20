class Solution {
    public boolean isBoomerang(int[][] points) {
        // double dist1=Math.pow(Math.pow(points[0][0]-points[1][0],2)+Math.pow(points[0][1]-points[1][1],2),0.5);
        // double dist2=Math.pow(Math.pow(points[0][0]-points[2][0],2)+Math.pow(points[0][1]-points[2][1],2),0.5);
        // double dist3=Math.pow(Math.pow(points[1][0]-points[2][0],2)+Math.pow(points[1][1]-points[2][1],2),0.5);
        // if(dist1<dist2 && dist1+dist3==dist2){
        //     return false;
        // }
        // return true;
        return (points[1][0]-points[0][0])*(points[2][1]-points[0][1])!=(points[1][1]-points[0][1])*(points[2][0]-points[0][0]);
    }
}