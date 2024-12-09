package DesignTasks.ReverseLinkedList;

/*Обращение связанного списка (Reverse Linked List):
Обратите связанный список.

Пример:
Вход: 1->2->3->4->5->NULL
Выход: 5->4->3->2->1->NULL
*/


public class ReverseLinkedList {

public static ListNode reversedList(ListNode head){
    ListNode prev = null;
    ListNode current = head;
     while(current != null){
         ListNode nextNode = current.next;
         current.next = prev;
         prev = current;
         current = nextNode;
     }

    return prev;
}

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("NULL ");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println("Исходный список:");
        printList(head);

        ListNode reversedHead = reversedList(head);
        System.out.print("Обращенный список:");
        printList(reversedHead);
    }
}


