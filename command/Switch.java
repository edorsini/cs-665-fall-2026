package patterns.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Invoker that executes commands and records successfully executed commands.
 */
public class Switch {

    private final List<Command> history = new ArrayList<>();

    /**
     * Executes a command and adds it to the history after successful execution.
     *
     * @param cmd command to execute
     * @throws NullPointerException if {@code cmd} is {@code null}
     */
    public void storeAndExecute(final Command cmd) {
        Command command = Objects.requireNonNull(cmd, "cmd must not be null");
        command.execute();
        this.history.add(command);
    }

    /**
     * Returns a read-only snapshot of successfully executed commands.
     *
     * @return immutable snapshot of command history
     */
    public List<Command> getHistory() {
        return Collections.unmodifiableList(new ArrayList<>(this.history));
    }
}
