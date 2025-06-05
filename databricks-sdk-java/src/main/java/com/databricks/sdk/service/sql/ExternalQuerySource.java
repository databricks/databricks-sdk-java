// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = ExternalQuerySource.ExternalQuerySourceSerializer.class)
@JsonDeserialize(using = ExternalQuerySource.ExternalQuerySourceDeserializer.class)
public class ExternalQuerySource {
  /** The canonical identifier for this SQL alert */
  private String alertId;

  /** The canonical identifier for this Lakeview dashboard */
  private String dashboardId;

  /** The canonical identifier for this Genie space */
  private String genieSpaceId;

  /** */
  private ExternalQuerySourceJobInfo jobInfo;

  /** The canonical identifier for this legacy dashboard */
  private String legacyDashboardId;

  /** The canonical identifier for this notebook */
  private String notebookId;

  /** The canonical identifier for this SQL query */
  private String sqlQueryId;

  public ExternalQuerySource setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public ExternalQuerySource setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ExternalQuerySource setGenieSpaceId(String genieSpaceId) {
    this.genieSpaceId = genieSpaceId;
    return this;
  }

  public String getGenieSpaceId() {
    return genieSpaceId;
  }

  public ExternalQuerySource setJobInfo(ExternalQuerySourceJobInfo jobInfo) {
    this.jobInfo = jobInfo;
    return this;
  }

  public ExternalQuerySourceJobInfo getJobInfo() {
    return jobInfo;
  }

  public ExternalQuerySource setLegacyDashboardId(String legacyDashboardId) {
    this.legacyDashboardId = legacyDashboardId;
    return this;
  }

  public String getLegacyDashboardId() {
    return legacyDashboardId;
  }

  public ExternalQuerySource setNotebookId(String notebookId) {
    this.notebookId = notebookId;
    return this;
  }

  public String getNotebookId() {
    return notebookId;
  }

  public ExternalQuerySource setSqlQueryId(String sqlQueryId) {
    this.sqlQueryId = sqlQueryId;
    return this;
  }

  public String getSqlQueryId() {
    return sqlQueryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalQuerySource that = (ExternalQuerySource) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(genieSpaceId, that.genieSpaceId)
        && Objects.equals(jobInfo, that.jobInfo)
        && Objects.equals(legacyDashboardId, that.legacyDashboardId)
        && Objects.equals(notebookId, that.notebookId)
        && Objects.equals(sqlQueryId, that.sqlQueryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alertId, dashboardId, genieSpaceId, jobInfo, legacyDashboardId, notebookId, sqlQueryId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalQuerySource.class)
        .add("alertId", alertId)
        .add("dashboardId", dashboardId)
        .add("genieSpaceId", genieSpaceId)
        .add("jobInfo", jobInfo)
        .add("legacyDashboardId", legacyDashboardId)
        .add("notebookId", notebookId)
        .add("sqlQueryId", sqlQueryId)
        .toString();
  }

  ExternalQuerySourcePb toPb() {
    ExternalQuerySourcePb pb = new ExternalQuerySourcePb();
    pb.setAlertId(alertId);
    pb.setDashboardId(dashboardId);
    pb.setGenieSpaceId(genieSpaceId);
    pb.setJobInfo(jobInfo);
    pb.setLegacyDashboardId(legacyDashboardId);
    pb.setNotebookId(notebookId);
    pb.setSqlQueryId(sqlQueryId);

    return pb;
  }

  static ExternalQuerySource fromPb(ExternalQuerySourcePb pb) {
    ExternalQuerySource model = new ExternalQuerySource();
    model.setAlertId(pb.getAlertId());
    model.setDashboardId(pb.getDashboardId());
    model.setGenieSpaceId(pb.getGenieSpaceId());
    model.setJobInfo(pb.getJobInfo());
    model.setLegacyDashboardId(pb.getLegacyDashboardId());
    model.setNotebookId(pb.getNotebookId());
    model.setSqlQueryId(pb.getSqlQueryId());

    return model;
  }

  public static class ExternalQuerySourceSerializer extends JsonSerializer<ExternalQuerySource> {
    @Override
    public void serialize(ExternalQuerySource value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalQuerySourcePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalQuerySourceDeserializer
      extends JsonDeserializer<ExternalQuerySource> {
    @Override
    public ExternalQuerySource deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalQuerySourcePb pb = mapper.readValue(p, ExternalQuerySourcePb.class);
      return ExternalQuerySource.fromPb(pb);
    }
  }
}
