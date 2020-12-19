package tn.iit.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import tn.iit.dto.MedicalFileDTO;
import tn.iit.dto.MedicationDTO;
import tn.iit.mapper.MedicalFileMapper;
import tn.iit.models.MedicalFile;
import tn.iit.repository.MedicalFileRepository;

@Service
@Transactional
public class MedicalFileService {

	private final MedicalFileRepository medicalFileRepository;
	// private final StoreManagementService storeManagementService;

	public MedicalFileService(MedicalFileRepository medicalFileRepository,
			StoreManagementService storeManagementService) {
		this.medicalFileRepository = medicalFileRepository;
		// this.storeManagementService = storeManagementService;
	}

	// save medicalFileDTO
	public MedicalFileDTO save(MedicalFileDTO medicalFileDTO) {
		MedicalFile medicalFile = MedicalFileMapper.medicalFileDTOToMedicalFile(medicalFileDTO);
		medicalFile = medicalFileRepository.save(medicalFile);
		MedicalFileDTO resultDTO = MedicalFileMapper.medicalFileToMedicalFileDTO(medicalFile);
		return resultDTO;
	}

	// update medicalFileDTO
	public MedicalFileDTO update(MedicalFileDTO medicalFileDTO) {
		MedicalFile medicalFileDB = medicalFileRepository.getOne(medicalFileDTO.getId());
		MedicalFile medicalFile = MedicalFileMapper.medicalFileDTOToMedicalFile(medicalFileDTO);
		medicalFile = medicalFileRepository.save(medicalFile);
		MedicalFileDTO resultDTO = MedicalFileMapper.medicalFileToMedicalFileDTO(medicalFile);
		return resultDTO;
	}

	// getOne medicalFileDTO by id
	@Transactional(readOnly =true)
	public MedicalFileDTO findOne(Integer id) {
		MedicalFile medicalFile = medicalFileRepository.getOne(id);
		MedicalFileDTO medicalFileDTO = MedicalFileMapper.medicalFileToMedicalFileDTO(medicalFile);

		//get Modification
		// List<MedicationDTO> medicationDTO = storeManagementService.getAllMedications();
		
		return resultDTO;

	}

}
