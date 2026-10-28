package patterns.command;

import java.util.Objects;

/**
 * Concrete command that turns its receiver light on.
 */
public class IncreaseLightCommand implements Command {
    private final Light theLight;

    /**
     * Creates a command for the given light.
     *
     * @param light receiver to turn on
     * @throws NullPointerException if {@code light} is {@code null}
     */
    public IncreaseLightCommand(final Light light) {
        this.theLight = Objects.requireNonNull(light, "light must not be null");
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
