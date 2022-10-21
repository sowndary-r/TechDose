class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = speed.length;
        Map<Integer,Double> map = new TreeMap<>();
        Stack<Double> stk=new Stack<>();
        for(int i=0;i<n;i++){
        map.put(position[i],((double)(target - position[i])/speed[i]));
        }
        Arrays.sort(position);
        stk.push(map.get(position[n-1]));
        for(int i=n-2;i>=0;i--){
          if(map.get(position[i])>stk.peek()){
             stk.push(map.get(position[i]));
            }
        }
        return stk.size();
    }
}
