package az.atl.libraryapp.service.impl;

import az.atl.libraryapp.dto.request.BookRequest;
import az.atl.libraryapp.dto.response.BookResponse;
import az.atl.libraryapp.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookResponse createBook(BookRequest bookRequest) {
        return null;
    }

    @Override
    public BookResponse findById(Long id) {
        return null;
    }

    @Override
    public List<BookResponse> findAllBooks() {
        return null;
    }

    @Override
    public void updateBook(Long id, BookRequest bookRequest) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
