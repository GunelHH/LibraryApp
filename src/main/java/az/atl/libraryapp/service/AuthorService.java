package az.atl.libraryapp.service;

import az.atl.libraryapp.dto.request.AuthorRequest;
import az.atl.libraryapp.dto.request.BookRequest;
import az.atl.libraryapp.dto.response.AuthorResponse;
import az.atl.libraryapp.dto.response.BookResponse;

import java.util.List;

public interface AuthorService {
    AuthorResponse createAuthor(AuthorRequest authorRequest);

    AuthorResponse findById(Long id);

    List<AuthorResponse> findAllAuthors();

    void updateAuthor(Long id, AuthorRequest authorRequest);

    void deleteAuthor(Long id);
}
