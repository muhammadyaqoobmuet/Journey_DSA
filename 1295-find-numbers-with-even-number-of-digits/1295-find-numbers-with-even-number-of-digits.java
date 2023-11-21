class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    private boolean hasEvenDigits(int num) {
        int digitCount = (int) Math.log10(num) + 1;

        return digitCount % 2 == 0;
    }
}
