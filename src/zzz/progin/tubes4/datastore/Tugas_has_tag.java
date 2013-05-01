package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Tugas_has_tag {

	@Persistent
	private Long tugas_idTugas;
	
	@Persistent
	private Long tag_idTag;
	
	public Tugas_has_tag(Long idTugas, Long idTag){
		this.setTag_idTag(idTag);
		this.setTugas_idTugas(idTugas);
	}

	public Long getTugas_idTugas() {
		return tugas_idTugas;
	}

	public void setTugas_idTugas(Long tugas_idTugas) {
		this.tugas_idTugas = tugas_idTugas;
	}

	public Long getTag_idTag() {
		return tag_idTag;
	}

	public void setTag_idTag(Long tag_idTag) {
		this.tag_idTag = tag_idTag;
	}
}
