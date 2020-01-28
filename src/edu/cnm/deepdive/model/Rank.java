package edu.cnm.deepdive.model;

/**
 * Encapsulates all of the Ranks used in standard playing cards. The {@code enum} also defines the
 * {@link #symbol()} to create the single or double character abbreviations of every card in a
 * standard deck.
 */
public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;
  /**
   * Initializes each instance of each card symbol.
   */
  private static final String[] symbols = {
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K"
  };


  public String symbol() {
    return symbols[ordinal()];
  }
}
