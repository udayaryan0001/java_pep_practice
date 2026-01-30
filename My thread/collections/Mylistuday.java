package collections;

public class Mylistuday {
 int capacity=8;
 int arr[] = new int[capacity];
 void resize()
 {
    int newarr[] = new int[capacity*2];
    for(int i=0;i<capacity;i++)
    {
        newarr[i]=arr[i];
    }
    arr=newarr;
    capacity=capacity*2;
 }
 void addlistelement(int element)
 {  
    for(int i=0;i<capacity-1;i++)
        {
            arr[i]=element;

        }
    if(capacity==arr.length)
    {
        resize();
    }
 } 
 void removelistelement(int index)
 {
    for(int i=index;i<capacity-1;i++)
    {
        arr[i]=arr[i+1];
    }
    capacity--;
 }    
}
