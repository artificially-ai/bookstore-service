package com.irdeto.rrm.ls.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class ProtectionSystemObject {

  @Id
  @GeneratedValue(generator="uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn
  private Set<TrackPolicy> trackPolicies;

  public ProtectionSystemObject(Set<TrackPolicy> trackPolicies) {
    this.trackPolicies = trackPolicies;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Set<TrackPolicy> getTrackPolicies() {
    return trackPolicies;
  }

  public void setTrackPolicies(Set<TrackPolicy> trackPolicies) {
    this.trackPolicies = trackPolicies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProtectionSystemObject that = (ProtectionSystemObject) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    return trackPolicies != null ? trackPolicies
        .equals(that.trackPolicies) : that.trackPolicies == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (trackPolicies != null ? trackPolicies.hashCode() : 0);
    return result;
  }
}
