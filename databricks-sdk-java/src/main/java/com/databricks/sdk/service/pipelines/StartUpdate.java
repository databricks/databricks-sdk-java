// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = StartUpdate.StartUpdateSerializer.class)
@JsonDeserialize(using = StartUpdate.StartUpdateDeserializer.class)
public class StartUpdate {
  /** What triggered this update. */
  private StartUpdateCause cause;

  /** If true, this update will reset all tables before running. */
  private Boolean fullRefresh;

  /**
   * A list of tables to update with fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  private Collection<String> fullRefreshSelection;

  /** */
  private String pipelineId;

  /**
   * A list of tables to update without fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  private Collection<String> refreshSelection;

  /**
   * If true, this update only validates the correctness of pipeline source code but does not
   * materialize or publish any datasets.
   */
  private Boolean validateOnly;

  public StartUpdate setCause(StartUpdateCause cause) {
    this.cause = cause;
    return this;
  }

  public StartUpdateCause getCause() {
    return cause;
  }

  public StartUpdate setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public StartUpdate setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public StartUpdate setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public StartUpdate setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public StartUpdate setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartUpdate that = (StartUpdate) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause, fullRefresh, fullRefreshSelection, pipelineId, refreshSelection, validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(StartUpdate.class)
        .add("cause", cause)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("refreshSelection", refreshSelection)
        .add("validateOnly", validateOnly)
        .toString();
  }

  StartUpdatePb toPb() {
    StartUpdatePb pb = new StartUpdatePb();
    pb.setCause(cause);
    pb.setFullRefresh(fullRefresh);
    pb.setFullRefreshSelection(fullRefreshSelection);
    pb.setPipelineId(pipelineId);
    pb.setRefreshSelection(refreshSelection);
    pb.setValidateOnly(validateOnly);

    return pb;
  }

  static StartUpdate fromPb(StartUpdatePb pb) {
    StartUpdate model = new StartUpdate();
    model.setCause(pb.getCause());
    model.setFullRefresh(pb.getFullRefresh());
    model.setFullRefreshSelection(pb.getFullRefreshSelection());
    model.setPipelineId(pb.getPipelineId());
    model.setRefreshSelection(pb.getRefreshSelection());
    model.setValidateOnly(pb.getValidateOnly());

    return model;
  }

  public static class StartUpdateSerializer extends JsonSerializer<StartUpdate> {
    @Override
    public void serialize(StartUpdate value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartUpdatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartUpdateDeserializer extends JsonDeserializer<StartUpdate> {
    @Override
    public StartUpdate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartUpdatePb pb = mapper.readValue(p, StartUpdatePb.class);
      return StartUpdate.fromPb(pb);
    }
  }
}
