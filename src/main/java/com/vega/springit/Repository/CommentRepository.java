package com.vega.springit.Repository;

import com.vega.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {

}
