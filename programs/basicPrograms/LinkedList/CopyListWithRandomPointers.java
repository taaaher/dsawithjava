package dsaWithJava.functions.LinkedList;
//https://leetcode.com/problems/copy-list-with-random-pointer/description/

import java.util.HashMap;

public class CopyListWithRandomPointers {
    public static void main(String[] args) {

    }

    public DeepNode copyRandomList(DeepNode head) {
        HashMap<DeepNode, DeepNode> mp = new HashMap<>();
        DeepNode cur = head;
//        first pass for creating the nodes in the hashmap.
        while(cur != null){
            mp.put(cur, new DeepNode(cur.val));
            cur = cur.next;
        }

        cur = head;

//        Second pass for linking the next and random pointers
        while(cur != null){
            mp.get(cur).next = mp.get(cur.next);
            mp.get(cur).random = mp.get(cur.random);
            cur = cur.next;
        }

        return mp.get(head);
    }

    public class DeepNode {
        int val;
        DeepNode next;
        DeepNode random;

        DeepNode(int val){
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }
}
