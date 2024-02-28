package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.SLanguageRepository;
import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public class InMemoryLanguageRepository implements SLanguageRepository {

	List<SoftwareLanguage> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<SoftwareLanguage>();
		//ekleme yap
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
