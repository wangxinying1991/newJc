package com.jinchi.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author：XudongHu
 * @className:WebMvcConfiguration
 * @description: SpringBoot配置文件
 * @date:14:31 2019/1/16
 * @Modifer:
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/resources/",
            "classpath:/static/"};
    //    @Value("111")
//    private String address;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //设备档案
            /*registry.addResourceHandler("/equipmentArchiveRecord/pdf/**")
                    .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS)
                    .addResourceLocations("file:" + AddressEnum.getCurrentPath(AddressEnum.EQUIPMENT_ARCHIVE_ABS_ADDRESS.getCode()));

            registry.addResourceHandler("/equipmentInstructor/pic/**")
                    .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS)
                    .addResourceLocations("file:" +AddressEnum.getCurrentPath(AddressEnum.EQUIPMENT_INSTRUCTOR_ABS_ADDRESS.getCode()));
*/
            registry.addResourceHandler("/equipmentArchiveRecord/**")
                    .addResourceLocations("/home/jcBack-end/jcJar/equipmentArchiveRecord/");

            registry.addResourceHandler("/equipmentInstructor/**")
                    .addResourceLocations("/home/jcBack-end/jcJar/equipmentInstructor/");

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        super.addResourceHandlers(registry);
    }
}
