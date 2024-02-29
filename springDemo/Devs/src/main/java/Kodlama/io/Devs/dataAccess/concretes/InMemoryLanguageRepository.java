package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.SLanguageRepository;
import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Repository
public class InMemoryLanguageRepository implements SLanguageRepository {

	List<SoftwareLanguage> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<SoftwareLanguage>();
		languages.add(new SoftwareLanguage(1,"Assembly","Alt Seviye"));
		languages.add(new SoftwareLanguage(2,"C++","Orta Seviye"));
		languages.add(new SoftwareLanguage(3,"C","Orta Seviye"));
		languages.add(new SoftwareLanguage(4,"Python","Üst Seviye"));
		languages.add(new SoftwareLanguage(5,"Java","Üst Seviye"));
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		return languages;
	}



}
