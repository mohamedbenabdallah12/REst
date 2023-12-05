package org.example.banque.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Entity
@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter

public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    /* @OneToMany (mappedBy = "client")
    private Collection<Compte> comptes ;
     */
}
