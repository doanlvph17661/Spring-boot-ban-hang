package ASSIGNMENT_JAVA5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ASSIGNMENT_JAVA5.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
