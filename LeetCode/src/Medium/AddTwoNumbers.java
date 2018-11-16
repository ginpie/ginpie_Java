package Medium;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {

    public static LinkedList addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
            LinkedList<Integer> sum = new LinkedList();
            int a = l1.size();
            int b = l2.size();
            int carry = 0;
            int digit;
            for (int i=0; i<Math.max(a,b)+1; i++){
                if (i<Math.min(a,b)) {
                    digit = (l1.get(i) + l2.get(i) + carry) % 10;
                    sum.add(digit);
                    carry = (l1.get(i) + l2.get(i) + carry) / 10;
                } else if (i<Math.max(a,b) && a>b){
                    digit = (l1.get(i) + carry) % 10;
                    sum.add(digit);
                    carry = 0;
                } else if (i<Math.max(a,b) && a<b) {
                    digit = (l2.get(i) + carry) % 10;
                    sum.add(digit);
                    carry = 0;
                } else if (i==Math.max(a,b) && carry != 0){
                    sum.add(carry);
                }
            }

            return sum;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(4);l1.add(5);l1.add(6);l1.add(7);l1.add(8);l1.add(9);l1.add(4);l1.add(6);l1.add(6);l1.add(6);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(7);l2.add(8);l2.add(9);l1.add(6);l1.add(6);l1.add(6);l1.add(6);l1.add(6);l1.add(6);l1.add(6);

        long start = System.nanoTime();
        addTwoNumbers(l1,l2);
        long elapsedTime = (System.nanoTime() - start)/1000;
        System.out.println(elapsedTime+" us");
        //System.out.println(addTwoNumbers(l1,l2).toString());
    }

}
