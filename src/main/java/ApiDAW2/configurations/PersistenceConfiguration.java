package ApiDAW2.configurations;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean // Inyeccion de dependencias
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource") // application.properties
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
