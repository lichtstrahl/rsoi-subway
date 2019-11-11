package iv.root.subway.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {
    @RequestMapping(value = ["/"])
    fun home() :ResponseEntity<String> {
        return ResponseEntity.ok("Hello!")
    }
}