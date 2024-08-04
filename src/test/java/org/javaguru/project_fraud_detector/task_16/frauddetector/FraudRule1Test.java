package org.javaguru.project_fraud_detector.task_16.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule1Test {

    private FraudRule1 fraudRule = new FraudRule1();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

}