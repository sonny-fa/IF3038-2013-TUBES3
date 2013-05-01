package zzz.progin.tubes4.datastore;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Tugas_has_tag {

	@Persistent
	private int tugas_idTugas;
	
	@Persistent
	private int tag_idTag;
	
	public Tugas_has_tag(int idTugas, int idTag){
		this.setTag_idTag(idTag);
		this.setTugas_idTugas(idTugas);
	}

	public int getTugas_idTugas() {
		return tugas_idTugas;
	}

	public void setTugas_idTugas(int tugas_idTugas) {
		this.tugas_idTugas = tugas_idTugas;
	}

	public int getTag_idTag() {
		return tag_idTag;
	}

	public void setTag_idTag(int tag_idTag) {
		this.tag_idTag = tag_idTag;
	}
}
