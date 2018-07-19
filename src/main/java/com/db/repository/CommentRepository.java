package com.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
