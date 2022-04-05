function SortedMerge(a,b)
{
    var result = null;
       
/* point to the last result pointer */
var lastPtrRef = result;
       
while(1)
{
    if (a == null)
    {
    lastPtrRef = b;
    break;
    }
    else if (b==null)
    {
    lastPtrRef = a;
    break;
    }
    if(a.data <= b.data)
    {
    MoveNode(lastPtrRef, a);
    }
    else
    {
    MoveNode(lastPtrRef, b);
    }
       
    /* tricky: advance to point to the next ".next" field */
    lastPtrRef = ((lastPtrRef).next);
}
return(result);
}
var A = [4,5,6];
var B = [1,2,3];
document.write(SortedMerge([1,2,3],[4,5,6]));