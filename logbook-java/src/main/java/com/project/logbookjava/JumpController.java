package com.project.logbookjava;

import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@CrossOrigin
@RestController
public class JumpController {

    Jump jump1 = new Jump(1,"April","Cark","Angle",14,45);
    Jump jump2 = new Jump(2,"April","Hinton","belly",12,55);


    public ArrayList<Jump> jumps = new ArrayList<>();{
        jumps.add(jump1);
        jumps.add(jump2);
    }


    @GetMapping("/jumps")
    public ArrayList<Jump> getJumps(){
        return jumps;
    }

    @GetMapping("/test")
    public String test(){
        return "working";
    }


//    @Autowired(required = false)
//    JumpRepository repository;
//    TODO: May need to remove (required = false) later
//
//    @GetMapping("/jump/{jumpNumber}")
//    public ResponseEntity<Jump> getJumpByJumpNumber(@PathVariable String jumpNumber) {
//        for (Jump jump : repository.findAll()) {
//            if (jump.getJumpNumber() == parseInt(jumpNumber)) {
//                return ResponseEntity.status(HttpStatus.OK).body(jump);
//            }
//        }
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//    }
//
//    @GetMapping("/jumps")
//    public ResponseEntity<List<Jump>> getJumps() {
//        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
//    }
//
//    @PostMapping("/jump")
//    public ResponseEntity<String> addJump(@RequestBody Jump jump) {
//        repository.save(jump);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Jump added");
//    }
}
