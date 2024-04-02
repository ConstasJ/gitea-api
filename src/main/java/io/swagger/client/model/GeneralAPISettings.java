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
 * GeneralAPISettings contains global api settings exposed by it
 */
@Schema(description = "GeneralAPISettings contains global api settings exposed by it")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class GeneralAPISettings {
  @SerializedName("default_git_trees_per_page")
  private Long defaultGitTreesPerPage = null;

  @SerializedName("default_max_blob_size")
  private Long defaultMaxBlobSize = null;

  @SerializedName("default_paging_num")
  private Long defaultPagingNum = null;

  @SerializedName("max_response_items")
  private Long maxResponseItems = null;

  public GeneralAPISettings defaultGitTreesPerPage(Long defaultGitTreesPerPage) {
    this.defaultGitTreesPerPage = defaultGitTreesPerPage;
    return this;
  }

   /**
   * Get defaultGitTreesPerPage
   * @return defaultGitTreesPerPage
  **/
  @Schema(description = "")
  public Long getDefaultGitTreesPerPage() {
    return defaultGitTreesPerPage;
  }

  public void setDefaultGitTreesPerPage(Long defaultGitTreesPerPage) {
    this.defaultGitTreesPerPage = defaultGitTreesPerPage;
  }

  public GeneralAPISettings defaultMaxBlobSize(Long defaultMaxBlobSize) {
    this.defaultMaxBlobSize = defaultMaxBlobSize;
    return this;
  }

   /**
   * Get defaultMaxBlobSize
   * @return defaultMaxBlobSize
  **/
  @Schema(description = "")
  public Long getDefaultMaxBlobSize() {
    return defaultMaxBlobSize;
  }

  public void setDefaultMaxBlobSize(Long defaultMaxBlobSize) {
    this.defaultMaxBlobSize = defaultMaxBlobSize;
  }

  public GeneralAPISettings defaultPagingNum(Long defaultPagingNum) {
    this.defaultPagingNum = defaultPagingNum;
    return this;
  }

   /**
   * Get defaultPagingNum
   * @return defaultPagingNum
  **/
  @Schema(description = "")
  public Long getDefaultPagingNum() {
    return defaultPagingNum;
  }

  public void setDefaultPagingNum(Long defaultPagingNum) {
    this.defaultPagingNum = defaultPagingNum;
  }

  public GeneralAPISettings maxResponseItems(Long maxResponseItems) {
    this.maxResponseItems = maxResponseItems;
    return this;
  }

   /**
   * Get maxResponseItems
   * @return maxResponseItems
  **/
  @Schema(description = "")
  public Long getMaxResponseItems() {
    return maxResponseItems;
  }

  public void setMaxResponseItems(Long maxResponseItems) {
    this.maxResponseItems = maxResponseItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralAPISettings generalAPISettings = (GeneralAPISettings) o;
    return Objects.equals(this.defaultGitTreesPerPage, generalAPISettings.defaultGitTreesPerPage) &&
        Objects.equals(this.defaultMaxBlobSize, generalAPISettings.defaultMaxBlobSize) &&
        Objects.equals(this.defaultPagingNum, generalAPISettings.defaultPagingNum) &&
        Objects.equals(this.maxResponseItems, generalAPISettings.maxResponseItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGitTreesPerPage, defaultMaxBlobSize, defaultPagingNum, maxResponseItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralAPISettings {\n");
    
    sb.append("    defaultGitTreesPerPage: ").append(toIndentedString(defaultGitTreesPerPage)).append("\n");
    sb.append("    defaultMaxBlobSize: ").append(toIndentedString(defaultMaxBlobSize)).append("\n");
    sb.append("    defaultPagingNum: ").append(toIndentedString(defaultPagingNum)).append("\n");
    sb.append("    maxResponseItems: ").append(toIndentedString(maxResponseItems)).append("\n");
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
