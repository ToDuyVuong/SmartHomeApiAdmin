package vn.smarthomeapiadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.smarthomeapiadmin.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findById(int id);
    List<Category> findByNameContaining(String name);
    List<Category> findByName(String name);
}