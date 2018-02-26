package zadania;

import org.junit.Before;

public class Zadanie3 {

    InformationService informationService;

    /**
     * Service responsible for sending an email and a sms
     */
    interface SendService {
        void sendEmail(String message, String email);

        void sendSms(String message, String phoneNumber);
    }

    public class CustomerInformation {
        public final String email;
        public final String phoneNumber;

        CustomerInformation(String email, String phoneNumber) {
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
    }

    public class SaleProducer {
        public String getSaleInfomration() {
            return "Dzisiaj bułki 20% taniej";
        }
    }

    public class InformationService {

        private SaleProducer saleProducer;
        private SendService sendService;
        /**
         * Send sale information via email when email available and sms when phoneNumber available.
         *
         * @param customerInformation
         */
        public void sendSaleInformation(CustomerInformation customerInformation) {
            // todo
        }
    }

    @Before
    public void setUp(){
        informationService = new InformationService();

    }

    @org.junit.Test
    public void test() throws Exception {
        CustomerInformation customerInformation = new CustomerInformation("test@test.com","7777777");

        verify(informationService.sendSaleInformation(customerInformation),times(1));
    }
}
