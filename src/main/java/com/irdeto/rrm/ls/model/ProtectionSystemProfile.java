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
public class ProtectionSystemProfile {

  @Id
  @GeneratedValue(generator="uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @PrimaryKeyJoinColumn
  private Set<ProtectionSystemMetadata> systemsMetadata;

  public ProtectionSystemProfile(
      Set<ProtectionSystemMetadata> systemsMetadata) {
    this.systemsMetadata = systemsMetadata;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Set<ProtectionSystemMetadata> getSystemsMetadata() {
    return systemsMetadata;
  }

  public void setSystemsMetadata(
      Set<ProtectionSystemMetadata> systemsMetadata) {
    this.systemsMetadata = systemsMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProtectionSystemProfile that = (ProtectionSystemProfile) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    return systemsMetadata != null ? systemsMetadata
        .equals(that.systemsMetadata) : that.systemsMetadata == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (systemsMetadata != null ? systemsMetadata.hashCode() : 0);
    return result;
  }
}
