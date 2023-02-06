package facultate.dwbi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @RequestMapping("/invoice")
    public String getInvoices(Model model){
        model.addAttribute("test", "test from controller");
        return "invoices.html";
    }
}
