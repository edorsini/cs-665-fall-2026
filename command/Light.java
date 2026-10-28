package patterns.command;

import java.util.Objects;

/**
 * Receiver that performs the light's on and off operations.
 */
public class Light {

    private String lightLevel;

    /**
     * Creates a light that is initially off.
     */
    public Light() {
        this.lightLevel = "OFF";
    }

    /**
     * Turns this light on.
     */
    public void turnOn() {
        System.out.println("The light is on");
        this.lightLevel = "ON";
    }

    /**
     * Turns this light off.
     */
    public void turnOff() {
        System.out.println("The light is off");
        this.lightLevel = "OFF";
    }

    /**
     * Returns the current light state.
     *
     * @return {@code "ON"} or {@code "OFF"}
     */
    public String getLightLevel() {
        return this.lightLevel;
    }

    /**
     * Sets the light state.
     *
     * @param lightLevel the desired state, either {@code "ON"} or {@code "OFF"}
     * @throws IllegalArgumentException if the state is not supported
     */
    public void setLightLevel(String lightLevel) {
        String requestedLevel = Objects.requireNonNull(lightLevel, "lightLevel must not be null");
        if (!"ON".equals(requestedLevel) && !"OFF".equals(requestedLevel)) {
            throw new IllegalArgumentException("lightLevel must be ON or OFF");
        }
        this.lightLevel = requestedLevel;
    }
}
