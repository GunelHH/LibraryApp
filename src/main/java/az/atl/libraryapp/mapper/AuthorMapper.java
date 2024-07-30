package az.atl.libraryapp.mapper;

import az.atl.libraryapp.dto.response.AuthorResponse;
import az.atl.libraryapp.entity.AuthorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorMapper {
    AuthorEntity toEntity(AuthorResponse authorResponse);

    AuthorResponse toDto(AuthorEntity authorEntity);
}
