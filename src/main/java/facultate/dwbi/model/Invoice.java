package facultate.dwbi.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_invoice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ride")
    private Ride ride;

    private int id_ride;
    private LocalDate date_invoice;
    private float total_amount;
    private String status;

    public Invoice() {
    }

    public Invoice(int id_invoice, Ride ride, int id_ride, LocalDate date_invoice, float total_amount, String status) {
        this.id_invoice = id_invoice;
        this.ride = ride;
        this.id_ride = id_ride;
        this.date_invoice = date_invoice;
        this.total_amount = total_amount;
        this.status = status;
    }

    public int getId_invoice() {
        return id_invoice;
    }

    public void setId_invoice(int id_invoice) {
        this.id_invoice = id_invoice;
    }

    public int getId_ride() {
        return id_ride;
    }

    public void setId_ride(int id_ride) {
        this.id_ride = id_ride;
    }

    public LocalDate getDate_invoice() {
        return date_invoice;
    }

    public void setDate_invoice(LocalDate date_invoice) {
        this.date_invoice = date_invoice;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }
}
