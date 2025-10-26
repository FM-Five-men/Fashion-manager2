package fashionmanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${filepath}")
    private String uploadPath;

//    // yml에서 설정값 주입 — 기본값은 현재 실행 경로(user.dir)/uploadFiles/ (백엔드 프로젝트2 까지 썻던 경로)
//    @Value("${file.upload-root:${user.dir}/uploadFiles}")
//    private String uploadDir;


    private final String uploadDir = new File(
                                                System.getProperty("user.dir"),
                                                "../../Fashion-Manager-FE/public/images")
                                                .getAbsolutePath();

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("images:///"+uploadPath);

        // /files/** 요청 → 실제 파일 경로로 매핑(백엔드 프로젝트2 까지 썻던 경로)
//        registry.addResourceHandler("/files/**")
//                .addResourceLocations("file:///" + uploadDir + "/");

        registry.addResourceHandler("/images/**").addResourceLocations("file:///" + uploadDir + "/");
    }
}
