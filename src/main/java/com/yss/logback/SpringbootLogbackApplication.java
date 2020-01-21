package com.yss.logback;



import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class SpringbootLogbackApplication {


//    private final static Logger logger = LoggerFactory.getLogger(SpringbootLogbackApplication.class);

    public static void main(String[] args) {
    /*    new Thread(()->{
            for (int i=0;i<100;i++){
                log.error("---test zhongxuxing666666666---"+i);

            }
        }).start();*/
        SpringApplication.run(SpringbootLogbackApplication.class, args);
    }


}
