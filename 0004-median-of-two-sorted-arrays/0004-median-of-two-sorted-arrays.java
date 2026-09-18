class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged_array = new int[n+m];
        int k = 0;
        for(int i = 0; i < n; i++){
            merged_array[k++] = nums1[i];
        }
        for(int i = 0; i < m; i++){
            merged_array[k++] = nums2[i];
        }

        Arrays.sort(merged_array);

        int total = merged_array.length;

        if(total % 2 == 1){
            return (double) merged_array[total/2];
        }
        else{
            int middle1 = merged_array[total / 2 - 1];
            int middle2 = merged_array[total / 2];
            return (double) (middle1 + middle2)/2;
        }

    }
}