/**
 * Represents a task.
 * @author Rodriguez
 */
public class Task {
    private String releaseID;
    private String springID;
    private String name;
    private String description;
    private Person assignee;
    private Status status;
    private Priority priority;

    public Task(String releaseID, String springID, String name, String description, Person assignee, Status status, Priority priority) {
        this.releaseID = releaseID;
        this.springID = springID;
        this.name = name;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }

    public String getReleaseID() {
        return releaseID;
    }

    public String getSpringID() {
        return springID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Person getAssignee() {
        return assignee;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }
}