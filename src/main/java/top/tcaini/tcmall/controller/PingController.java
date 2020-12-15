package top.tcaini.tcmall.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class PingController {

    @GetMapping("/ping")
    public String ping(HttpServletRequest request){
        log.info("send ping req from: {}", request.getRemoteAddr());
        return "pong";
    }
}
