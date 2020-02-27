package edu.cnm.deepdive.model;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Creates cards list and dealt list.
 */
public class Deck implements Comparator<Card>{

  private List<Card> cards;
  private List<Card> dealt;

  /**
   * Initializes the cards {@link Deck} and the dealt {@link Deck}. creates instances of cards and dealt lists based on {@link Suit} and {@link Rank}
   */
  public Deck() {
    cards = new ArrayList<>();
    dealt = new LinkedList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }
  }

  /**
   * Iterates through the {@link Deck} of cards until cards is empty.
   * @return not shuffled Deck of cards
   */
  public Card deal() {
    Card card = cards.isEmpty() ? null : cards.remove(0);
    if (card != null) {
      dealt.add(card);
    }
    return card;
  }

  /**
   * Shuffles the {@link Deck} and adds all cards in the dealt {@link Deck} back to the cards {@link Deck}.
   * clears the dealt {@link Deck}.
   * @param rng generates random number to determine the number of times the deck gets shuffled.
   */
  public void shuffle(Random rng) {
    gather();
    Collections.shuffle(cards, rng);
  }

  private void gather() {
    cards.addAll(dealt);
    dealt.clear();
  }

  /**
   * Returns the size of the cards {@link Deck}.
   */
  public int remaining() {
    return cards.size();
  }

  /**
   * Returns the size of the dealt {@link Deck}.
   */
  public int dealt() {
    return dealt.size();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public void sort(boolean gather) {
    if (gather) {
      gather();
    }
    cards.sort(this);
  }

  @Override
  public int compare(Card card1, Card card2) {
    return Comparator.comparing(Card::getSuit).thenComparing(Card::getRank).compare(card1, card2);
  }
}
