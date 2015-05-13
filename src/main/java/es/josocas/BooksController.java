package es.josocas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

/**
 * Created by jsoler on 13.05.15.
 */
@Controller
@RequestMapping("/books")
public class BooksController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> books() {
        return Collections.emptyList();
    }
}
