package com.adominguez.coderocksblog.repository;

import com.adominguez.coderocksblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
