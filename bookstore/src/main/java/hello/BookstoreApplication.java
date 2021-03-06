package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class BookstoreApplication {

  @RequestMapping(value = "/bookstore/recommended")
  public String readingList(){
      return "Bookstore backend service is up and invoked successfully";
  }

  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
  }
}
