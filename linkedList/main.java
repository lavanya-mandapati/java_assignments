package linkedList;

public class main {
        public static void main(String[]args)
        {
            SList s=new SList();
            s=SListIterator.insert(s,1);
            s=SListIterator.insert(s,2);
            s=SListIterator.insert(s,3);
            s=SListIterator.insert(s,4);
            s=SListIterator.insert(s,5);
            s=SListIterator.insert(s,6);
            s=SListIterator.insert(s,7);
            SList.printList(s);
            SListIterator.deleteByKey(s,1);
            SListIterator.deleteAtPosition(s,2);
            SList.printList(s);

        }
}
