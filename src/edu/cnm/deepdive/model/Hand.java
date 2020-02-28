package edu.cnm.deepdive.model;

import java.util.List;

public class Hand {

  private List<Card> cards;

  public Hand(List<Card> cards) {
    this.cards = cards;
  }

  public Card add(Card card) {
    return card;
  }
}
