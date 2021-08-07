// 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
//
//
//
// 示例 1：
//
//
// 输入：n = 3
// 输出：5
//
//
// 示例 2：
//
//
// 输入：n = 1
// 输出：1
//
//
//
//
// 提示：
//
//
// 1 <= n <= 19
//
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树
// 👍 1257 👎 0

package leetcode.editor.cn;

// author: yang
// createTime: 2021-08-07 09:26:59

class UniqueBinarySearchTrees {
    public static void main(final String[] args) {
        Solution.numTrees(3);
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public static int numTrees(final int n) {
            final int[] arr = new int[n + 1];
            arr[0] = arr[1] = 1;

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    arr[i] += arr[j - 1] * arr[i - j];
                }
            }

            return arr[n];
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
