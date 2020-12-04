package com.franktran.springdata.springdatasource.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author frank.tran
 */
public class MysqlDatasource {

    private final DataSource dataSource;

    @Autowired
    public MysqlDatasource(@Qualifier("mySqlDriverManagerDataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
