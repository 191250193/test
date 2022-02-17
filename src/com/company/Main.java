package com.company;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));

    }


}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int s_length = s.length();
        int p_length = p.length();
        List<Integer> indexs = new ArrayList<>();

    }
}




