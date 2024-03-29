package pwr.ite.bedrylo.dataModule.model.data;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private UUID uuid;

    public void generateUuid() {
        this.uuid = UUID.randomUUID();
    }
}
