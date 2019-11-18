package main.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Stored in DB as ::R - Restored, S - Suspended, O - Open, C - Closed
 */
public enum CustomerStatus {
  R("R"),
    S("S"),
    O("O"),
    C("C");

  private String value;

  CustomerStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CustomerStatus fromValue(String text) {
    for (CustomerStatus b : CustomerStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
