public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int index = 0; index < n; index++) {
                nums1[index] = nums2[index];
            }
            return;
        }
        int[] temp1 = new int[m];
        for (int index = 0; index < m; index++) {
            temp1[index] = nums1[index];
        }
        int i = 0;
        int j = 0;
        int cur = 0;
        while (i < m || j < n) {
            if ((i < m && j < n) && (temp1[i] <= nums2[j])) {
                nums1[cur++] = temp1[i++];
            } else if ((i < m && j < n) && (temp1[i] > nums2[j])) {
                nums1[cur++] = nums2[j++];
            } else if (i < m) {
                nums1[cur++] = temp1[i++];
            } else if (j < n) {
                nums1[cur++] = nums2[j++];
            }
        }
    }
}
