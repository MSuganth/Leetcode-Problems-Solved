class Solution {
    public double minimumAverage(int[] nums) {
          List<Double> res = new ArrayList<>();
          List<Integer> num = new ArrayList<>();
          for(int i:nums) num.add(i);
          while(num.size() != 0){
             double min = num.get(0);
             double max = num.get(0);
             for(int j:num){
                if(j < min) min = j;
                if(j > max) max = j;
             }
             double t = (min+max)/2;
             res.add(t);
             num.remove(Integer.valueOf((int)min));
             num.remove(Integer.valueOf((int)max));
          }
          double mini = res.get(0);
          for(double i:res) if(i<mini) mini = i;
          return mini;
    }
}