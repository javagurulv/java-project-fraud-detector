package org.javaguru.project_fraud_detector.task_6.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }

        if (trader.getCity().equals("Sydney")) {
            return true;
        }

        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }

        return false;
    }

}
