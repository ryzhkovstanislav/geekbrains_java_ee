package company.ryzhkov.entity;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@Setter
@Getter
abstract class AbstractEntity {

    @Id
    @NotNull
    protected String id = UUID.randomUUID().toString();
}
