public class solution{
	public static int trappedRainWater(int height[]){

		//Calculate left max boundary of array

		int leftMax[] = new int[height.length];
		leftMax[0] = height[0];

		for(int i = 1; i < height.length; i++){
			leftMax[i] = Math.max(height[i], leftMax[i-1]);
		}

		//Calculate right Max boundary of array

		int rightMax[] = new int[height.length];
		rightMax[height.length -1] = height[height.length-1];

		for(int i = height.length - 2; i >= 0; i--){
			rightMax[i] = Math.max(height[i], rightMax[i+1]);
		}

		//loop
		int trapped_water = 0;
		for(int i = 0;  i < height.length; i++){
			int waterLevel = Math.min(leftMax[i],rightMax[i]);
			trapped_water += waterLevel - height[i];
		}
		return trapped_water;
	}


	public static void main(String[] args){
		int num[] = {4,2,0,6,3,2,5};
		int result = trappedRainWater(num);
		System.out.println(result);
	}
}
