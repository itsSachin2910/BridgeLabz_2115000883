import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class SampleClass {
}

public class AnnotationRetriever {
    public static void main(String[] args) {
        Class<SampleClass> clazz = SampleClass.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}

