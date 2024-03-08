package Ћ–9.Example4;

public class Main {
        public static void main(String[] args) {
// создание несв€занных узлов с помощью конструктора
            Node node0 = new Node(0, null); // 0-й узел Ц будет головой в списке
            Node node1 = new Node(1, null);
            Node node2 = new Node(2, null);
            Node node3 = new Node(3, null); // последний узел Ц будет хвостом в списке
// св€зывание узлов в список с помощью ссылок
            node0.next = node1;
            node1.next = node2;
            node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,соответствующей текущему значению ссылки при прохождении по списку
            Node ref = node0; // дл€ перемещени€ по списку достаточно помнить голову
            while (ref != null) {
                System.out.print(" " + ref.value); ref = ref.next;
            }
        }
    }
    class Node { //  Ћј—— Ц —“–” “”–ј ЁЋ≈ћ≈Ќ“ј —ѕ»— ј
        public int value; // значение
        public Node next; // поле Ц ссылка (указатель) на следующий узел

        Node(int value, Node next) { // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
