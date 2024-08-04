package org.javaguru.project_fraud_detector.task_15.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule1");
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Jon", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

    @Test
    public void shouldBeFraudTransactionWithAmountMoreThen1000000() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule2");
    }

    @Test
    public void shouldBeFraudIfTraderFromSydney() {
        Trader trader = new Trader("Zorro", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule3");
    }

    @Test
    public void shouldBeFraudIfTraderFromJamaica() {
        Trader trader = new Trader("Zorro", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule4");
    }

    @Test
    public void shouldBeFraudIfTraderFromGermanyAndAmountMoreThan1000() {
        Trader trader = new Trader("Zorro", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule5");
    }

    @Test
    public void shouldBeValidTransaction() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

}