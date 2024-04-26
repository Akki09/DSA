package solveProblemsOnArray.easy;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 1, 1, 1, 0, 0, 1};
        System.out.println(traffic(input.length, 2, input));
    }

    public static int traffic(int n, int m, int []vehicle) {

        int count = 0;
        int maxConsecutive = 0;
        for(int i = 0; i<n; i++){
            if(vehicle[i] == 1){
                count++;
                if(maxConsecutive<count){
                    maxConsecutive = count;
                }
            }else{
                if(m>0){
                    count++;
                    if(maxConsecutive<count){
                        maxConsecutive = count;
                    }
                    m--;
                }
            }

        }
        return maxConsecutive;
    }
}
