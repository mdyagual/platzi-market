package ec.com.platzi.marketpractice.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="purchasement")
public class Purchasement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchasement_id")
    private Long purchasementId;

    @Column(name="client_id")
    private Long clientId;

    private LocalDateTime date;

    @Column(name="payment_method")
    private String paymentMethod;

    private String comment;

    private Boolean status;

}
