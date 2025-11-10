package com.tecsup.petclinic.webs;

import com.tecsup.petclinic.entities.Owner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class OwnerController {

    @GetMapping("/owners")
    public List<Owner> listOwners() {
        return Collections.emptyList();
    }
}
