// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class BudgetAlert {
  /**
   * List of email addresses to be notified when budget percentage is exceeded in the given period.
   */
  @JsonProperty("email_notifications")
  private Collection<String> emailNotifications;

  /**
   * Percentage of the target amount used in the currect period that will trigger a notification.
   */
  @JsonProperty("min_percentage")
  private Long minPercentage;

  public BudgetAlert setEmailNotifications(Collection<String> emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  public Collection<String> getEmailNotifications() {
    return emailNotifications;
  }

  public BudgetAlert setMinPercentage(Long minPercentage) {
    this.minPercentage = minPercentage;
    return this;
  }

  public Long getMinPercentage() {
    return minPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetAlert that = (BudgetAlert) o;
    return Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(minPercentage, that.minPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailNotifications, minPercentage);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetAlert.class)
        .add("emailNotifications", emailNotifications)
        .add("minPercentage", minPercentage)
        .toString();
  }
}
