/*

Ques: Reverse a Queue

Example : int[] a={1,2,3,4,5};
output  : {5,4,3,2,1};

Idea :

-> First element is front and last element is rear, Can we do swap of rear and front element,
   No we can't do becuase it is queue not an array, so try to think in another way.

-> If we delelete element from the front and it it to rear untill front != read then it will work, let's check.

   1,2,3,4,5 -> 2,3,4,5,1 -> 3,4,5,1,2 -> 4,5,1,2,3 -> 5,1,2,3,4 -> 1,2,3,4,5

   So you can check queue did not reverse, it is same .


Second Idea :
  -> create stack
  -> fetch element from queue and add in stack. Now queue is empty
  -> now fetch element from stack and add it in the queue, when stack is empty exit from the loop
  -> return the queue
* */
package com.dsa.advance.queue;

public class ReverseQueue {
}
