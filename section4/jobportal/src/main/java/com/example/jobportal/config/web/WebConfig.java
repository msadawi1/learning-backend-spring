package com.example.jobportal.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        // configure versioning strategy to MIME with versions 1.0 - 3.0
        configurer
                .useMediaTypeParameter(
                        MediaType.parseMediaType("application/vnd.jobportal+json"), "v"
                )
                .addSupportedVersions("1.0", "2.0", "3.0")
                .setDefaultVersion("1.0");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        // set global API prefix  to /jobportal/api
        configurer.addPathPrefix("/jobportal/api", _ -> true);
    }
}
