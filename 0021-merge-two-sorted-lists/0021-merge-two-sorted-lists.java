/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /// new Merged Sortet create new List to save sorted merged item from both list
       
       ListNode headList = new ListNode();
       ListNode newList = headList;
       
      
       
       // iterate through both list append item to the list 
       
        ListNode temp1 = list1;
        ListNode temp2 = list2;
       
        while(temp1 != null || temp2 != null){
            
            
            /// edge case for last element 
            
            // if list one exist and list 2 does not have items
            if(temp1 != null && temp2 == null){
                 System.out.println("List 1 e : " + temp1.val);
                  if(newList == null){
                      newList = new ListNode(temp1.val);
                        headList = newList;
                  }else{
                      newList.next = new ListNode(temp1.val);
                       newList = newList.next;
                  }
                 temp1 = temp1.next;
                 continue;
            }
            
            // if list two exist and list one does not have items
             if(temp1 == null && temp2 != null){
                 System.out.println("List 2 e : " + temp2.val);
                 if(newList == null){
                      newList = new ListNode(temp2.val);
                        headList = newList;
                  }else{
                      newList.next = new ListNode(temp2.val);
                       newList = newList.next;
                  }
                 temp2 = temp2.next;
                   continue;
            }
            //  System.out.println("Comparing for :  temp1 " + temp1.val +  "-----" +  " temp2 " + temp2.val);
            if(temp1.val < temp2.val){
   
                 System.out.println("List 1 : " + temp1.val);
                  if(newList == null){
                      newList = new ListNode(temp1.val);
                      headList = newList;
                  }else{
                      newList.next = new ListNode(temp1.val);
                      newList = newList.next;
                  }
                 temp1 = temp1.next;
                
            }else{
                 if(newList == null){
                      newList = new ListNode(temp2.val);
                        headList = newList;
                  }else{
                      newList.next = new ListNode(temp2.val);
                       newList = newList.next;
                      
                  }
                 System.out.println("List 2 : " + temp2.val);
                  temp2 = temp2.next;
            }
           
       
           
        }
        
         return headList.next; 
    }
}