package springbootJPA.learnJPA.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springbootJPA.learnJPA.entity.Course;

import jakarta.servlet.annotation.WebServlet;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable);
}
