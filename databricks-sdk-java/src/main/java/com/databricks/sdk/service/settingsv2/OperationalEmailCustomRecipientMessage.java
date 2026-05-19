// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class OperationalEmailCustomRecipientMessage {
  /** */
  @JsonProperty("email")
  private String email;

  public OperationalEmailCustomRecipientMessage setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OperationalEmailCustomRecipientMessage that = (OperationalEmailCustomRecipientMessage) o;
    return Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    return new ToStringer(OperationalEmailCustomRecipientMessage.class)
        .add("email", email)
        .toString();
  }
}
