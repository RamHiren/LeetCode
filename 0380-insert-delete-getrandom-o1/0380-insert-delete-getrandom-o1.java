import java.util.*;
class RandomizedSet {

        ArrayList<Integer> l;
    public RandomizedSet() {
        l = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!l.contains(val)){
            l.add(val);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(l.contains(val)){
            l.remove(Integer.valueOf(val));
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int x =l.size();
        int randomInt = (int)(Math.random() * x);

        return l.get(randomInt);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */