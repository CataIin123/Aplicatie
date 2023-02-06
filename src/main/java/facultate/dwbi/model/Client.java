package facultate.dwbi.model;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTS")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_client;
    private String client_name;
    private String cui;
    private String invoice_address;
    private String delivery_address;
    private String contact_person;
    private String phone;

    public Client() {
    }

    public Client(int id_client, String client_name, String cui, String invoice_address, String delivery_address, String contact_person, String phone) {
        this.id_client = id_client;
        this.client_name = client_name;
        this.cui = cui;
        this.invoice_address = invoice_address;
        this.delivery_address = delivery_address;
        this.contact_person = contact_person;
        this.phone = phone;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_ride) {
        this.id_client = id_ride;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getInvoice_address() {
        return invoice_address;
    }

    public void setInvoice_address(String invoice_address) {
        this.invoice_address = invoice_address;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
