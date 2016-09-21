package com.irdeto.rrm.ls.model;

import com.irdeto.rrm.ls.enums.ProtectionSystemType;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class ProtectionSystemMetadata {

  @Id
  @GeneratedValue(generator="uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL, orphanRemoval =
      true)
  @PrimaryKeyJoinColumn
  private ProtectionSystemObject systemObject;

  private ProtectionSystemType systemType;

  public ProtectionSystemMetadata(ProtectionSystemObject systemObject,
                                  ProtectionSystemType systemType) {
    this.systemObject = systemObject;
    this.systemType = systemType;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProtectionSystemObject getSystemObject() {
    return systemObject;
  }

  public void setSystemObject(ProtectionSystemObject systemObject) {
    this.systemObject = systemObject;
  }

  public ProtectionSystemType getSystemType() {
    return systemType;
  }

  public void setSystemType(ProtectionSystemType systemType) {
    this.systemType = systemType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProtectionSystemMetadata that = (ProtectionSystemMetadata) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (systemObject != null ? !systemObject.equals(that.systemObject) : that.systemObject != null)
      return false;
    return systemType == that.systemType;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (systemObject != null ? systemObject.hashCode() : 0);
    result = 31 * result + (systemType != null ? systemType.hashCode() : 0);
    return result;
  }
}
