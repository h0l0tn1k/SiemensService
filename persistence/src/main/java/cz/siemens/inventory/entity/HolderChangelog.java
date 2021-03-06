package cz.siemens.inventory.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "holder_changelog")
public class HolderChangelog implements Serializable
{
	private static final long serialVersionUID = 6620547551297893250L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "date")
	@Type(type = "timestamp")
	private Timestamp changeDate;
	
	@ManyToOne
	@JoinColumn(name = "object_id", referencedColumnName = "id")
	private DeviceInternal device;

	@ManyToOne
	@JoinColumn(name = "old_holder_id", referencedColumnName = "id")
	private LoginUserScd oldHolder;

	@ManyToOne
	@JoinColumn(name = "new_holder_id", referencedColumnName = "id")
	private LoginUserScd newHolder;
	
	@Column(name = "comment")
	private String comment;
}
