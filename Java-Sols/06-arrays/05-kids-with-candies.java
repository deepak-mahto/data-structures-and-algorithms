class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        final int maxCandy = Arrays.stream(candies).max().getAsInt();

        for (final int candy : candies) {
            ans.add(candy + extraCandies >= maxCandy);
        }
        return ans;
    }
}