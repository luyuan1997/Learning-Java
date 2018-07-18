package easy;

import java.util.HashMap;

public class TwoSum_2 {

	public int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		int[] label = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i< nums.length;i++) {
			hashMap.put(nums[i], i);
		}
		for(int i=0; i<nums.length; i++) {
			if(hashMap.containsKey(target-nums[i])&&hashMap.get(target-nums[i])!=i) {
				label[0]=i;
				label[1]=hashMap.get(target-nums[i]);
				break;
			}
		}
		return label;
	}

}
