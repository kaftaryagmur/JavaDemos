package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.SLanguageRepository;
import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Service
public class LanguageManager implements LanguageService {

	private SLanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(SLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		// is kurallari	

		return languageRepository.getAll();
	}
	
}
