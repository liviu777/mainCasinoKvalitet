package casino.controllers;


import casino.entities.Casino;
import casino.services.CasinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casino")
public class CasinoController {

    CasinoService casinoService;

    public CasinoController(@Autowired CasinoService casinoService) {
        this.casinoService = casinoService;
    }

    @GetMapping("/findAll")//http://localhost:9000/casino/findAll
    public List<Casino> findAll() {
        return casinoService.findAll();
    }

    @GetMapping("/findByName/{username}")
    public Casino findByName(@PathVariable String name) {
        return casinoService.findByName(name);
    }

    @GetMapping("/findById/{id}")
    public Casino findById(@PathVariable int casinoId) {
        Long a = (long) casinoId;
        return casinoService.findById(a);
    }

    @PostMapping("/save")
    public Casino save(@RequestBody Casino casino) {
        return casinoService.save(casino);
    }

    @DeleteMapping("/delete/{casinoId}")
    public void delete(@PathVariable Long casinoId){
        casinoService.delete(casinoId);
    }
}
