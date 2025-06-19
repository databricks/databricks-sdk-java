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
@JsonSerialize(using = BudgetConfiguration.BudgetConfigurationSerializer.class)
@JsonDeserialize(using = BudgetConfiguration.BudgetConfigurationDeserializer.class)
public class BudgetConfiguration {
  /** Databricks account ID. */
  private String accountId;

  /**
   * Alerts to configure when this budget is in a triggered state. Budgets must have exactly one
   * alert configuration.
   */
  private Collection<AlertConfiguration> alertConfigurations;

  /** Databricks budget configuration ID. */
  private String budgetConfigurationId;

  /** Creation time of this budget configuration. */
  private Long createTime;

  /** Human-readable name of budget configuration. Max Length: 128 */
  private String displayName;

  /**
   * Configured filters for this budget. These are applied to your account's usage to limit the
   * scope of what is considered for this budget. Leave empty to include all usage for this account.
   * All provided filters must be matched for usage to be included.
   */
  private BudgetConfigurationFilter filter;

  /** Update time of this budget configuration. */
  private Long updateTime;

  public BudgetConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public BudgetConfiguration setAlertConfigurations(
      Collection<AlertConfiguration> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<AlertConfiguration> getAlertConfigurations() {
    return alertConfigurations;
  }

  public BudgetConfiguration setBudgetConfigurationId(String budgetConfigurationId) {
    this.budgetConfigurationId = budgetConfigurationId;
    return this;
  }

  public String getBudgetConfigurationId() {
    return budgetConfigurationId;
  }

  public BudgetConfiguration setCreateTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  public Long getCreateTime() {
    return createTime;
  }

  public BudgetConfiguration setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public BudgetConfiguration setFilter(BudgetConfigurationFilter filter) {
    this.filter = filter;
    return this;
  }

  public BudgetConfigurationFilter getFilter() {
    return filter;
  }

  public BudgetConfiguration setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Long getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfiguration that = (BudgetConfiguration) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(alertConfigurations, that.alertConfigurations)
        && Objects.equals(budgetConfigurationId, that.budgetConfigurationId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filter, that.filter)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        alertConfigurations,
        budgetConfigurationId,
        createTime,
        displayName,
        filter,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfiguration.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("budgetConfigurationId", budgetConfigurationId)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("filter", filter)
        .add("updateTime", updateTime)
        .toString();
  }

  BudgetConfigurationPb toPb() {
    BudgetConfigurationPb pb = new BudgetConfigurationPb();
    pb.setAccountId(accountId);
    pb.setAlertConfigurations(alertConfigurations);
    pb.setBudgetConfigurationId(budgetConfigurationId);
    pb.setCreateTime(createTime);
    pb.setDisplayName(displayName);
    pb.setFilter(filter);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static BudgetConfiguration fromPb(BudgetConfigurationPb pb) {
    BudgetConfiguration model = new BudgetConfiguration();
    model.setAccountId(pb.getAccountId());
    model.setAlertConfigurations(pb.getAlertConfigurations());
    model.setBudgetConfigurationId(pb.getBudgetConfigurationId());
    model.setCreateTime(pb.getCreateTime());
    model.setDisplayName(pb.getDisplayName());
    model.setFilter(pb.getFilter());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class BudgetConfigurationSerializer extends JsonSerializer<BudgetConfiguration> {
    @Override
    public void serialize(BudgetConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BudgetConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BudgetConfigurationDeserializer
      extends JsonDeserializer<BudgetConfiguration> {
    @Override
    public BudgetConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BudgetConfigurationPb pb = mapper.readValue(p, BudgetConfigurationPb.class);
      return BudgetConfiguration.fromPb(pb);
    }
  }
}
