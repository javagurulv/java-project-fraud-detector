package org.javaguru.project_fraud_detector.task_18.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
