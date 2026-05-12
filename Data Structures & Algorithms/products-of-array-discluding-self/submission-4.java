class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int totalProduct = 1;
        boolean zeroFlag = false;
        boolean numFlag = false;
        boolean multZeroFlag = false;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                if (zeroFlag) {
                    multZeroFlag = true;
                    continue;
                }
                zeroFlag = true;
                continue;
            } 
            numFlag = true;
            totalProduct *= nums[i];
        }

        if(!numFlag) {
            totalProduct = 0;
        }

        if (multZeroFlag) {
            for (int i=0; i<nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }

        for (int i=0; i<nums.length; i++) {
            if (zeroFlag) {
                if (nums[i] == 0) {
                    nums[i] = totalProduct;
                } else {
                    nums[i] = 0;
                }
                continue;
            }
            nums[i] = totalProduct / nums[i];
        }

        return nums;

    }
}  
