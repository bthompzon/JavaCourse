package vehicle.factorypattern;

import java.time.LocalDate;

public class Dealership {
    private String address, slogan, languageSpoken;
    private LocalDate foundedDate;
    private int numVehicles, numEmployees;
    private boolean providesService;

    protected Dealership(DealershipBuilder builder) {
        this.address = builder.address;
        this.slogan = builder.slogan;
        this.languageSpoken = builder.languageSpoken;
        this.foundedDate = builder.foundedDate;
        this.numVehicles = builder.numVehicles;
        this.numEmployees = builder.numEmployees;
        this.providesService = builder.providesService;
    }

    public static class DealershipBuilder {
        private String address;
        private LocalDate foundedDate;
        private int numVehicles;
        private int numEmployees;

        private String slogan = "";
        private boolean providesService = false;
        private String languageSpoken = "English";

        public DealershipBuilder(String address, LocalDate foundedDate, int numVehicles, int numEmployees) {
            this.address = address;
            this.foundedDate = foundedDate;
            this.numVehicles = numVehicles;
            this.numEmployees = numEmployees;
        }

        public DealershipBuilder slogan(String slogan) {
            this.slogan = slogan;
            return this;
        }

        public DealershipBuilder providesService(boolean providesService) {
            this.providesService = providesService;
            return this;
        }

        public DealershipBuilder languageSpoken(String languageSpoken) {
            this.languageSpoken = languageSpoken;
            return this;
        }

        public Dealership build() {
            return new Dealership(this);
        }
    }

    public String getAddress() {
        return this.address;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String slogan) {
        if (slogan.length() > 0) {
            this.slogan = slogan;
        }
    }

    public String getLanguageSpoken() {
        return this.languageSpoken;
    }

    public LocalDate getFoundedDate() {
        return foundedDate;
    }

    public int getNumVehicles() {
        return this.numVehicles;
    }

    public void setNumVehicles(int numVehicles) {
        if (numVehicles > 0) {
            this.numVehicles = numVehicles;
        }
    }

    public int getNumEmployees() {
        return this.numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        if (numEmployees > 0) {
            this.numEmployees = numEmployees;
        }
    }

    public boolean providesService() {
        return this.providesService;
    }

    public void providesService(boolean providesService) {
        this.providesService = providesService;
    }

    @Override
    public String toString() {
        return String.format("Dealership Info ***\n\tAddress: %s\n\tSlogan: %s\n\tFounded Date: %s\n\tVehicles in stock: %s\n\t" +
                "Provides service: %s", address, slogan, foundedDate, numVehicles, providesService);
    }
}
