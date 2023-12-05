package org.example.banque.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private double solde ;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type ;
    /* @ManyToOne
    private Client ;
     */
}
