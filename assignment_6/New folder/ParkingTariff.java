public class ParkingTariff {
        public TimePeriod period;
        public Money tariff;

        public ParkingTariff(TimePeriod period, Money tariff) {
            this.period = period;
            this.tariff = tariff;
        }
        
        public TimePeriod ourPeriod() {
            return this.period;
        }
        
        public Money ourMoney() {
            return this.tariff;
        }
    }

