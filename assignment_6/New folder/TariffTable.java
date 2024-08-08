public class TariffTable {
    private ParkingTariff[] parkingTariffs;
    private int nextFree=0;

    public TariffTable(int maxSize) {
        this.parkingTariffs = new ParkingTariff[maxSize];
    }

    public void addTariff(TimePeriod period, Money tariff) {
       if (this.nextFree ==  0 ) {
               parkingTariffs[this.nextFree] = new ParkingTariff(period, tariff);
               this.nextFree++;        
      }else {
           if (this.nextFree < this.parkingTariffs.length && this.parkingTariffs[nextFree-1] != null && period.adjacent(parkingTariffs[nextFree-1].ourPeriod()) && parkingTariffs[nextFree-1].ourPeriod().precedes(period)) {
               parkingTariffs[nextFree] = new ParkingTariff(period, tariff);
               nextFree ++;
        } else {
            throw new IllegalArgumentException("Tariff periods must be adjacent.");
        }
    }
}

    public Money getTariff(Duration lengthOfStay) {
        for (ParkingTariff entry : parkingTariffs) {
            if (entry.period.includes(lengthOfStay)) {
                return entry.tariff;
            }
        }
        throw new IllegalArgumentException("No matching tariff found for the length of stay");
    }

    public String toString() {
        StringBuilder mySentence = new StringBuilder();
        for (ParkingTariff entry : parkingTariffs) {
            if (entry != null) {
               mySentence.append(entry.period).append(" : ").append(entry.tariff).append("\n");
            }
        }
        if (mySentence.toString().length() != 0) {
            String newSentence = mySentence.toString();
            return newSentence.substring(0, newSentence.length()-1 );
        } else {
            return "";
        }
        
      }
}
