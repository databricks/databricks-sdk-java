// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class MonitorDestinationPb {
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

  public MonitorDestinationPb setEmailAddresses(Collection<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Collection<String> getEmailAddresses() {
    return emailAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorDestinationPb that = (MonitorDestinationPb) o;
    return Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorDestinationPb.class)
        .add("emailAddresses", emailAddresses)
        .toString();
  }
}
