package backend;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/info")
@RequiredArgsConstructor
public class InfoController {

    @GetMapping(path = "/hello")
    public String getInfo(){
        return "Hello World";
    }
}
