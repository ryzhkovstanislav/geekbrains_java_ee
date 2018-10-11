package company.ryzhkov.entity;

import lombok.Getter;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@Getter
public class AbstractEntity {

    @Nullable
    private String id = UUID.randomUUID().toString();
}
