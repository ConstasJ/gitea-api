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
import io.swagger.client.model.IssueConfigContactLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IssueConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class IssueConfig {
  @SerializedName("blank_issues_enabled")
  private Boolean blankIssuesEnabled = null;

  @SerializedName("contact_links")
  private List<IssueConfigContactLink> contactLinks = null;

  public IssueConfig blankIssuesEnabled(Boolean blankIssuesEnabled) {
    this.blankIssuesEnabled = blankIssuesEnabled;
    return this;
  }

   /**
   * Get blankIssuesEnabled
   * @return blankIssuesEnabled
  **/
  @Schema(description = "")
  public Boolean isBlankIssuesEnabled() {
    return blankIssuesEnabled;
  }

  public void setBlankIssuesEnabled(Boolean blankIssuesEnabled) {
    this.blankIssuesEnabled = blankIssuesEnabled;
  }

  public IssueConfig contactLinks(List<IssueConfigContactLink> contactLinks) {
    this.contactLinks = contactLinks;
    return this;
  }

  public IssueConfig addContactLinksItem(IssueConfigContactLink contactLinksItem) {
    if (this.contactLinks == null) {
      this.contactLinks = new ArrayList<IssueConfigContactLink>();
    }
    this.contactLinks.add(contactLinksItem);
    return this;
  }

   /**
   * Get contactLinks
   * @return contactLinks
  **/
  @Schema(description = "")
  public List<IssueConfigContactLink> getContactLinks() {
    return contactLinks;
  }

  public void setContactLinks(List<IssueConfigContactLink> contactLinks) {
    this.contactLinks = contactLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueConfig issueConfig = (IssueConfig) o;
    return Objects.equals(this.blankIssuesEnabled, issueConfig.blankIssuesEnabled) &&
        Objects.equals(this.contactLinks, issueConfig.contactLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blankIssuesEnabled, contactLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueConfig {\n");
    
    sb.append("    blankIssuesEnabled: ").append(toIndentedString(blankIssuesEnabled)).append("\n");
    sb.append("    contactLinks: ").append(toIndentedString(contactLinks)).append("\n");
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
