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
 * GeneralAttachmentSettings contains global Attachment settings exposed by API
 */
@Schema(description = "GeneralAttachmentSettings contains global Attachment settings exposed by API")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class GeneralAttachmentSettings {
  @SerializedName("allowed_types")
  private String allowedTypes = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("max_files")
  private Long maxFiles = null;

  @SerializedName("max_size")
  private Long maxSize = null;

  public GeneralAttachmentSettings allowedTypes(String allowedTypes) {
    this.allowedTypes = allowedTypes;
    return this;
  }

   /**
   * Get allowedTypes
   * @return allowedTypes
  **/
  @Schema(description = "")
  public String getAllowedTypes() {
    return allowedTypes;
  }

  public void setAllowedTypes(String allowedTypes) {
    this.allowedTypes = allowedTypes;
  }

  public GeneralAttachmentSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public GeneralAttachmentSettings maxFiles(Long maxFiles) {
    this.maxFiles = maxFiles;
    return this;
  }

   /**
   * Get maxFiles
   * @return maxFiles
  **/
  @Schema(description = "")
  public Long getMaxFiles() {
    return maxFiles;
  }

  public void setMaxFiles(Long maxFiles) {
    this.maxFiles = maxFiles;
  }

  public GeneralAttachmentSettings maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralAttachmentSettings generalAttachmentSettings = (GeneralAttachmentSettings) o;
    return Objects.equals(this.allowedTypes, generalAttachmentSettings.allowedTypes) &&
        Objects.equals(this.enabled, generalAttachmentSettings.enabled) &&
        Objects.equals(this.maxFiles, generalAttachmentSettings.maxFiles) &&
        Objects.equals(this.maxSize, generalAttachmentSettings.maxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedTypes, enabled, maxFiles, maxSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralAttachmentSettings {\n");
    
    sb.append("    allowedTypes: ").append(toIndentedString(allowedTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    maxFiles: ").append(toIndentedString(maxFiles)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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