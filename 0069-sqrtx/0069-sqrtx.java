class Solution {
    public int mySqrt(int x) {

   long START = 0, END = x;
    while (START <= END) {
        long MID = START + (END - START) / 2;

      if (MID * MID == x) {
        return (int) MID;
      } else if (MID * MID < x) {
        START = MID + 1;
      } else {
        
        END = MID - 1;
      }
    }
    return (int) START - 1;
}
}