package com.tecsup.petclinic.webs;

import com.tecsup.petclinic.entities.Visit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class VisitController {

    @GetMapping("/visits")
    public List<Visit> listVisits() {
        return Collections.emptyList();
    }
}
