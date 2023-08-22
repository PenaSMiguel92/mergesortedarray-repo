public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int[] tmp1 = new int[m];
        for (int i = 0; i < m; i++) {
            tmp1[i] = nums1[i];
        }

        int left = 0;
        int right = 0;
        int cur = 0;
        while (left < m && right < n) {
            if (tmp1[left] <= nums2[right]) {
                nums1[cur++] = tmp1[left++];
            } else {
                nums1[cur++] = nums2[right++];
            }
        }
        while (left < m) {
            nums1[cur++] = tmp1[left++];
        }
        while (right < n) {
            nums1[cur++] = nums2[right++];
        }

    }
}
