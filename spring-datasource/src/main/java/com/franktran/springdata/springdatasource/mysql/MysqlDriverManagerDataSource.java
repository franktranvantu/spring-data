package com.franktran.springdata.springdatasource.mysql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author frank.tran
 */
@Configuration
public class MysqlDriverManagerDataSource {

    @Bean
    public DataSource mySqlDriverManagerDataSource() {
        return new DriverManagerDataSource("jdbc:mysql://localhost:3306/sql_store", "", "");
    }
}
