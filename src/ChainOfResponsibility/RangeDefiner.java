package ChainOfResponsibility;

public abstract class RangeDefiner {
    protected RangeDefiner next;

    abstract protected int getRange();

    public void setNext(RangeDefiner rangeDefiner){
        this.next = rangeDefiner;
    }

    public void process(int i){
        if(i < this.getRange()){
            System.out.println("the class which is taking responsibility is LessThan"+this.getRange());
        }else if(next != null){
            next.process(i);
        }else if(next == null){
            System.out.println("we don't do that here!");
        }
    }
}
