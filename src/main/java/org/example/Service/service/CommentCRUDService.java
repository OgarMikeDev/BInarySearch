package org.example.Service.service;

import org.example.Service.dto.CommentDTO;

import javax.xml.stream.events.Comment;
import java.util.Collection;

public class CommentCRUDService implements CRUDService<CommentDTO> {
    @Override
    public CommentDTO getById(Integer id) {
        return null;
    }

    @Override
    public Collection getAll() {
        return null;
    }

    @Override
    public void create(CommentDTO item) {

    }

    @Override
    public void update(Integer id, CommentDTO item) {

    }

    @Override
    public void delete(Integer id) {

    }
}
