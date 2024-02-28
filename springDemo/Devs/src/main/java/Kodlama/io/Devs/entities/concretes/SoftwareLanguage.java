package Kodlama.io.Devs.entities.concretes;

public class SoftwareLanguage {
	private int id;
	private String name;
	private String level;
	
	public SoftwareLanguage() {

	}

	public SoftwareLanguage(int id, String name, String level) {
		this.id = id;
		this.name = name;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
