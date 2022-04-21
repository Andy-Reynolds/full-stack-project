package com.project.logbookjava;

import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.Integer.parseInt;

@CrossOrigin
@RestController
public class JumpController {

    @Autowired
    JumpRepository repository;

    @GetMapping("/jump/{jumpNumber}")
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

    @DeleteMapping("/jump/{jumpNumber}")
    public ResponseEntity<String> deleteJump(@PathVariable String jumpNumber) {
        try {
            repository.deleteById(parseInt(jumpNumber));
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Jump number " + jumpNumber + " was deleted");
        } catch (EmptyResultDataAccessException exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Jump number " + jumpNumber + " not found, can't delete!");
        }
    }







//    @Autowired
//    JumpRepository repository;
//
//    Jump jump1 = new Jump(1,"April","Cark","Angle",14,45);
//    Jump jump2 = new Jump(2,"April","Hinton","belly",12,55);
//
//
//    public ArrayList<Jump> jumps = new ArrayList<>();{
//        jumps.add(jump1);
//        jumps.add(jump2);
//    }
//
//
//    @GetMapping("/jumps")
//    public List<Jump> getJumps(){
//        return repository.findAll();
//    }
//
//    @GetMapping("/jump/{jumpNumber}")
//    public Jump getJumpById(@PathVariable String jumpNumber){
//        for (Jump jump: repository.findAll()) {
//            if (jump.getJumpNumber() == parseInt(jumpNumber)){
//                return jump;
//            }
//        }
//        return null;
//    }
//
//    @PostMapping("/jump")
//    public String addJump(@RequestBody Jump jump){
//        repository.save(jump);
//        return "Jump added";
//    }
//
//    @DeleteMapping("/jump/{jumpNumber}")
//    public String deleteJump(@PathVariable String jumpNumber){
//        for (Jump jump: repository.findAll()) {
//            if (jump.getJumpNumber() == parseInt(jumpNumber)){
//                repository.delete(jump);
//                return "Jump number " + jumpNumber + " was deleted";
//            }
//        }
//        return "Jump number " + jumpNumber + " not found, can't delete";
//    }
//
//    @GetMapping("/test")
//    public String test(){
//        return "working";
//    }

//    @GetMapping("/jumps")
//    public ArrayList<Jump> getJumps(){
//        return jumps;
//    }
//
//    @GetMapping("/jump/{jumpNumber}")
//    public Jump getJumpById(@PathVariable String jumpNumber){
//        for (Jump jump: jumps) {
//            if (jump.getJumpNumber() == parseInt(jumpNumber)){
//                return jump;
//            }
//        }
//        return null;
//    }
//
//    @PostMapping("/jump")
//    public String addJump(@RequestBody Jump jump){
//        jumps.add(jump);
//        return "Jump added";
//    }
//
//    @DeleteMapping("/jump/{jumpNumber}")
//    public String deleteJump(@PathVariable String jumpNumber){
//        boolean isDeleted = jumps.removeIf(jump -> jump.getJumpNumber() == parseInt(jumpNumber));
//        if (isDeleted) {
//            return "Jump number " + jumpNumber + " was deleted";
//        }
//        return "Jump number " + jumpNumber + " not found, can't delete";
//    }


}
