package patterns.command;

import java.util.Objects;

/**
 * Concrete command that turns its receiver light off.
 */
public class DecreaseLightCommand implements Command {
    private final Light theLight;

    /**
     * Creates a command for the given light.
     *
     * @param light receiver to turn off
     * @throws NullPointerException if {@code light} is {@code null}
     */
    public DecreaseLightCommand(final Light light) {
        this.theLight = Objects.requireNonNull(light, "light must not be null");
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
