// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = UpdateBudgetConfigurationBudget.UpdateBudgetConfigurationBudgetSerializer.class)
@JsonDeserialize(
    using = UpdateBudgetConfigurationBudget.UpdateBudgetConfigurationBudgetDeserializer.class)
public class UpdateBudgetConfigurationBudget {
  /** Databricks account ID. */
  private String accountId;

  /**
   * Alerts to configure when this budget is in a triggered state. Budgets must have exactly one
   * alert configuration.
   */
  private Collection<AlertConfiguration> alertConfigurations;

  /** Databricks budget configuration ID. */
  private String budgetConfigurationId;

  /** Human-readable name of budget configuration. Max Length: 128 */
  private String displayName;

  /**
   * Configured filters for this budget. These are applied to your account's usage to limit the
   * scope of what is considered for this budget. Leave empty to include all usage for this account.
   * All provided filters must be matched for usage to be included.
   */
  private BudgetConfigurationFilter filter;

  public UpdateBudgetConfigurationBudget setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public UpdateBudgetConfigurationBudget setAlertConfigurations(
      Collection<AlertConfiguration> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<AlertConfiguration> getAlertConfigurations() {
    return alertConfigurations;
  }

  public UpdateBudgetConfigurationBudget setBudgetConfigurationId(String budgetConfigurationId) {
    this.budgetConfigurationId = budgetConfigurationId;
    return this;
  }

  public String getBudgetConfigurationId() {
    return budgetConfigurationId;
  }

  public UpdateBudgetConfigurationBudget setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateBudgetConfigurationBudget setFilter(BudgetConfigurationFilter filter) {
    this.filter = filter;
    return this;
  }

  public BudgetConfigurationFilter getFilter() {
    return filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateBudgetConfigurationBudget that = (UpdateBudgetConfigurationBudget) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(alertConfigurations, that.alertConfigurations)
        && Objects.equals(budgetConfigurationId, that.budgetConfigurationId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, alertConfigurations, budgetConfigurationId, displayName, filter);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBudgetConfigurationBudget.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("budgetConfigurationId", budgetConfigurationId)
        .add("displayName", displayName)
        .add("filter", filter)
        .toString();
  }

  UpdateBudgetConfigurationBudgetPb toPb() {
    UpdateBudgetConfigurationBudgetPb pb = new UpdateBudgetConfigurationBudgetPb();
    pb.setAccountId(accountId);
    pb.setAlertConfigurations(alertConfigurations);
    pb.setBudgetConfigurationId(budgetConfigurationId);
    pb.setDisplayName(displayName);
    pb.setFilter(filter);

    return pb;
  }

  static UpdateBudgetConfigurationBudget fromPb(UpdateBudgetConfigurationBudgetPb pb) {
    UpdateBudgetConfigurationBudget model = new UpdateBudgetConfigurationBudget();
    model.setAccountId(pb.getAccountId());
    model.setAlertConfigurations(pb.getAlertConfigurations());
    model.setBudgetConfigurationId(pb.getBudgetConfigurationId());
    model.setDisplayName(pb.getDisplayName());
    model.setFilter(pb.getFilter());

    return model;
  }

  public static class UpdateBudgetConfigurationBudgetSerializer
      extends JsonSerializer<UpdateBudgetConfigurationBudget> {
    @Override
    public void serialize(
        UpdateBudgetConfigurationBudget value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateBudgetConfigurationBudgetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateBudgetConfigurationBudgetDeserializer
      extends JsonDeserializer<UpdateBudgetConfigurationBudget> {
    @Override
    public UpdateBudgetConfigurationBudget deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateBudgetConfigurationBudgetPb pb =
          mapper.readValue(p, UpdateBudgetConfigurationBudgetPb.class);
      return UpdateBudgetConfigurationBudget.fromPb(pb);
    }
  }
}
