package org.javaguru.project_fraud_detector.task_10.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule3Test {

    private FraudRule3 fraudRule = new FraudRule3();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("John", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("John", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

}