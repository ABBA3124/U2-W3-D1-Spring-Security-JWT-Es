package davideabbadessa.U2_W3_D1.services;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import davideabbadessa.U2_W3_D1.entities.Dipendente;
import davideabbadessa.U2_W3_D1.exceptions.NotFoundException;
import davideabbadessa.U2_W3_D1.payloads.DipendenteDTO;
import davideabbadessa.U2_W3_D1.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    @Autowired
    private Cloudinary cloudinary;

    public List<Dipendente> getAllDipendenti() {
        return dipendenteRepository.findAll();
    }

    public Dipendente getDipendenteById(UUID id) {
        return dipendenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Dipendente saveDipendente(DipendenteDTO dipendenteDTO) {
        Dipendente dipendente = new Dipendente();
        dipendente.setUsername(dipendenteDTO.username());
        dipendente.setNome(dipendenteDTO.nome());
        dipendente.setCognome(dipendenteDTO.cognome());
        dipendente.setEmail(dipendenteDTO.email());
        dipendente.setAvatar("https://ui-avatars.com/api/?name=" + dipendente.getNome() + "+" + dipendente.getCognome());
        return dipendenteRepository.save(dipendente);
    }

    public void deleteDipendente(UUID id) {
        dipendenteRepository.deleteById(id);
    }

    public Dipendente updateDipendente(UUID id, DipendenteDTO dipendenteDTO) {
        Dipendente dipendente = this.getDipendenteById(id);
        dipendente.setUsername(dipendenteDTO.username());
        dipendente.setNome(dipendenteDTO.nome());
        dipendente.setCognome(dipendenteDTO.cognome());
        dipendente.setEmail(dipendenteDTO.email());
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente uploadProfileImage(UUID dipendenteId, MultipartFile file) throws IOException {
        Dipendente dipendente = this.getDipendenteById(dipendenteId);

        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        String imageUrl = uploadResult.get("url").toString();
        dipendente.setAvatar(imageUrl);

        return dipendenteRepository.save(dipendente);
    }


}
