package HomeWork3.LinkedListNode;

public class LinkedList {
    private Node head;


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Разворот списка
    public void reverse() {
        Node prev = null;       // Указатель на предыдущий узел
        Node current = head;    // Текущий узел
        Node next = null;       // Временный указатель на следующий узел

        while (current != null) {
            next = current.next;   // Сохраняем следующий узел
            current.next = prev;   // Меняем направление ссылки
            prev = current;        // Сдвигаем указатель `prev` вперед
            current = next;        // Сдвигаем указатель `current` вперед
        }

        head = prev; // Устанавливаем новый головной узел
    }

    public void printList() {
        Node current = head; // Начинаем с первого узла
        while (current != null) { // Пока узлы есть
            System.out.print(current.data + " -> ");
            current = current.next; // Переходим к следующему узлу
        }
        System.out.println("null"); // Конец списка
    }

}
