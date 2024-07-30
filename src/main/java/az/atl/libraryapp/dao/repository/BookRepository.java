package az.atl.libraryapp.dao.repository;

import az.atl.libraryapp.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
