/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ExternalTracker represents settings for external tracker
 */
@Schema(description = "ExternalTracker represents settings for external tracker")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class ExternalTracker {
  @SerializedName("external_tracker_format")
  private String externalTrackerFormat = null;

  @SerializedName("external_tracker_regexp_pattern")
  private String externalTrackerRegexpPattern = null;

  @SerializedName("external_tracker_style")
  private String externalTrackerStyle = null;

  @SerializedName("external_tracker_url")
  private String externalTrackerUrl = null;

  public ExternalTracker externalTrackerFormat(String externalTrackerFormat) {
    this.externalTrackerFormat = externalTrackerFormat;
    return this;
  }

   /**
   * External Issue Tracker URL Format. Use the placeholders {user}, {repo} and {index} for the username, repository name and issue index.
   * @return externalTrackerFormat
  **/
  @Schema(description = "External Issue Tracker URL Format. Use the placeholders {user}, {repo} and {index} for the username, repository name and issue index.")
  public String getExternalTrackerFormat() {
    return externalTrackerFormat;
  }

  public void setExternalTrackerFormat(String externalTrackerFormat) {
    this.externalTrackerFormat = externalTrackerFormat;
  }

  public ExternalTracker externalTrackerRegexpPattern(String externalTrackerRegexpPattern) {
    this.externalTrackerRegexpPattern = externalTrackerRegexpPattern;
    return this;
  }

   /**
   * External Issue Tracker issue regular expression
   * @return externalTrackerRegexpPattern
  **/
  @Schema(description = "External Issue Tracker issue regular expression")
  public String getExternalTrackerRegexpPattern() {
    return externalTrackerRegexpPattern;
  }

  public void setExternalTrackerRegexpPattern(String externalTrackerRegexpPattern) {
    this.externalTrackerRegexpPattern = externalTrackerRegexpPattern;
  }

  public ExternalTracker externalTrackerStyle(String externalTrackerStyle) {
    this.externalTrackerStyle = externalTrackerStyle;
    return this;
  }

   /**
   * External Issue Tracker Number Format, either &#x60;numeric&#x60;, &#x60;alphanumeric&#x60;, or &#x60;regexp&#x60;
   * @return externalTrackerStyle
  **/
  @Schema(description = "External Issue Tracker Number Format, either `numeric`, `alphanumeric`, or `regexp`")
  public String getExternalTrackerStyle() {
    return externalTrackerStyle;
  }

  public void setExternalTrackerStyle(String externalTrackerStyle) {
    this.externalTrackerStyle = externalTrackerStyle;
  }

  public ExternalTracker externalTrackerUrl(String externalTrackerUrl) {
    this.externalTrackerUrl = externalTrackerUrl;
    return this;
  }

   /**
   * URL of external issue tracker.
   * @return externalTrackerUrl
  **/
  @Schema(description = "URL of external issue tracker.")
  public String getExternalTrackerUrl() {
    return externalTrackerUrl;
  }

  public void setExternalTrackerUrl(String externalTrackerUrl) {
    this.externalTrackerUrl = externalTrackerUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTracker externalTracker = (ExternalTracker) o;
    return Objects.equals(this.externalTrackerFormat, externalTracker.externalTrackerFormat) &&
        Objects.equals(this.externalTrackerRegexpPattern, externalTracker.externalTrackerRegexpPattern) &&
        Objects.equals(this.externalTrackerStyle, externalTracker.externalTrackerStyle) &&
        Objects.equals(this.externalTrackerUrl, externalTracker.externalTrackerUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalTrackerFormat, externalTrackerRegexpPattern, externalTrackerStyle, externalTrackerUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTracker {\n");
    
    sb.append("    externalTrackerFormat: ").append(toIndentedString(externalTrackerFormat)).append("\n");
    sb.append("    externalTrackerRegexpPattern: ").append(toIndentedString(externalTrackerRegexpPattern)).append("\n");
    sb.append("    externalTrackerStyle: ").append(toIndentedString(externalTrackerStyle)).append("\n");
    sb.append("    externalTrackerUrl: ").append(toIndentedString(externalTrackerUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
