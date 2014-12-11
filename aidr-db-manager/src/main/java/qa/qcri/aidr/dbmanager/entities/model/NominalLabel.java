// default package
// Generated Nov 24, 2014 4:55:08 PM by Hibernate Tools 4.0.0
package qa.qcri.aidr.dbmanager.entities.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Hibernate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import qa.qcri.aidr.dbmanager.entities.task.DocumentNominalLabel;

/**
 * NominalLabel generated by hbm2java
 */
@Entity
@Table(name = "nominal_label", catalog = "aidr_predict")
public class NominalLabel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8467620180557868662L;
	private Long nominalLabelId;
	private NominalAttribute nominalAttribute;
	private String nominalLabelCode;
	private String name;
	private String description;
	private Integer sequence;
	private List<ModelNominalLabel> modelNominalLabels = null;
	private List<NominalAttributeDependentLabel> nominalAttributeDependentLabels = null;
	private List<DocumentNominalLabel> documentNominalLabels = null;

	public NominalLabel() {
	}

	public NominalLabel(NominalAttribute nominalAttribute,
			String nominalLabelCode, String name, String description,
			Integer sequence) {
		this.nominalAttribute = nominalAttribute;
		this.nominalLabelCode = nominalLabelCode;
		this.name = name;
		this.description = description;
		this.sequence = sequence;
	}

	public NominalLabel(NominalAttribute nominalAttribute,
			String nominalLabelCode, String name, String description,
			Integer sequence, List<ModelNominalLabel> modelNominalLabels,
			List<NominalAttributeDependentLabel> nominalAttributeDependentLabels, 
			List<DocumentNominalLabel> documentNominalLabels) {
		this.nominalAttribute = nominalAttribute;
		this.nominalLabelCode = nominalLabelCode;
		this.name = name;
		this.description = description;
		this.sequence = sequence;
		this.modelNominalLabels = modelNominalLabels;
		this.nominalAttributeDependentLabels = nominalAttributeDependentLabels;
		this.documentNominalLabels = documentNominalLabels;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "nominalLabelID", unique = true, nullable = false)
	public Long getNominalLabelId() {
		return this.nominalLabelId;
	}

	public void setNominalLabelId(Long nominalLabelId) {
		this.nominalLabelId = nominalLabelId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nominalAttributeID", nullable = false)
	@JsonBackReference
	public NominalAttribute getNominalAttribute() {
		return this.nominalAttribute;
	}

	public void setNominalAttribute(NominalAttribute nominalAttribute) {
		this.nominalAttribute = nominalAttribute;
	}

	@Column(name = "nominalLabelCode", nullable = false, length = 64)
	public String getNominalLabelCode() {
		return this.nominalLabelCode;
	}

	public void setNominalLabelCode(String nominalLabelCode) {
		this.nominalLabelCode = nominalLabelCode;
	}

	@Column(name = "name", nullable = false, length = 140)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false, length = 600)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "sequence", nullable = false)
	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nominalLabel")
	@JsonManagedReference
	public List<ModelNominalLabel> getModelNominalLabels() {
		return this.modelNominalLabels;
	}

	public void setModelNominalLabels(List<ModelNominalLabel> modelNominalLabels) {
		this.modelNominalLabels = modelNominalLabels;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nominalLabel")
	@JsonManagedReference
	public List<NominalAttributeDependentLabel> getNominalAttributeDependentLabels() {
		return this.nominalAttributeDependentLabels;
	}

	public void setNominalAttributeDependentLabels(
			List<NominalAttributeDependentLabel> nominalAttributeDependentLabels) {
		this.nominalAttributeDependentLabels = nominalAttributeDependentLabels;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nominalLabel")
	@JsonManagedReference
	public List<DocumentNominalLabel> getDocumentNominalLabels() {
		return this.documentNominalLabels;
	}

	public void setDocumentNominalLabels(List<DocumentNominalLabel> documentNominalLabels) {
		this.documentNominalLabels = documentNominalLabels;
	}

	public boolean hasDocumentNominalLabels() {
		return Hibernate.isInitialized(this.documentNominalLabels);
	}
	
	public boolean hasModelNominalLabels() {
		return Hibernate.isInitialized(this.modelNominalLabels);
	}
	
	public boolean hasNominalAttributeDependentLabels() {
		return Hibernate.isInitialized(this.nominalAttributeDependentLabels);
	}
	
	public boolean hasNominalAttribute() {
		return Hibernate.isInitialized(this.nominalAttribute);
	}
}
