//package com.example.gam.controllers;
/*
import com.example.gam.entities.FileDB;
import com.example.gam.message.ResponseFile;
import com.example.gam.message.ResponseMessage;
import com.example.gam.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/apifig")
public class FileController {
    @Autowired
    private FileStorageService storageService;
    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            storageService.store(file);
            message = "Le fichier a été téléchargé avec succès : " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Impossible d'importer le fichier : " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
    @GetMapping("/files")
    public ResponseEntity<List<ResponseFile>> getListFiles() {
        List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(dbFile.getId())
                    .toUriString();
            return new ResponseFile(
                    dbFile.getName(),
                    fileDownloadUri,
                    dbFile.getType(),
                    dbFile.getData().length);
        }).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }
   @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        FileDB fileDB = storageService.getFile(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
                .body(fileDB.getData());
    }*/

  /*  @GetMapping("/files/byname/{name}")
    public List<FileDB> getFilebyName(@PathVariable String name) {
        List<FileDB> files = storageService.findByName(name);
        return  files;
    }*/
  /*
    @GetMapping("/files/by/name")
    public List<String> getFileRepertoire(){
        List<String> myfile= new ArrayList<String>();
        File folder = new File("C:\\Users\\waid\\gam\\files\\");
        if(folder.exists()){
            for (File file : folder.listFiles()) {
                myfile.addAll(Collections.singleton(file.getName()));
            }
        }
        return  myfile;

        //return storageService.getFileRepertoire();
    }
    @GetMapping("/url/bynamefile/{name}")
    public String getFilebyName(@PathVariable("name") String name) {
        System.out.println("AAAAAAAAAAAAAAAAAAAA"+name.toString());
        return  storageService.getUrlByfileName(name);
    }
    @DeleteMapping("/deletebyname/{name}")
    public void deleteFileByName(@PathVariable("name") String name) {
        storageService.supprimerfile(name);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseMessage> uploadUpdateFile(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            storageService.store(file);
            message = "Le fichier a été téléchargé avec succès : " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Impossible d'importer le fichier : " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping(value = "/test/{fileName}")
    public ResponseEntity<InputStreamResource> getTermsConditions(@PathVariable("fileName") String fileName) throws FileNotFoundException {

        String filePath = "C:\\Users\\waid\\gam\\files\\";
        File file = new File(filePath+fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "inline;filename=" +fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        System.out.println(file);
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/pdf"))
                .body(resource);
    }
}*/
