package com.ux168.csa.service.boot.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description mybatis配置
 *
 * @author zhangyinxing
 * @since 2024/5/10
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.ux168.csa.service.biz.dao.pgsql.**.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        return paginationInnerInterceptor;
    }


}