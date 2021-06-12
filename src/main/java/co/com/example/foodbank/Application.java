package co.com.example.foodbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import co.com.foodbank.vault.sdk.config.EnableVaultSDK;

@SpringBootApplication
@EnableVaultSDK
@ComponentScan(basePackages = "co.com.example.foodbank")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
