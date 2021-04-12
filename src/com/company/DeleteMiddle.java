package com.company;

public class DeleteMiddle {
    public boolean deleteMiddle(LinkedListNode n){
        if (n==null || n.next==null){
            return false;
        }
        LinkedListNode next = n.next;
        n.val = next.val;
        n.next = next.next;
        return true;
    }
}
