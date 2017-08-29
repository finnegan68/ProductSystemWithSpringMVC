package ua.com.train.myapp.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInit extends  AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        // All other configuration classes goes here
        return new Class[]{ModelConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Web MVC configuration goes here
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
