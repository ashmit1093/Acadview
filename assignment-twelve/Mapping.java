import java.util.*;
class Mapping{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Ahmit",1);
    hm.put("Akshit",2);
    hm.put("Aman",3);
    hm.put("Jayant",4);
    hm.put("Ramneek",5);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("Elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}