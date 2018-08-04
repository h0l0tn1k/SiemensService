package cz.siemens.inventory.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@Table(name = "revision")
public class ApplianceRevision implements Serializable {

	private static final long serialVersionUID = 2448457913612961446L;

	@Id
	@GeneratedValue(generator = "revisionGenerator")
	@GenericGenerator(name = "revisionGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "deviceRevision"))
	private long id;
	
	@Column(name = "rev_interval")
	private byte interval;
	
	@Column(name = "last_revision")
	private LocalDate lastRevision;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Device deviceRevision;
}