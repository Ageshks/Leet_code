class Solution {
    public int findComplement(int num) {
        return ~num & (int) (Math.pow(2, (Math.floor(Math.log(num) / Math.log(2)) + 1)) - 1);
    }
}