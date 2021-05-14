package com.hitsa.fileuploaddownload.service;

import com.hitsa.fileuploaddownload.dto.FileDocument;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */

@Repository
public interface DocFileDao extends CrudRepository<FileDocument, Long> {

    FileDocument findByFileName(String fileName);
}
