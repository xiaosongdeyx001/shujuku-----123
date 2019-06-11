package com.opentravelsoft.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.springframework.security.core.GrantedAuthority;

/**
 * This class is used to represent available roles in the database.
 * 
 */
@Entity
@Table(name = "tbl_portal_role")
@NamedQueries({ @NamedQuery(name = "findRoleByName", query = "select r from PortalRole r where r.name = :name ") })
public class PortalRole implements Serializable, GrantedAuthority {
  private Long id;
  private String name;
  private String description;
  private Set<Member> members = new HashSet<Member>(0);

  /**
   * Default constructor - creates a new instance with no values set.
   */
  public PortalRole() {
  }

  /**
   * Create a new instance and set the name.
   * 
   * @param name name of the role.
   */
  public PortalRole(final String name) {
    this.name = name;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  /**
   * @return the name property (getAuthority required by Acegi's
   *         GrantedAuthority interface)
   * @see org.springframework.security.GrantedAuthority#getAuthority()
   */
  @Transient
  public String getAuthority() {
    return getName();
  }

  @Column(length = 20)
  public String getName() {
    return this.name;
  }

  @Column(length = 64)
  public String getDescription() {
    return this.description;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tbl_member_role", joinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) })
  public Set<Member> getMembers() {
    return this.members;
  }

  public void setMembers(Set<Member> members) {
    this.members = members;
  }

}
