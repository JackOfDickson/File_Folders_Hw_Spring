package com.example.files_folders.repository;

import com.example.files_folders.models.ComputerFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerFileRepository extends JpaRepository<ComputerFile, Long> {
}
