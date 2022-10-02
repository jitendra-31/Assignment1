package com.assignment1.oneTwoOneAssignment.repository;
import com.assignment1.oneTwoOneAssignment.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}