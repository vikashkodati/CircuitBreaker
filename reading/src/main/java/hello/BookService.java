package hello;

import java.net.URI;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BookService {

  @HystrixCommand(fallbackMethod = "reliable")
  public String readingList() {
    RestTemplate restTemplate = new RestTemplate();
    //URI uri = URI.create("http://kodati-bookstore.apps.px-01.cf.t-mobile.com/bookstore/recommended");
    URI uri = URI.create("https://zuulproxy/bookstore/recommended");

    return restTemplate.getForObject(uri, String.class);
  }

  public String reliable() {
    return "Reliable fallback method invoked\n";
  }

}
