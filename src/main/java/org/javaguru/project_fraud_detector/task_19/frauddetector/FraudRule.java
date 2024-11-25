package org.javaguru.project_fraud_detector.task_19.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
