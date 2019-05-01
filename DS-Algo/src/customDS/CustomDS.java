package customDS;

import java.util.*;

public class CustomDS
{
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> hm = new HashMap<>();
    void add(int x)
    {
        if (hm.containsKey(x))
            return;
        else
        {
            int index = list.size();
            list.add(x);
            hm.put(x,index);
        }
        System.out.println("add "+list);
    }
    void remove(int x)
    {
        if (!hm.containsKey(x))
            return;
        else
        {
            int index = hm.get(x);
            System.out.println("index "+index);
            hm.remove(x);
            int last = list.get(list.size()-1);
            System.out.println("last "+last);
            Collections.swap(list,index,list.size()-1);
            list.remove(list.size()-1);
            hm.put(last,index);
        }
        System.out.println("remove "+list);
    }
    void search (int x)
    {
        if (hm.containsKey(x))
        {
            System.out.println(hm.get(x));
        }
    }
    int getRandom()
    {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
        
    }
    public static void main(String []args)
    {
        CustomDS ds = new CustomDS();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.remove(20);
        ds.add(50);
        ds.search(10);
        System.out.println(ds.getRandom());
    }
}