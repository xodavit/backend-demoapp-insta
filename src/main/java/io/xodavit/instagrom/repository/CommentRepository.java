package io.xodavit.instagrom.repository;

import io.xodavit.instagrom.entity.Comment;
import io.xodavit.instagrom.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);

    Comment findByIdAndUserId(Long componentId, Long userId);

}
