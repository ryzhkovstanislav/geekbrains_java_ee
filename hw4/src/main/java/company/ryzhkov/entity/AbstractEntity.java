package company.ryzhkov.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class AbstractEntity {
    private String id = UUID.randomUUID().toString();
}
