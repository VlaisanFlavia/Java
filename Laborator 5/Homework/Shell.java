package org.example;

import java.util.Scanner;

/**
 * The Shell class represents an interactive shell for executing commands.
 */
public class Shell {
    /** The document repository used by the shell. */
    private final DocumentRepository repository;

    /**
     * Constructs a new Shell with the specified document repository.
     *
     * @param repository the document repository used by the shell.
     */
    public Shell(DocumentRepository repository) {
        this.repository = repository;
    }

    /**
     * Starts the interactive shell.
     * The user can enter commands, and the shell will execute them accordingly.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            String[] parts = input.split("\\s+", 2);
            String commandName = parts[0].toLowerCase();
            String arguments = parts.length > 1 ? parts[1] : "";

            try {
                Command command = createCommand(commandName, arguments);
                command.execute();
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid command: " + commandName);
            } catch (Exception e) {
                System.out.println("Error executing command: " + e.getMessage());
            }
        }
    }

    /**
     * Creates a command instance based on the given command name and arguments.
     *
     * @param commandName the name of the command.
     * @param arguments   the arguments for the command.
     * @return a command instance corresponding to the given command name and arguments.
     * @throws IllegalArgumentException if the command name is unknown or the arguments are invalid.
     */
    private Command createCommand(String commandName, String arguments) {
        switch (commandName) {
            case "view":
                return new ViewCommand(arguments);
            case "report":
                return new ReportCommand(repository);
            case "export":
                String[] exportArgs = arguments.split("\\s+", 2);
                if (exportArgs.length != 2) {
                    throw new IllegalArgumentException("Invalid arguments for export command");
                }
                return new ExportCommand(repository, exportArgs[1]);
            default:
                throw new IllegalArgumentException("Unknown command: " + commandName);
        }
    }
}
