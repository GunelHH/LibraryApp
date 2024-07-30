package az.atl.libraryapp.mapper;

import az.atl.libraryapp.dto.response.AuthorResponse;
import az.atl.libraryapp.dto.response.BookResponse;
import az.atl.libraryapp.entity.AuthorEntity;
import az.atl.libraryapp.entity.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    BookEntity toEntity(BookResponse bookResponse);

    BookResponse toDto(BookEntity bookEntity);
}
