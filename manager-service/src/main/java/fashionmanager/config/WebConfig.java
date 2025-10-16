package fashionmanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${filepath}")
    private String uploadPath;

    @Value("${C:/uploadFiles/**}")
    private String uploadDir;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("file:///"+uploadPath);

        registry.addResourceHandler("/files/**")
                .addResourceLocations("file:///C:/uploadFiles/"); // 상위 폴더
    }
}
