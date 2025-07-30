public class RotatedArraySearch {
    // Step 1: Main method to search in rotated array
    public int search(int[] nums, int target) {
        // Find index of smallest element (pivot)
        int min = minSearch(nums);

        // If target is in the right sorted part
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        }
        // If target is in the left sorted part
        else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }
    // Step 2: Binary Search within given bounds
    public int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; // target not found
    }
    // Step 3: Find index of minimum element (pivot point)
    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is smaller than its previous, it's the pivot
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            }
            // If left part is sorted and mid > right, pivot must be in right half
            else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Else, pivot is in left half
            else {
                right = mid - 1;
            }
        }

        return left; // Pivot index
    }
    // Example usage
    public static void main(String[] args) {
        RotatedArraySearch obj = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int index = obj.search(nums, target);
        System.out.println("Index of target: " + index);
    }
}
