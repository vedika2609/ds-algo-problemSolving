package restassured.openweather;

import java.util.ArrayList;

public class CallByCityNameResponsePojo {
    private City city;
    private String cnt;
    private String cod;
    private String message;
    private ArrayList<List> list;

    public City getCity() {
        return city;
    }

    public String getCnt() {
        return cnt;
    }

    public String getCod() {
        return cod;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<List> getList() {
        return list;
    }

    public class List {
        private String dt;

        private Temp temp;

        private String deg;

        private ArrayList<Weather> weather;

        private String humidity;

        private String pressure;

        private String clouds;

        private String speed;

        public String getDt() {
            return dt;
        }

        public Temp getTemp() {
            return temp;
        }

        public String getDeg() {
            return deg;
        }

        public ArrayList<Weather> getWeather() {
            return weather;
        }

        public String getHumidity() {
            return humidity;
        }

        public String getPressure() {
            return pressure;
        }

        public String getClouds() {
            return clouds;
        }

        public String getSpeed() {
            return speed;
        }
    }

    public class Temp {
        private String min;
        private String max;
        private String eve;
        private String night;
        private String day;
        private String morn;

        public String getMin() {
            return min;
        }

        public String getMax() {
            return max;
        }

        public String getEve() {
            return eve;
        }

        public String getNight() {
            return night;
        }

        public String getDay() {
            return day;
        }

        public String getMorn() {
            return morn;
        }
    }

    public class Weather {
        private String icon;
        private String description;
        private String main;
        private String id;

        public String getIcon() {
            return icon;
        }

        public String getDescription() {
            return description;
        }

        public String getMain() {
            return main;
        }

        public String getId() {
            return id;
        }
    }

    public class City {
        private String country;

        private Coord coord;

        private String name;

        private String id;

        private String population;

        public String getCountry() {
            return country;
        }

        public Coord getCoord() {
            return coord;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getPopulation() {
            return population;
        }
    }

    public class Coord {
        private String lon;
        private String lat;

        public String getLon() {
            return lon;
        }

        public String getLat() {
            return lat;
        }
    }
}
