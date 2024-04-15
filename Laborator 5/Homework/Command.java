package org.example;

/**
 * The Command interface represents a generic command that can be executed.
 * Implementations of this interface should provide functionality
 * for executing specific tasks when method is called.
 */
interface Command {

    /**
     * Executes the command.
     *
     * @throws Exception if an error occurs during command execution.
     */
    void execute() throws Exception;
}
