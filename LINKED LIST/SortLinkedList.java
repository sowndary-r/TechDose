

class Solution {
    public ListNode sortList(ListNode head) { 
   if(head==null || head.next==null)
       return head;
      ListNode slow=head;
      ListNode fast=head;
      ListNode temp=null;
while(fast!=null && fast.next!=null)
    { 
       temp=slow;
       slow=slow.next;
       fast=fast.next.next;
    
        
    }
    temp.next=null;
  ListNode l1=sortList(head);
  ListNode l2=sortList(slow);
   return mergeSort(l1,l2);
    
    } 
 static ListNode mergeSort (ListNode h1,ListNode h2)
     
{ 
 ListNode fh=null;
 ListNode ft=null;
   while(h1!=null &&h2!=null) 
  { 
    if(fh==null&&ft==null)
    { 
      if(h1.val<h2.val)
      { 
      fh=h1;
      ft=h1;
      h1=h1.next;
          
      }
      else 
      { 
       fh=h2;
       ft=h2;
       h2=h2.next;
      }
    }
   else
   { 
    if(h1.val<h2.val)
    { 
     ft.next=h1; 
     ft=ft.next;
     h1=h1.next;
    }
    else
    { 
     ft.next=h2;
     ft=ft.next;
     h2=h2.next;
    }
   }
    
  }
  if(h1!=null)
  ft.next=h1;
  if(h2!=null)
  ft.next=h2;
  
  return fh;     
  
}
}
