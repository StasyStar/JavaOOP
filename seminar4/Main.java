package seminar4.hw;

public class Main {
    public static void main(String[] args) {
        LList<Integer> lList = new MyLinkedList<>();
        lList.addHead(13);
        lList.addHead(7);
        lList.addTail(22);
        lList.addTail(23);
        // System.out.println(lList);
        // System.out.println(lList.get(4));

        for (Integer integer : lList) {
            System.out.println(integer);
        }
    }
}
