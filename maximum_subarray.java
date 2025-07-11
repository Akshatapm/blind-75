public class maximum_subarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,1,3,5,6,8};
        int maxval=maximum_array(arr);
        System.out.println(maxval);
    }
    public static int maximum_array(int[] nums){
        int maxsofar=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            maxsofar=Math.max(maxsofar,curr);
        }     
       return maxsofar;
    }
}
