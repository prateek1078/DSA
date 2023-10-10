class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> count = new HashMap<>();
    Set<Integer> occ = new HashSet<>();

    for (final int a : arr)
      count.merge(a, 1, Integer::sum);

    for (final int value : count.values())
      if (!occ.add(value))
      {
          return false;
      }
      
    return true;
  }
}
