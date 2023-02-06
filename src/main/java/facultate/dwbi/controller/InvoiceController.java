package facultate.dwbi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class InvoiceController {

    @GetMapping("/invoice1")
    public String getInvoices(){
        return "invoices";
    }
}
