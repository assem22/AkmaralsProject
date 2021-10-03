package com.example.feedbackservice.repository;

import com.example.feedbackservice.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    Feedback findByFeedbackId(Long feedbackId);
}

