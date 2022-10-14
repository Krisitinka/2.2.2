package web.model;

public class Car {
    private String model;
    private String series;
    private int hp;

    public Car(String model, String series, int hp) {
        this.model = model;
        this.series = series;
        this.hp = hp;
    }

    // может и не нужны -_-
    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getHp() {
        return hp;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", hp=" + hp +
                '}';
    }
}
