package az.atl.libraryapp.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookResponse {
    @NotNull
    Long id;
    @NotBlank
    String name;
    @NotNull
    Integer count;
}
