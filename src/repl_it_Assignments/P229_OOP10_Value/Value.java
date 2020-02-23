package repl_it_Assignments.P229_OOP10_Value;

public class Value {

   int value;
   boolean result = false;

    public Value(){

    }

    public Value(int value){
    this.value=value;
    }

    public void setVal( int value){
        this.value = value;
        result=true;
    }
    public boolean wasModified (){
      return result;
    }

    public int getValue(){
        return value;
    }

}
