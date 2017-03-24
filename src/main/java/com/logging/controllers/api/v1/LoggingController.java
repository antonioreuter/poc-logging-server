package com.logging.controllers.api.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 310280812 on 3/17/2017.
 */

@Slf4j
@RequestMapping(value = "/api/v1/logging")
@RestController
public class LoggingController {


    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public String logging(@RequestBody String message) throws InterruptedException{
//        Thread.sleep(60*1000);
      log.info(message);
      return message;
    }
}
