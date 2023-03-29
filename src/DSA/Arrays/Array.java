package DSA.Arrays;

public class Array {

    private int[] items;

    private int count;

    public Array(int length)
    {
        items = new int[length];
    }

    public void print()
    {
        for(int i = 0; i<count;i++)
            System.out.println(items[i]);
    }

    public void insert(int item)
    {
        if(items.length == count)
        {
            int[] newItems = new int[count * 2];
            for (int i = 0; i<count;i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    public void removeOf(int index)
    {
        if(index < 0 || index >= count)
        {
            throw new IllegalArgumentException();
        }

        for(int i = index; i<count; i++) {
            items[i] = items[i + 1];
            count = count - 1;

        }
    }

    public int indexOf(int item)
    {
        for(int i = 0; i<count;i++)
        {
            if(items[i] == item)
                return i;
        }
        return -1;
    }

    public int searchOf(int item)
    {
        for(int i =0; i<count;i++)
        {
            if(items[i] == item)
                return item;
        }
        return -1;
    }

    public void sort()
    {
        int temp = 0;
        for(int i = 0;i <count;i++)
        {
            for(int j = 0; j<count;j++)
            {
                if(items[i] > items[j])
                {
                    temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        for(int i = 0; i < count; i++)
        System.out.println("sorting order ==== " + items[i]);
    }




}
