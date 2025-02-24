import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("User authentication logic pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Database optimization logic pending...");
    }

    @Todo(task = "Add logging functionality", assignedTo = "Charlie", priority = "LOW")
    public void addLogging() {
        System.out.println("Logging functionality pending...");
    }
}

public class TodoTracker {
    public static void main(String[] args) throws Exception {
        Method[] methods = Project.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("-----------------------------");
            }
        }
    }
}

