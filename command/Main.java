package patterns.command;

/**
 * Demonstrates the Command pattern with a switch and a light.
 */
public class Main {

    /**
     * Runs the Command pattern demonstration.
     *
     * @param arguments command-line arguments (unused)
     */
    public static void main(final String[] arguments) {

        final Light lamp = new Light();

        // Concrete commands capture the receiver and its requested action.
        final Command switchUp = new IncreaseLightCommand(lamp);
        final Command switchDown = new DecreaseLightCommand(lamp);

        // The invoker executes commands without needing to know how they work.
        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);

    }

}
