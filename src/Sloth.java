import java.util.ArrayList;
public class Sloth extends Critter /* Your code goes here */
{
    /* Your code goes here */

    public Sloth()
    {
        super();
    }

    public void act(){
        ArrayList<String> history = new ArrayList<String>();
        history = super.getHistory();
        if ((history.size()==0) || (history.get(history.size()-1).equals("sleep")) ){
            super.addHistory("eat");
        }
        else{
            super.addHistory("sleep");
        }
    }
    /* Your code goes here */
}