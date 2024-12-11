package com.pradeep.joblisting.repository;

import com.pradeep.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
