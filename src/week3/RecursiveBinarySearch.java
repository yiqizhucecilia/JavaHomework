package week3;


public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		int[] nums= {1,5,10,15,30,50};
		int key=50;
		System.out.println(recursiveBianrySearch(nums,5));
		System.out.println(recursiveBianrySearch2(nums,5));

	}
	// return the position of the number.
	public static int recursiveBianrySearch(int[] nums, int key) {
		int low=0;
		int high=nums.length-1;
		return recursiveBianrySearch(nums,key,low,high);
	}
	public static int recursiveBianrySearch(int[] nums, int key,int low, int high) {
		int mid=low+(high-low)/2;
		if (low>high) {
			return -1;  
		}
		else if (key==nums[mid]) { 
			return mid;
		}else if (key<=nums[mid]){ 
			return recursiveBianrySearch(nums,key,low, mid-1);
		}else {
			return recursiveBianrySearch(nums,key,mid+1, high);
		}
	}

  //return true or false
	public static boolean recursiveBianrySearch2(int[] nums, int key) {
		int low=0;
		int high=nums.length-1;
		return recursiveBianrySearch2(nums,key,low,high);
	}
	public static boolean recursiveBianrySearch2(int[] nums, int key,int low, int high) {
		int mid=low+(high-low)/2;
		if (low>high) {
			return false;  
		}
		else if (key==nums[mid]) { 
			return true;
		}else if (key<=nums[mid]){ 
			return recursiveBianrySearch2(nums,key,low, mid-1);
		}else {
			return recursiveBianrySearch2(nums,key,mid+1, high);
		}
	}
}