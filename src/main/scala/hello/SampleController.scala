package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.stereotype.Controller; 
 
@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
class SampleController {

@RequestMapping(Array("/"))
@ResponseBody
def home(): String = "Hello World!"

}