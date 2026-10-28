# Command Pattern

The Command pattern represents an action as an object. It separates the object
that requests an action from the object that performs it, so an invoker can run
commands without knowing the receiver's details.

## Roles in this example

- **Command — `Command`:** declares the `execute()` operation.
- **Concrete commands — `IncreaseLightCommand` and `DecreaseLightCommand`:**
  bind an action to a `Light` and implement it by calling the receiver.
- **Receiver — `Light`:** performs the actual on/off behavior and tracks its
  current state.
- **Invoker — `Switch`:** accepts commands, executes them, and records
  successfully executed commands.
- **Client — `Main`:** creates the receiver, commands, and invoker, then
  connects them.

## How the example works

1. The client creates a `Light` and wraps actions for it in command objects.
2. The client passes a command to `Switch.storeAndExecute()`.
3. The switch calls `execute()` without needing to know whether the command
   turns the light on or off.
4. After successful execution, the switch appends the command to its history.
   `getHistory()` returns an immutable snapshot, not the mutable internal list.

The commands hold their receiver in a private final field and reject a null
receiver. `Light` accepts only `"ON"` and `"OFF"` as explicit state values.
History here is for demonstration; this example does not implement undo or
redo.

## Run and test

Run `patterns.command.Main` from the IDE to see the switch execute both
commands. Run the focused behavior tests with:

```sh
mvn -Dtest=CommandTest test
```
