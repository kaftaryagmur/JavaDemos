package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public interface LanguageService {
	List<SoftwareLanguage> getAll();
}
