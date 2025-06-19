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
@JsonSerialize(using = BudgetConfigurationFilter.BudgetConfigurationFilterSerializer.class)
@JsonDeserialize(using = BudgetConfigurationFilter.BudgetConfigurationFilterDeserializer.class)
public class BudgetConfigurationFilter {
  /**
   * A list of tag keys and values that will limit the budget to usage that includes those specific
   * custom tags. Tags are case-sensitive and should be entered exactly as they appear in your usage
   * data.
   */
  private Collection<BudgetConfigurationFilterTagClause> tags;

  /** If provided, usage must match with the provided Databricks workspace IDs. */
  private BudgetConfigurationFilterWorkspaceIdClause workspaceId;

  public BudgetConfigurationFilter setTags(Collection<BudgetConfigurationFilterTagClause> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<BudgetConfigurationFilterTagClause> getTags() {
    return tags;
  }

  public BudgetConfigurationFilter setWorkspaceId(
      BudgetConfigurationFilterWorkspaceIdClause workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public BudgetConfigurationFilterWorkspaceIdClause getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationFilter that = (BudgetConfigurationFilter) o;
    return Objects.equals(tags, that.tags) && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationFilter.class)
        .add("tags", tags)
        .add("workspaceId", workspaceId)
        .toString();
  }

  BudgetConfigurationFilterPb toPb() {
    BudgetConfigurationFilterPb pb = new BudgetConfigurationFilterPb();
    pb.setTags(tags);
    pb.setWorkspaceId(workspaceId);

    return pb;
  }

  static BudgetConfigurationFilter fromPb(BudgetConfigurationFilterPb pb) {
    BudgetConfigurationFilter model = new BudgetConfigurationFilter();
    model.setTags(pb.getTags());
    model.setWorkspaceId(pb.getWorkspaceId());

    return model;
  }

  public static class BudgetConfigurationFilterSerializer
      extends JsonSerializer<BudgetConfigurationFilter> {
    @Override
    public void serialize(
        BudgetConfigurationFilter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BudgetConfigurationFilterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BudgetConfigurationFilterDeserializer
      extends JsonDeserializer<BudgetConfigurationFilter> {
    @Override
    public BudgetConfigurationFilter deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BudgetConfigurationFilterPb pb = mapper.readValue(p, BudgetConfigurationFilterPb.class);
      return BudgetConfigurationFilter.fromPb(pb);
    }
  }
}
