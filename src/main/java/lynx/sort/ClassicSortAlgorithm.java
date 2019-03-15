package lynx.sort;
import lynx.utils.ArrayUtils;

/**
 * collection of some classic sort algorithm
 *
 * @author lynx
 */
public class ClassicSortAlgorithm {
  public static void main(String[] args) {
    int[] arrayToSort = new int[]{15, 3, 98, 8, 78, 45, 85, 12, 45, 21, 87, 66, 22, 14, 7558};
    int[] sortedArray = SortAlgorithm.bubbleSort(arrayToSort);
  }
}

/**
 * sort method class
 *
 * @author lynx
 */
class SortAlgorithm {

  private static ArrayUtils arrayUtils = new ArrayUtils();

  /**
   * bubbleSort
   * <p>
   * give a array like {12,3,2,11,6}
   * each time after sort,the most small number will be selected
   * first sort progress should be  {3,12,2,11,6}->{2,12,3,11,6}->{2,12,3,11,6}->{2,12,3,11,6}
   * second sort progress should be {2,3,12,11,6}->{2,3,12,11,6}->{2,3,12,11,6}
   * third sort progress should be  {2,3,11,12,6}->{2,3,6,12,11}
   * fourth sort progress should be {2,3,6,11,12} and sort finished , now the array is sort by ASC;
   *
   * @param inArray int[]
   * @return outArray int[]
   */
  public static int[] bubbleSort(int[] inArray) {
    System.out.println("start sorting");
    System.out.println("array before sorting: "+arrayUtils.simpleIntArraytoString(inArray));
    for (int i = 0; i < inArray.length; i++) {
      for (int j = i + 1; j < inArray.length; j++) {
        int temp = 0;
        if (inArray[i] > inArray[j]) {
          temp = inArray[i];
          inArray[i] = inArray[j];
          inArray[j] = temp;
        }
      }
      System.out.println("第"+i+"趟排序完成"+arrayUtils.simpleIntArraytoString(inArray));
    }
    System.out.println("array after sort:"+arrayUtils.simpleIntArraytoString(inArray));
    return inArray;
  }
}