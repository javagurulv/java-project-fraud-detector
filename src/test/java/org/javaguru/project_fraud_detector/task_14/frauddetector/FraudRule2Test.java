package org.javaguru.project_fraud_detector.task_14.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule2Test {

    private FraudRule2 fraudRule = new FraudRule2();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_1000000() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000000);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction));
    }

}