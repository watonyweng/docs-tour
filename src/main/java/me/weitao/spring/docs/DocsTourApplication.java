package me.weitao.spring.docs;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Watony Weng
 * @date 2018年6月8日
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 */

@EnableSwagger2Doc
@SpringBootApplication
public class DocsTourApplication {

  public static void main(String[] args) {
    SpringApplication.run(DocsTourApplication.class, args);
  }
}
