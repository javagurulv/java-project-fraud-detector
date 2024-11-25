package org.javaguru.project_fraud_detector.task_8.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return isFraudByRule1(transaction)
                || isFraudByRule2(transaction)
                || isFraudByRule3(transaction)
                || isFraudByRule4(transaction)
                || isFraudByRule5(transaction);
    }

    private boolean isFraudByRule1(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    private boolean isFraudByRule2(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    private boolean isFraudByRule3(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

    private boolean isFraudByRule4(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    private boolean isFraudByRule5(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }

}
