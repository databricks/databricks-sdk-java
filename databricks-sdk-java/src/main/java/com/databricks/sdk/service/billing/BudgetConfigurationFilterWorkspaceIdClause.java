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
    using =
        BudgetConfigurationFilterWorkspaceIdClause
            .BudgetConfigurationFilterWorkspaceIdClauseSerializer.class)
@JsonDeserialize(
    using =
        BudgetConfigurationFilterWorkspaceIdClause
            .BudgetConfigurationFilterWorkspaceIdClauseDeserializer.class)
public class BudgetConfigurationFilterWorkspaceIdClause {
  /** */
  private BudgetConfigurationFilterOperator operator;

  /** */
  private Collection<Long> values;

  public BudgetConfigurationFilterWorkspaceIdClause setOperator(
      BudgetConfigurationFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  public BudgetConfigurationFilterOperator getOperator() {
    return operator;
  }

  public BudgetConfigurationFilterWorkspaceIdClause setValues(Collection<Long> values) {
    this.values = values;
    return this;
  }

  public Collection<Long> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilterWorkspaceIdClause that =
        (BudgetConfigurationFilterWorkspaceIdClause) o;
    return Objects.equals(operator, that.operator) && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, values);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilterWorkspaceIdClause.class)
        .add("operator", operator)
        .add("values", values)
        .toString();
  }

  BudgetConfigurationFilterWorkspaceIdClausePb toPb() {
    BudgetConfigurationFilterWorkspaceIdClausePb pb =
        new BudgetConfigurationFilterWorkspaceIdClausePb();
    pb.setOperator(operator);
    pb.setValues(values);

    return pb;
  }

  static BudgetConfigurationFilterWorkspaceIdClause fromPb(
      BudgetConfigurationFilterWorkspaceIdClausePb pb) {
    BudgetConfigurationFilterWorkspaceIdClause model =
        new BudgetConfigurationFilterWorkspaceIdClause();
    model.setOperator(pb.getOperator());
    model.setValues(pb.getValues());

    return model;
  }

  public static class BudgetConfigurationFilterWorkspaceIdClauseSerializer
      extends JsonSerializer<BudgetConfigurationFilterWorkspaceIdClause> {
    @Override
    public void serialize(
        BudgetConfigurationFilterWorkspaceIdClause value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      BudgetConfigurationFilterWorkspaceIdClausePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BudgetConfigurationFilterWorkspaceIdClauseDeserializer
      extends JsonDeserializer<BudgetConfigurationFilterWorkspaceIdClause> {
    @Override
    public BudgetConfigurationFilterWorkspaceIdClause deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BudgetConfigurationFilterWorkspaceIdClausePb pb =
          mapper.readValue(p, BudgetConfigurationFilterWorkspaceIdClausePb.class);
      return BudgetConfigurationFilterWorkspaceIdClause.fromPb(pb);
    }
  }
}
