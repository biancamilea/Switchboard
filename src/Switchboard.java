import java.util.List;

public class Switchboard {
    private List<Call> calls;

    public Switchboard(List<Call> calls) {
        this.calls = calls;
    }

    public List<Call> getCalls() {
        return calls;
    }

    private void print(){
        for (Call call : calls) {
            System.out.println(call.toString());
        }
    }

    public void getReportOfCalls(){
        double cost = 0;
        int totalNumberOfCalls = 0;

        for (Call call : calls) {
            cost += call.getCost();
            totalNumberOfCalls++;
        }
        System.out.println("Total number of calls: " + totalNumberOfCalls + " and the total turnover is: " +  cost + " cents.");
    }
}
