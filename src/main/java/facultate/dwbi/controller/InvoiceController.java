package facultate.dwbi.controller;

import facultate.dwbi.repository.InvoiceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceRepository invoiceRepository;

    public InvoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @GetMapping("/list")
    public String getInvoices(Model model){
        model.addAttribute("invoices", invoiceRepository.findAll());
        return "invoices";
    }
}
