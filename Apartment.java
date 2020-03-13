public class Apartment {
    private int aptNumber;
    private int bedrooms;
    private int bathrooms;
    private double monthlyRent;
    public Apartment (int aptNumber, int bedrooms, int bathrooms, double monthlyRent) {
        this.aptNumber = aptNumber;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        if (monthlyRent > 0.00) {
            this.monthlyRent = monthlyRent;
            
        }
    }
    public void setAptNumber (int aptNumber) {
        this.aptNumber = aptNumber;
    }
    public int getAptNumber() {
        return aptNumber;
    }
    public void setBedrooms (int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBathrooms (int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public int getBathrooms() {
        return bathrooms;
    }
    public void setMonthlyRent (double monthlyRent) {
        if (monthlyRent > 0.00) {
            this.monthlyRent = monthlyRent;
        }
    }
    public double getMonthlyRent() {
        return monthlyRent;
    }
}