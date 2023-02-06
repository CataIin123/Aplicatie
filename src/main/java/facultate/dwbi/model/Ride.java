//package facultate.dwbi.model;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.List;
//
//@Entity
//@Table(name = "RIDES")
//public class Ride {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id_ride;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_client")
//    private Client client;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_car")
//    private Car car;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_route")
//    private Route route;
//
//    private LocalDate date_ride;
//    private String status;
//    private float tarif;
//
//    @OneToMany(mappedBy = "ride", cascade = CascadeType.ALL)
//    private List<Invoice> invoices;
//
//    public Ride() {
//    }
//
//    public Ride(int id_ride, Client client, Car car, Route route, LocalDate date_ride, String status, float tarif) {
//        this.id_ride = id_ride;
//        this.client = client;
//        this.car = car;
//        this.route = route;
//        this.date_ride = date_ride;
//        this.status = status;
//        this.tarif = tarif;
//    }
//
//    public int getId_ride() {
//        return id_ride;
//    }
//
//    public void setId_ride(int id_ride) {
//        this.id_ride = id_ride;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    public Route getRoute() {
//        return route;
//    }
//
//    public void setRoute(Route route) {
//        this.route = route;
//    }
//
//    public LocalDate getDate_ride() {
//        return date_ride;
//    }
//
//    public void setDate_ride(LocalDate date_ride) {
//        this.date_ride = date_ride;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public float getTarif() {
//        return tarif;
//    }
//
//    public void setTarif(float tarif) {
//        this.tarif = tarif;
//    }
//}
