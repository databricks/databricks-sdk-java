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
    using = CreateBudgetConfigurationBudget.CreateBudgetConfigurationBudgetSerializer.class)
@JsonDeserialize(
    using = CreateBudgetConfigurationBudget.CreateBudgetConfigurationBudgetDeserializer.class)
public class CreateBudgetConfigurationBudget {
  /** Databricks account ID. */
  private String accountId;

  /**
   * Alerts to configure when this budget is in a triggered state. Budgets must have exactly one
   * alert configuration.
   */
  private Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations;

  /** Human-readable name of budget configuration. Max Length: 128 */
  private String displayName;

  /**
   * Configured filters for this budget. These are applied to your account's usage to limit the
   * scope of what is considered for this budget. Leave empty to include all usage for this account.
   * All provided filters must be matched for usage to be included.
   */
  private BudgetConfigurationFilter filter;

  public CreateBudgetConfigurationBudget setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CreateBudgetConfigurationBudget setAlertConfigurations(
      Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<CreateBudgetConfigurationBudgetAlertConfigurations> getAlertConfigurations() {
    return alertConfigurations;
  }

  public CreateBudgetConfigurationBudget setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateBudgetConfigurationBudget setFilter(BudgetConfigurationFilter filter) {
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
    CreateBudgetConfigurationBudget that = (CreateBudgetConfigurationBudget) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(alertConfigurations, that.alertConfigurations)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, alertConfigurations, displayName, filter);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudget.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("displayName", displayName)
        .add("filter", filter)
        .toString();
  }

  CreateBudgetConfigurationBudgetPb toPb() {
    CreateBudgetConfigurationBudgetPb pb = new CreateBudgetConfigurationBudgetPb();
    pb.setAccountId(accountId);
    pb.setAlertConfigurations(alertConfigurations);
    pb.setDisplayName(displayName);
    pb.setFilter(filter);

    return pb;
  }

  static CreateBudgetConfigurationBudget fromPb(CreateBudgetConfigurationBudgetPb pb) {
    CreateBudgetConfigurationBudget model = new CreateBudgetConfigurationBudget();
    model.setAccountId(pb.getAccountId());
    model.setAlertConfigurations(pb.getAlertConfigurations());
    model.setDisplayName(pb.getDisplayName());
    model.setFilter(pb.getFilter());

    return model;
  }

  public static class CreateBudgetConfigurationBudgetSerializer
      extends JsonSerializer<CreateBudgetConfigurationBudget> {
    @Override
    public void serialize(
        CreateBudgetConfigurationBudget value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBudgetConfigurationBudgetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetConfigurationBudgetDeserializer
      extends JsonDeserializer<CreateBudgetConfigurationBudget> {
    @Override
    public CreateBudgetConfigurationBudget deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetConfigurationBudgetPb pb =
          mapper.readValue(p, CreateBudgetConfigurationBudgetPb.class);
      return CreateBudgetConfigurationBudget.fromPb(pb);
    }
  }
}
