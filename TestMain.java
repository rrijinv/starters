public class TestMain {
    public static void main(String[] args) {
        int i= (4+1)/2;
        System.out.println(i);
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        int len =getLen(head);
        int reqIndex=Math.ceilDiv(len,2);
        return getNode(head,reqIndex);
    }

    private ListNode getNode(ListNode head, int reqIndex) {
        ListNode tempHead=head;
        int counter=0;
        while(tempHead.next!=null && counter<=reqIndex){
            tempHead=tempHead.next;
        }
        return tempHead;
    }

    private int getLen(ListNode head) {
        ListNode tempHead=head;
        int len=0;
        while(tempHead.next!=null){
            tempHead=tempHead.next;
            len++;
        }
        return len;
    }
}

class NUMBER_OF_STEPS_TO_REDUCE_A_NUMBER_TO_ZERO {
    public int numberOfSteps(int num) {
        int stepCount = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 1 == 0) {
                num = num - 1;
            }
            stepCount++;
        }
        return stepCount;
    }
}