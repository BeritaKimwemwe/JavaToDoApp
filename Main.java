import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark task as complete");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(title, description);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the task number to mark as complete: ");
                    int completeTaskNumber = scanner.nextInt() - 1;
                    toDoList.markTaskComplete(completeTaskNumber);
                    break;
                case 4:
                    System.out.print("Enter the task number to delete: ");
                    int deleteTaskNumber = scanner.nextInt() - 1;
                    toDoList.deleteTask(deleteTaskNumber);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}