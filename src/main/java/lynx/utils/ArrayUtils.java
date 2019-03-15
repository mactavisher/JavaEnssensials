package lynx.utils;

/**
 *  array utils
 * @author Lynx
 */
public class ArrayUtils<T> {
  private T[] inArray;

  public ArrayUtils(){}   //keep default constructor

  public ArrayUtils(T[] inArray)
  {
    this.inArray = inArray;
  }

  public String arrayToString(){
    StringBuffer tempString = new StringBuffer();
    for(int i =0;i<inArray.length;i++)
    {
      tempString.append(inArray[i].toString());
    }
    return tempString.toString();
  }

  /**
   * convert a int array to String;
   * @param inArray
   * @return String
   */
  public String simpleIntArraytoString(int[] inArray){
    StringBuffer tempString = new StringBuffer("{");
    for(int i =0;i<inArray.length;i++)
    {
      tempString.append(+inArray[i]+",");
      if(i==inArray.length-1)
      {
        tempString.append(+inArray[i]+"}");
      }
    }
    return tempString.toString();
  }

}
