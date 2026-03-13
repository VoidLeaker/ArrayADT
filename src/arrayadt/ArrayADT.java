/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayadt;

/**
 *
 * @author e4149202
 */
public class ArrayADT {

        
    int[] data;
    int numberOfEntries;
    int last;
    int capacity;
    
    // constructor
    public ArrayADT(int size)
    {
        this.data = new int[size];
        numberOfEntries = 0;
        last = -1;
        capacity = size;
        System.out.println("The object has been created of size " + size);
    }
    
    public ArrayADT(int[] array)
    {
        data = array;
        this.numberOfEntries = array.length;
    }
    
    public boolean remove(int position)
    {
        //if position in the array
        // replace item with zero
        if(position < data.length)
        {
            data[position] = 0;
            System.out.println("Item Replaced ");
            return true;
        }
        //if not in the array
        //return message "out of array"
        else
        {
            System.out.println("Position not in the array ");
            return false;
        }
    }
    
//    public String add(int entry)
//        {
//            if(numberOfEntries==data.length)
//                return("The array is full");
//            else
//            {
//                data[0] = entry;
//                numberOfEntries++;
//                last++;
//                return("The item has been added");
//            }
//        }
    public String add(int entry)
    {
        if(numberOfEntries==data.length)
        {
            return("The Array is full");
        }
        else
        {
            data[numberOfEntries] = entry;
            numberOfEntries++;
            last++;
            return("The item has been added");
        }
    }
    
    public int getIndex(int index)
    {
        if(index>data.length)
        {
            return(-999);
        }
        else
        {
            return(data[index]);
        }
    }
    
    public boolean isEmpty()
    {
        if(numberOfEntries==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull()
    {
        return(numberOfEntries==data.length);
    }
    
    public int numberOfElements()
    {
        return numberOfEntries;
    }
    
    public void destroyArray()
    {
        data = null
    }
    
    public void print()
    {
        for (int i=0; i<data.length; i++)
        {
            System.out.println(data[i] + " ");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the ArrayADT
        ArrayADT x = new ArrayADT(7);
        // add entries
        System.out.println("-----Adding Entries-----");
        System.out.println(x.add(8));
        System.out.println(x.add(5));
        System.out.println(x.add(6));
        System.out.println(x.add(3));
        System.out.println(x.add(2));
        System.out.println(x.add(7));
        System.out.println(x.add(1));
        System.out.println("-----Print Array-----");
        x.print();
        System.out.println("-----Remove Item-----");
        x.remove(0);
        x.print();
        System.out.println("-----Get Index-----");
        System.out.println("The item retrived is: " + x.getIndex(5));
        System.out.println("-----Is Empty-----");
        System.out.println("Is the array empty: " + x.isEmpty());
        System.out.println("-----Number Elements-----");
        System.out.println("The array contains: " + x.numberOfElements());
        System.out.println("----------");
    }
    
}
