package wxflag.wxflag_44;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan(basePackages = "wxflag.wxflag_44.mapper")
public class Wxflag44Application {

    public static void main(String[] args) {
        SpringApplication.run(Wxflag44Application.class, args);
    }

}
