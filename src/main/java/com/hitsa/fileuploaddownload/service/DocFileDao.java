package com.hitsa.fileuploaddownload.service;

import com.hitsa.fileuploaddownload.dto.FileDocument;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author - Hitendra Singh Shekhawat (https://www.github.com/Hitsaa)
 */

@Repository
public interface DocFileDao extends CrudRepository<FileDocument, Long> {

    FileDocument findByFileName(String fileName);
}
