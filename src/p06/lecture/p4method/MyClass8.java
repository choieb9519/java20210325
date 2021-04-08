package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass8 {
	//가장 큰 값이 출력되도록
	//아무것도 없으면 0 출력
	/*
	    int max(int... i) {
		int max = 0;
		for (int m = 0; m < i.length; m++);
			max += values[i];
	}
	return max;
	*/
	int max(int... nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}
}
