package company.ryzhkov.entity;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
class AbstractEntity {

    @Id
    @NotNull
    private String id = UUID.randomUUID().toString();
}
