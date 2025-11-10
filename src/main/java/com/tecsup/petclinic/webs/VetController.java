package com.tecsup.petclinic.webs;

import com.tecsup.petclinic.entities.Vet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class VetController {

    @GetMapping("/vets")
    public List<Vet> listVets() {
        // Retorna lista vacía solo para prueba.
        return Collections.emptyList();
    }
}
