package az.atl.libraryapp.service.impl;

import az.atl.libraryapp.dao.repository.AuthorRepository;
import az.atl.libraryapp.dto.request.AuthorRequest;
import az.atl.libraryapp.dto.response.AuthorResponse;
import az.atl.libraryapp.service.AuthorService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    @Transactional
    public AuthorResponse createAuthor(AuthorRequest authorRequest) {
        log.info("test");
        return null;
    }

    @Override
    public AuthorResponse findById(Long id) {
        return null;
    }

    @Override
    public List<AuthorResponse> findAllAuthors() {
        return null;
    }

    @Override
    public void updateAuthor(Long id, AuthorRequest authorRequest) {

    }

    @Override
    public void deleteAuthor(Long id) {

    }
}
