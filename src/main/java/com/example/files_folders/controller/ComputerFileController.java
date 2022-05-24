package com.example.files_folders.controller;

import com.example.files_folders.models.ComputerFile;
import com.example.files_folders.repository.ComputerFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerFileController {
    @Autowired
    ComputerFileRepository fileRepository;

    @GetMapping(value = "/computer_files")
    public ResponseEntity<List<ComputerFile>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/computer_files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/computer_files")
    public ResponseEntity<ComputerFile> postFile(@RequestBody ComputerFile file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

}
