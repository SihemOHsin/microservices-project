package org.ms.factureservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.ms.factureservice.model.Client;
import jakarta.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateFacture;
	@OneToMany(mappedBy = "facture")
	private Collection<FactureLigne> facturekignes;
	@Transient
	private Client client;
	private Long clientID;
}