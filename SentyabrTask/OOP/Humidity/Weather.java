package tasklar.SentyabrTask.OOP.Humidity;

public class Weather {
    private  double temperature;
    private  double humidity;
    private  double windSpeed;

    public Weather(double temperature, double humidity,  double windSpeed) {
        setTemperature(temperature);
        setHumidity(humidity);
        setWindSpeed(windSpeed);
    }

    public void setTemperature(double temperature) {
        if (temperature < 0 || temperature > 100) {
            System.out.println("Səhv temperatur dəyəri: " + temperature +
                    ". Dəyərlər -100 və 100 arasında olmalıdır.");
        } else {
            this.temperature = temperature;
        }
    }
    public void setHumidity(double humidity) {
        if (humidity < 0 || humidity > 100) {
            System.out.println("Səhv nəmlik dəyəri: " + humidity + ". Dəyərlər 0 və 100 arasında olmalıdır.");
        } else {
            this.humidity = humidity;
        }
    }
    public void setWindSpeed(double windSpeed) {
        if (windSpeed < 0 || windSpeed > 250) {
            System.out.println("Səhv küləyin sürəti: " + windSpeed + ". Dəyərlər 0 və 250 arasında olmalıdır.");
        } else {
            this.windSpeed = windSpeed;
        }
    }


    public void showWeatherCondition() {
       System.out.println("Hava şəraiti:");
        System.out.println("Temperatur: " + temperature + " °C");
        System.out.println("Nəmlik: " + humidity + " %");
        System.out.println("Küləyin sürəti: " + windSpeed + " km/s");
    }
}
