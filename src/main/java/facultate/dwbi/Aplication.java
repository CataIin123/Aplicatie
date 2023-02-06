package facultate.dwbi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplication {


    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Aplication.class, args);
    }
}
