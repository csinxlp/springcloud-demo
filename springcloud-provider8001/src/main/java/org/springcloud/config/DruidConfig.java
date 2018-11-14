package org.springcloud.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
@Configuration //指定当前是配置类
public class DruidConfig {
	@Bean   //把bean加载到ioc容器中  bean的id 是方法名
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid(){
         return  new DruidDataSource();
    }
    
    //配置Druid的监控
   //1、配置一个管理后台的Servlet
   @Bean
   public ServletRegistrationBean statViewServlet(){
       ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
       Map<String,String> initParams = new HashMap<>();
       initParams.put("loginUsername","admin"); //设置druid登录
       initParams.put("loginPassword","123456");//设置druid 密码
       initParams.put("allow","");//默认就是允许所有访问
       initParams.put("deny","");
       bean.setInitParameters(initParams);
       return bean;
   }
  
  
 //2、配置一个web监控的filter
   @Bean
   public FilterRegistrationBean webStatFilter(){
       FilterRegistrationBean bean = new FilterRegistrationBean();
       bean.setFilter(new WebStatFilter());
       Map<String,String> initParams = new HashMap<>();
       initParams.put("exclusions","*.js,*.css,/druid/*");//配置拦截过滤规则
       bean.setInitParameters(initParams);
       bean.setUrlPatterns(Arrays.asList("/*"));
       return  bean;
   }
}
