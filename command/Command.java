package patterns.command;

/**
 * Represents an action that an invoker can execute without knowing its details.
 */
public interface Command {
    /**
     * Performs the action represented by this command.
     */
    void execute();
}
