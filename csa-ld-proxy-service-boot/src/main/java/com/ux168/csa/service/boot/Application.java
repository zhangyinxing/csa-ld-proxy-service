package com.ux168.csa.service.boot;

import com.ux168.starter.commons.boot.AbstractBoot;
import com.ux168.starter.commons.boot.BaseBootApplication;
import com.ux168.starter.commons.boot.SystemConfigLoader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description 启动类
 *
 * @author zhangyinxing
 * @since 2024/5/10
 **/
@SpringBootApplication
@EnableDiscoveryClient
// 配置bean扫描关键
@ComponentScan({"com.ux168"})
public class Application extends BaseBootApplication {
	public static void main(String[] args) throws Exception {
		new AbstractBoot(Application.class , args) {
			@Override
			public void execute() {
				SystemConfigLoader.doLoad();
			}
		}.run();
	}
}
