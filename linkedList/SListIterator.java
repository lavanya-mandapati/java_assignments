package linkedList;

public class SListIterator {
    public static SList insert(SList list,int data)
    {
        SList.Node new_node=new SList.Node(data);
        new_node.next=null;
        if(list.head==null)
        {
            list.head=new_node;
        }
        else
        {
            SList.Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
    public static SList deleteByKey(SList list,int key)
    {
        SList.Node currentNode=list.head,previous=null;
        if(currentNode!=null && currentNode.data==key)
        {
            list.head=currentNode.next;
            System.out.println(key +"found and deleted");
            return list;
        }
        while(currentNode !=null && currentNode.data!=key)
        {
            previous=currentNode;
            currentNode=currentNode.next;
        }
        if(currentNode!=null)
        {
            previous.next=currentNode.next;
            System.out.println(key +"found and removed");
        }
        if(currentNode==null)
        {
            System.out.println(key +"not found");
        }
        return list;
    }
    public static SList deleteAtPosition(SList list , int index)
    {
        SList.Node currentNode=list.head,previous=null;
        if(index==0 && currentNode!=null)
        {
            list.head=currentNode.next;
            System.out.println(index +" position element found and deleted");
            return list;
        }
        int counter=0;
        while(currentNode!=null)
        {
            if(counter==index)
            {
                previous.next=currentNode.next;
                System.out.println(index+ "position element found and deleted");
                break;
            }
            else
            {
                previous=currentNode;
                currentNode=currentNode.next;
                counter++;
            }
            if(currentNode==null)
            {
                System.out.println(index +" position element not found");
            }
        }
        return list;
    }
    }
