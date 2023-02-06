package facultate.dwbi.controller;

import facultate.dwbi.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/list")
    public String getClients(Model model){
        model.addAttribute("clients", clientRepository.findAll());
        return "clients";
    }
}
