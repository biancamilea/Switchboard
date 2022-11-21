import java.util.Arrays;
import java.util.List;

public class Exervise5 {
    public static void main(String[] args) {

        List<Call> calls = Arrays.asList(
                new Call("662555666", "670512545", 100, 1, 'l'),
                new Call("670512545", "662555666", 500, 2, 'l'),
                new Call("662556666", "670517545", 100, 3, 'p'),
                new Call("662555676", "670512123", 100, 2, 'p'),
                new Call("662559876", "645712123", 100, 1, 'p')
        );

        Switchboard switchboard = new Switchboard(calls);
        switchboard.getReportOfCalls();

    }
}