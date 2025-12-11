class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class addtwonumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode xx = new ListNode(0);   
        ListNode curr = xx;              

        int crr = 0;  

        
        while (l1 != null || l2 != null || crr != 0) {

            int x = (l1 != null) ? l1.val : 0;  
            int y = (l2 != null) ? l2.val : 0; 

            int sum = crr + x + y; 
            crr = sum / 10;         

            curr.next = new ListNode(sum % 10);  
            curr = curr.next;                    

            if (l1 != null) l1 = l1.next;        
            if (l2 != null) l2 = l2.next;      
        }

        return xx.next;  
    }

    public static void main(String[] args) {
       
    }
}
