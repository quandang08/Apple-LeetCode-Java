package apple;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

/*
 * Ghi chú về Bài Toán: Two Sum (1)
 * * Bản chất:
 * - Đây là bài toán cơ bản minh họa cho việc tối ưu hóa độ phức tạp thời gian 
 * bằng cách sử dụng cấu trúc dữ liệu Hash Map (hay còn gọi là kỹ thuật "Time-Space Trade-off").
 * * Phương pháp:
 * - Dùng One-pass Hash Map: Duyệt qua mảng chỉ một lần.
 * - Tại mỗi bước i, ta tính toán giá trị cần tìm (complement = target - nums[i]).
 * - Ta kiểm tra xem 'complement' đã có trong Map chưa. Nếu có, tìm thấy cặp số.
 * - Sau đó, thêm nums[i] và chỉ mục i vào Map để phục vụ cho các lần lặp tiếp theo.
 * * Độ phức tạp:
 * - Time Complexity: O(n) (Do duyệt qua mảng N phần tử, mỗi thao tác Map là O(1) trung bình).
 * - Space Complexity: O(n) (Do Map có thể lưu trữ tối đa N phần tử).
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

