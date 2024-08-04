package org.javaguru.project_fraud_detector.task_11.frauddetector;

class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
