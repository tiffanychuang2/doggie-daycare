package doggiedaycare;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Daycare {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageUrl;
	
	protected Daycare() {
		
	}
	
	public Daycare(String name, String imageUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
