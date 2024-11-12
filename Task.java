public class Task {
    private String title;
    private String description;
    private boolean isComplete;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return (isComplete ? "[Completed] " : "[Pending] ") + title + ": " + description;
    }
}