package hiber.model;

import javax.persistence.*;
import javax.transaction.Transactional;


@Entity
@Transactional
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    private String model;
    private int series;

    public Car() {
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    @Override
    public String toString() {
        return getModel() +
                " "+
                getSeries();
    }
}