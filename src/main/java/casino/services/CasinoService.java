package casino.services;


import casino.entities.Casino;
import casino.repositories.CasinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasinoService {
    //   @Autowired//A 3 a metoda  de injectare prin Autowired prin field (atribut al clasei) - nerecomandat = bad practice
    CasinoRepository casinoRepository;

    //    public CasinoRepository getCasinoRepository() {
//        return casinoRepository;
//    }
//
//    @Autowired//A 2 a metoda de injectare prin Autowired prin setter - best practice => pentru dependintele care nu sunt mandatory(fara de care clasa poate exista) in clasa
//    public void setCasinoRepository(CasinoRepository casinoRepository) {
//        this.casinoRepository = casinoRepository;
//    }
//  Prima metodade injectare prin Autowired prin setter - best practice => pentru dependintele mandatory(fara de care clasa nu poate exista) in clasa
    public CasinoService(@Autowired CasinoRepository casinoRepository) {
        this.casinoRepository = casinoRepository;
    }

    public List<Casino> findAll() {
        return casinoRepository.findAll();
    }

    public Casino findById(Long casinoId) {
        Optional<Casino> optionalCasino = casinoRepository.findById(casinoId);
//        Casino casino = null;
//        casino.getCasinoId(); => gives NullPointerException
//        return optionalCasino.get();
        return optionalCasino.orElse(new Casino());


    }

    public Casino findByName(String name) {
        return casinoRepository.findCasinoByName(name);
    }

    public Casino save(Casino casino) {
        return casinoRepository.save(casino);
    }

    public void delete(Long casinoId) {
        casinoRepository.deleteById(casinoId);
    }


}
