package change_state_meanwhile;

public class Weekend implements Activity {

    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Ralax");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
