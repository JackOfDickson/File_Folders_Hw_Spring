package com.example.files_folders.components;

import com.example.files_folders.models.ComputerFile;
import com.example.files_folders.models.Folder;
import com.example.files_folders.models.User;
import com.example.files_folders.repository.ComputerFileRepository;
import com.example.files_folders.repository.FolderRepository;
import com.example.files_folders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    ComputerFileRepository computerFileRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        User user = new User("Steve");
        userRepository.save(user);

        Folder folder = new Folder("Homework", user);
        folderRepository.save(folder);

        ComputerFile file = new ComputerFile("Frog", "Mp4", 10000, folder);
        computerFileRepository.save(file);
    }
}
