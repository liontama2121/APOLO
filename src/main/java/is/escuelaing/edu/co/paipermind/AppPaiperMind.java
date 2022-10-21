package is.escuelaing.edu.co.paipermind;

import org.postgresql.util.PSQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages={"is.escuelaing.edu.co.paipermind"})
public class AppPaiperMind {
    public static void main(String[] args) throws PSQLException {
        try {
            SpringApplication.run(AppPaiperMind.class, args);
        }catch (Exception e){
            System.out.println(e);
        }
    }


}
