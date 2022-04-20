package com.project.logbookjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
public class JumpController {
    @Autowired
    JumpRepository repository;

    @GetMapping("/greeting/{id}")
    public ResponseEntity<Jump> getJumpByJumpNumber(@PathVariable String jumpNumber) {
        for (Jump jump : repository.findAll()) {
            if (jump.getJumpNumber() == parseInt(jumpNumber)) {
                return ResponseEntity.status(HttpStatus.OK).body(jump);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @GetMapping("/jumps")
    public ResponseEntity<List<Jump>> getJumps() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping("/jump")
    public ResponseEntity<String> addJump(@RequestBody Jump jump) {
        repository.save(jump);
        return ResponseEntity.status(HttpStatus.CREATED).body("Jump added");
    }
}
