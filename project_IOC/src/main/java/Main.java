import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }

}
