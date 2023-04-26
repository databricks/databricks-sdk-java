// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>BudgetAlert class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>emailNotifications</code>.</p>
   *
   * @param emailNotifications a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.billing.BudgetAlert} object
   */
  public BudgetAlert setEmailNotifications(Collection<String> emailNotifications) {
    this.emailNotifications = emailNotifications;
    return this;
  }

  /**
   * <p>Getter for the field <code>emailNotifications</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getEmailNotifications() {
    return emailNotifications;
  }

  /**
   * <p>Setter for the field <code>minPercentage</code>.</p>
   *
   * @param minPercentage a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.billing.BudgetAlert} object
   */
  public BudgetAlert setMinPercentage(Long minPercentage) {
    this.minPercentage = minPercentage;
    return this;
  }

  /**
   * <p>Getter for the field <code>minPercentage</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getMinPercentage() {
    return minPercentage;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetAlert that = (BudgetAlert) o;
    return Objects.equals(emailNotifications, that.emailNotifications)
        && Objects.equals(minPercentage, that.minPercentage);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(emailNotifications, minPercentage);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(BudgetAlert.class)
        .add("emailNotifications", emailNotifications)
        .add("minPercentage", minPercentage)
        .toString();
  }
}
