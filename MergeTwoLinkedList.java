static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        SinglyLinkedListNode node = null;
        SinglyLinkedListNode p1 = head1;
        SinglyLinkedListNode p2 = head2;
        while(p1!=null && p2!=null){
            if(p1.data<p2.data){
                node = p1;
                p1=p1.next;
            } else {
                if(node!=null){
                    node.next = p2;
                }
                node = p2;
                p2=p2.next;
                node.next = p1;
            }
        }
        if(p1!=null){
            node.next = p1;
        } 
        if(p2!=null){
            node.next = p2;
        }

        if(head1.data < head2.data){
            return head1;
        }    
        return head2;
    }
