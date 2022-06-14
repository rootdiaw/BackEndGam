/*package com.example.gam.services;


import com.example.gam.entities.FileDB;
import com.example.gam.repository.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    FileDBRepository fileDBRepository;

    @Autowired
    public FileStorageService(FileDBRepository fileDBRepository) {
        this.fileDBRepository = fileDBRepository;
    }

    public FileDB store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        System.out.println(FileDB.getData());
        Files.write(Paths.get(System.getProperty("user.home")+"/gam/files/"+fileName),file.getBytes());
        return fileDBRepository.save(FileDB);
    }
    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public List<String> getFileRepertoire(){
        List<String> myfile= new ArrayList<String>();
        File folder = new File("C:\\Users\\waid\\gam\\files\\");
        if(folder.exists()){
            for (File file : folder.listFiles()) {
                myfile.addAll(Collections.singleton(file.getName()));
            }
        }
        return  myfile;
    }


    public List<FileDB> findByName(String name) {
        return fileDBRepository.findByNameContains(name);
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }

    public  String getUrlByfileName(String namefile){
        File name=new File(("user.home")+"/gam/files/"+namefile);
        return  name.getAbsolutePath();
    }
    public  void deleteFileDB(FileDB file){
        fileDBRepository.delete(file);
    }
    public void supprimerfile(String name){
        fileDBRepository.supprimerFileByName(name);
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home")+"/gam/files/"+name);
        try {
            Files.deleteIfExists(path);
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public FileDB update(MultipartFile file) throws IOException{
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        System.out.println(FileDB.getData());
        Files.write(Paths.get(System.getProperty("user.home")+"/gam/files/"+fileName),file.getBytes());
        return fileDBRepository.save(FileDB);

    }
}
*/