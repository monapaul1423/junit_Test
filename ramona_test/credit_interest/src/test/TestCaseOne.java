package test;

import static org.junit.Assert.*;

import org.junit.Test;

import card.CreditCard;
import card.Discover;
import card.MasterCard;
import card.Visa;
import person.Person;
import wallet.Wallet;

public class TestCaseOne {
	
	private CreditCard[] cards = {new Visa(100), new MasterCard(100), new Discover(100)};
	private Wallet[] wallet = {new Wallet(cards)};
	private Person person = new Person(wallet);

	
	@Test
	public void personInterestShouldReturnSixteen() {
		assertEquals(16.0, person.getInterest(), 0);
	}
	
	@Test
	public void visaInterestShouldReturnTen() {
		assertEquals(10.0, cards[0].getInterest(), 0);
	}
	
	@Test
	public void mastercardInterestShouldReturnFive() {
		assertEquals(5.0, cards[1].getInterest(), 0);
	}
	
	@Test
	public void discoverInterestShouldReturnOne() {
		assertEquals(1.0, cards[2].getInterest(), 0);
	}

}