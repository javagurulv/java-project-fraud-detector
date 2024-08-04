package org.javaguru.project_fraud_detector.task_16.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
