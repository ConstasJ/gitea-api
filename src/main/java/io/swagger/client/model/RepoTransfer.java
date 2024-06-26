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
import io.swagger.client.model.Team;
import io.swagger.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RepoTransfer represents a pending repo transfer
 */
@Schema(description = "RepoTransfer represents a pending repo transfer")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class RepoTransfer {
  @SerializedName("doer")
  private User doer = null;

  @SerializedName("recipient")
  private User recipient = null;

  @SerializedName("teams")
  private List<Team> teams = null;

  public RepoTransfer doer(User doer) {
    this.doer = doer;
    return this;
  }

   /**
   * Get doer
   * @return doer
  **/
  @Schema(description = "")
  public User getDoer() {
    return doer;
  }

  public void setDoer(User doer) {
    this.doer = doer;
  }

  public RepoTransfer recipient(User recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @Schema(description = "")
  public User getRecipient() {
    return recipient;
  }

  public void setRecipient(User recipient) {
    this.recipient = recipient;
  }

  public RepoTransfer teams(List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public RepoTransfer addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<Team>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @Schema(description = "")
  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoTransfer repoTransfer = (RepoTransfer) o;
    return Objects.equals(this.doer, repoTransfer.doer) &&
        Objects.equals(this.recipient, repoTransfer.recipient) &&
        Objects.equals(this.teams, repoTransfer.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doer, recipient, teams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoTransfer {\n");
    
    sb.append("    doer: ").append(toIndentedString(doer)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
