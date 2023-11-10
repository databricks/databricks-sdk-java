// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Coordinates of this widget on a dashboard. This portion of the API changes frequently and is
 * unsupported.
 */
@Generated
public class WidgetPosition {
  /** reserved for internal use */
  @JsonProperty("autoHeight")
  private Boolean autoHeight;

  /** column in the dashboard grid. Values start with 0 */
  @JsonProperty("col")
  private Long col;

  /** row in the dashboard grid. Values start with 0 */
  @JsonProperty("row")
  private Long row;

  /** width of the widget measured in dashboard grid cells */
  @JsonProperty("sizeX")
  private Long sizeX;

  /** height of the widget measured in dashboard grid cells */
  @JsonProperty("sizeY")
  private Long sizeY;

  public WidgetPosition setAutoHeight(Boolean autoHeight) {
    this.autoHeight = autoHeight;
    return this;
  }

  public Boolean getAutoHeight() {
    return autoHeight;
  }

  public WidgetPosition setCol(Long col) {
    this.col = col;
    return this;
  }

  public Long getCol() {
    return col;
  }

  public WidgetPosition setRow(Long row) {
    this.row = row;
    return this;
  }

  public Long getRow() {
    return row;
  }

  public WidgetPosition setSizeX(Long sizeX) {
    this.sizeX = sizeX;
    return this;
  }

  public Long getSizeX() {
    return sizeX;
  }

  public WidgetPosition setSizeY(Long sizeY) {
    this.sizeY = sizeY;
    return this;
  }

  public Long getSizeY() {
    return sizeY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WidgetPosition that = (WidgetPosition) o;
    return Objects.equals(autoHeight, that.autoHeight)
        && Objects.equals(col, that.col)
        && Objects.equals(row, that.row)
        && Objects.equals(sizeX, that.sizeX)
        && Objects.equals(sizeY, that.sizeY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoHeight, col, row, sizeX, sizeY);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetPosition.class)
        .add("autoHeight", autoHeight)
        .add("col", col)
        .add("row", row)
        .add("sizeX", sizeX)
        .add("sizeY", sizeY)
        .toString();
  }
}
