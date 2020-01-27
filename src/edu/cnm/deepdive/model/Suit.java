package edu.cnm.deepdive.model;

/**
 * Encapsulates the Suits of standard playing cards. The enum includes {@link #symbol()} and {@link
 * #color()} methods, to return the immutable unicode Symbol and {@link Color} enum instance of any
 * Suit.
 */
public enum Suit {
  CLUBS, DIAMONDS, HEARTS, SPADES;

  private static final String[] symbols = {"\u2663", "\u2662", "\u2661", "\u2660"};
  private static final Color[] colors = {Color.BLACK, Color.RED, Color.RED, Color.BLACK};

  /**
   * Returns unicode playing card symbol for this suit.
   *
   * @return Unicode symbol
   */
  public String symbol() {
    return symbols[ordinal()];
  }

  /**
   * Returns {@link Color} instance value for this suit.
   *
   * @return {@link Color} value.
   */
  public Color color() {
    return colors[ordinal()];
  }

  /**
   * Encapsulates the two possible colors (red &amp; black) of playing cards suits.
   */
  public enum Color {
    RED, BLACK;
  }
}
