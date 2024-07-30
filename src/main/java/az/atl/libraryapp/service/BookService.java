package az.atl.libraryapp.service;

import az.atl.libraryapp.dto.request.BookRequest;
import az.atl.libraryapp.dto.response.BookResponse;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    BookResponse createBook(BookRequest bookRequest);

    BookResponse findById(Long id);

    List<BookResponse> findAllBooks();

    void updateBook(Long id, BookRequest bookRequest);

    void deleteBook(Long id);
}
