package externalclasses;

import org.springframework.stereotype.Component;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC");
    }
}
