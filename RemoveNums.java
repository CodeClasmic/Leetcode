

class RemoveNums {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    void printArray(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x] + ",");
        }
        System.out.println();
    }

    // ✅ delete a node by its VALUE (not position)
    ListNode deleteNodeByValue(ListNode head, int value) {
        if (head == null) return null;

        // if head itself needs deletion
        while (head != null && head.val == value) {
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // ✅ your modifiedList logic, fixed
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null) return null;

        for (int x = 0; x < nums.length; x++) {
            head = deleteNodeByValue(head, nums[x]);
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveNums obj = new RemoveNums();

        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(67);

        int[] nums = {3, 6, 7, 9, 7, 9};

        obj.printArray(nums);
        System.out.print("Original list: ");
        obj.print(head);

        head = obj.modifiedList(nums, head);

        System.out.print("Modified list: ");
        obj.print(head);
    }
}
