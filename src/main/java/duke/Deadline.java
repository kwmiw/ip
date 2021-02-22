package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends duke.Command {

    public LocalDate dueDate;
    private String formattedDate;

    public Deadline(String commandDescription, LocalDate dueDate) {
        super(commandDescription);
        this.isDone = false;
        this.dueDate = dueDate;

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy");
        this.formattedDate = this.dueDate.format(format);
    }

    public LocalDate getTime() {
        return this.dueDate;
    }

    @Override
    public String toString() {
        return "[D] " + super.toString() + " | by: " + formattedDate;
    }
}
