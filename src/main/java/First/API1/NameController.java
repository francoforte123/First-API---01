package First.API1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName(){
        return "Emmanuele La Duca";
    }

    @PostMapping
    public String postName(){
        StringBuilder name= new StringBuilder("Emmanuele La Duca");
        return name.reverse().toString();
    }
}
