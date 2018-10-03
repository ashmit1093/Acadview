class Sub_string
{
  public static void main(String[] args)
  {
    String str = "xyz";
    
    int len =str.length();

    for(int i=0;i<len;i++)
    {
      System.out.println(str.substring(0,len));
    }
  }
}