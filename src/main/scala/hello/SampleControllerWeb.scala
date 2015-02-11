package hello

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@EnableAutoConfiguration
object SampleControllerWeb {
 def main(args: Array[String]) {
    SpringApplication.run(classOf[SampleController]);
 }
}