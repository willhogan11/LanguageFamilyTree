package ie.gmit.sw;

public class Language {

	private String language;
	
	public Language(String language) {
		super();
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String toString() {
		return "Language [language=" + language + "]";
	}
}