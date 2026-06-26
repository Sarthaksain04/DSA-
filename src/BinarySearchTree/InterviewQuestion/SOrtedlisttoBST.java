package BinarySearchTree.InterviewQuestion;


import java.util.ArrayList;
import java.util.List;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class TreeNode {
    int val ;
    TreeNode right ;
    TreeNode left ;

    TreeNode(int val){
        this.val = val;
        right = null;
        left = null ;

    }


    public static TreeNode helper(int[]nums , int low , int high ){
        if(low > high ) return null;
        int mid = low + (high - low) / 2 ;
        TreeNode root  = new TreeNode(nums[mid]);
        root.left = helper(nums , low , mid - 1  );
        root.right = helper( nums , mid + 1  ,high );
        return root;

    }

    public static TreeNode sortedListToBST(ListNode head) {

        ListNode temp = head;
        int n = 0 ;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int[] nums = new int[n];
        int i =  0;
        temp = head;
        while(temp != null){
            nums[i]= temp.val;
            temp = temp.next;
            i++;
        }
        return helper(nums , 0 , n - 1);
    }
    public static void inorder(TreeNode root){

        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}


public class SOrtedlisttoBST {

    public static void main(String[] args) {
         ListNode li = new ListNode(-10);
         ListNode l2 = new ListNode(-3);
         ListNode l3 = new ListNode(0);
         ListNode l4 = new ListNode(5);
         ListNode l5 = new ListNode(9);

         li.next =  l2;
         l2.next = l3;
         l3.next = l4;
         l4.next = l5;

        TreeNode root = TreeNode.sortedListToBST(li);

          TreeNode.inorder(root);

    }
}
