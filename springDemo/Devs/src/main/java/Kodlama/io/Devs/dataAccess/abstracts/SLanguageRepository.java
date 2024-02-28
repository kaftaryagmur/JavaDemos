package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public interface SLanguageRepository { //Dao

	List<SoftwareLanguage> getAll();
	void delete();
	void add();
	void update();
	//void getById();
}
