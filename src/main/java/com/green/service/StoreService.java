package com.green.service;

import org.springframework.ui.Model;

import com.green.domain.dto.StoreListDTO;
import com.green.domain.dto.StoreSaveDTO;

public interface StoreService {

	void save(StoreSaveDTO dto);

	void getlist(Model model);


}