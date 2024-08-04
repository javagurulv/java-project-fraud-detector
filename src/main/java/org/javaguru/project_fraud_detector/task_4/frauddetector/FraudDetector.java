package org.javaguru.project_fraud_detector.task_4.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

}
