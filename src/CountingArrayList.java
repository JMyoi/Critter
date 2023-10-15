import java.util.ArrayList;

public class CountingArrayList extends ArrayList<String>
{
    private int getCount;
    private int setCount;
    //constructor
    CountingArrayList(){
        super();
        getCount = 0;
        setCount = 0;
    }

    @Override
    public String get(int index){
        getCount++;
        return super.get(index);
    }
    @Override
    public String set(int index, String element){
        setCount++;
        return super.set(index, element);
    }
    /**
     Gets the counter of get or set operations.
     @param what "get" or "set"
     @return the number of get or set operations invoked on this array list.
     */
    public int count(String what){
        if(what.equals("set")){
            return setCount;
        }
        else if(what.equals("get")){
            return getCount;
        }
        return 0;
    }
}