package pwr.ite.bedrylo.dataModule.model.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pwr.ite.bedrylo.dataModule.model.data.enums.Role;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "User.FindByPort", query = "select u from User u where u.port = :port"),
        @NamedQuery(name = "User.FindByHost", query = "select u from User u where u.host = :host"),
        @NamedQuery(name = "User.FindByHostAndPort", query = "select u from User u where u.host = :host and u.port = :port"),
        @NamedQuery(name = "User.FindByRole", query = "select u from User u where u.role = :role"),
        @NamedQuery(name = "User.FindByBusy", query = "select u from User u where u.busy = :busy"),
        @NamedQuery(name = "User.Delete", query = "delete from User u where u.uuid = :uuid"),
        @NamedQuery(name = "User.UpdateBusyByUuid", query = "update User u set u.busy = :busy where u.uuid = :uuid", lockMode = LockModeType.PESSIMISTIC_READ),
        @NamedQuery(name = "User.FindByUuid", query = "select u from User u where u.uuid = :uuid"),
        @NamedQuery(name = "User.UpdateHostAndPortByUuid", query = "update User u set u.host = :host, u.port = :port where u.uuid = :uuid")
})
public class User extends BaseEntity {


    @Column(name = "port", nullable = false)
    private int port;

    @Column(name = "host", nullable = false)
    private String host;

    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "busy", nullable = false)
    private boolean busy;

    @OneToMany(orphanRemoval = true, fetch = FetchType.EAGER, mappedBy = "userUuid")
    private Set<Receipt> receipts;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("uuid: ").append(getUuid()).append(", host:").append(getHost()).append(", port:").append(getPort()).append(", role:").append(getRole().toString()).append(", busy:").append(isBusy()).append(" ").append(getReceipts());
        return stringBuilder.toString();
    }

}
