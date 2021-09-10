# Find-Peak-Element<br>
#Canvas of Problem Solving<br><br>
Leetcode problem 162<br>
The Problem Statement - <br>
**A peak element is an element that is strictly greater than its neighbors.<br>
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.<br>
You may imagine that nums[-1] = nums[n] = -∞.<br>
You must write an algorithm that runs in O(log n) time.**<br>
<br>
Whenever there is a consequence of Complexity of log n, the approach which comes first to our mind is ***Binary Search***. Used the same here. Binary Search is always used in the scenarios of sorted arrays, but in here there is no such scene. Then too, *BS* goes quite well for this. <br>
Before moving further, just to bring in a corner case with *BS* which is the **INTEGER_OVERFLOW** while performing **mid = (high + low)/2**. A case where the bounds are exactly the integer limits, then this operation will bring in overflow of Integer. To prevent this, It is recommended to replace this operation with **mid = low + (high-low)/2**.
Coming to the approach for the question -<br>
Thought is to update the **mid** in a way so that the immediate prefix and suffix comes to be lesser than the element at **ar[mid]**. So for this there shall be two cases to be considered -<br>
1 -> if( (mid == 0) || ar[mid-1] <= ar[mid] )//the check for immediate prefix<br>
&&<br>
2 -> if( (mid == ar.length-1) || ar[mid+1] <= ar[mid] ) //the check for immediate suffix<br>
Hence if conditions 1 and 2 match then return mid<br>
There exists some *Corner Cases* to be handled explicitly-<br>
1 -> If the length of array is 1 i.e. only single element exists in array, then it would automatically become the Peak hence return 0 index<br>
2 -> Check for the leftmost element and it's suffix ; Similarly for the rightmost element and it's prefix ; If the conditions satisfy, then these will also become the Peak Element
