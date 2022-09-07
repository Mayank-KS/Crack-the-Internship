class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int[] row : matrix) {
            for(int col : row) {
                array.add(col);
            }
        }
        
        int left = 0;
        int right = array.size() - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(array.get(mid)  == target) {
                return true;
            } else if(target < array.get(mid)) {
                right = mid - 1;
            } else if(target > array.get(mid)) {
                left = mid + 1;
            } 
        }
        return false;
    }
}