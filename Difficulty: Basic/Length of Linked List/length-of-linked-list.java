/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int len = 1;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }
        return len;
    }
}