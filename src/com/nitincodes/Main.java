package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(countRotation(arr));
    }
    private static int countRotation(int[] arr) {
    int pivot = findPivot(arr);
    return pivot+1;
    }
    // use this for non duplicates
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

