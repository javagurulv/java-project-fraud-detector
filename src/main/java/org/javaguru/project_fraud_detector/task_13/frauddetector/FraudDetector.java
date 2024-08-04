package org.javaguru.project_fraud_detector.task_13.frauddetector;

class FraudDetector {

    private FraudRule rule1 = new FraudRule1();
    private FraudRule rule2 = new FraudRule2();
    private FraudRule rule3 = new FraudRule3();
    private FraudRule rule4 = new FraudRule4();
    private FraudRule rule5 = new FraudRule5();

    FraudDetectionResult isFraud(Transaction transaction) {
        if (rule1.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule1");
        }
        if (rule2.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule2");
        }
        if (rule3.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule3");
        }
        if (rule4.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule4");
        }
        if (rule5.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule5");
        }

        return new FraudDetectionResult(false, null);
    }

}
