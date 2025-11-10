package com.tecsup.petclinic.webs;

import com.tecsup.petclinic.entities.PetType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TypesController {

    @GetMapping("/types")
    public List<PetType> listTypes() {
        return Collections.emptyList();
    }
}
