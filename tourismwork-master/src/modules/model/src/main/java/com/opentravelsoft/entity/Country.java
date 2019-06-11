package com.opentravelsoft.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_country")
public class Country implements java.io.Serializable {

  private String countryId;
  private String name;
  private byte enabled;
  private Set<District> districts = new HashSet<District>(0);
  private Set<Sight> sights = new HashSet<Sight>(0);
  private Set<City> cities = new HashSet<City>(0);

  public Country() {
  }

  public Country(String countryId, String name, byte enabled) {
    this.countryId = countryId;
    this.name = name;
    this.enabled = enabled;
  }

  public Country(String country) {
    this.countryId = country;
  }

  @Id
  @Column(name = "COUNTRY_ID", unique = true, nullable = false, length = 2)
  public String getCountryId() {
    return this.countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  @Column(name = "NAME", nullable = false, length = 150)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "ENABLED", nullable = false)
  public byte getEnabled() {
    return this.enabled;
  }

  public void setEnabled(byte enabled) {
    this.enabled = enabled;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
  public Set<District> getDistricts() {
    return this.districts;
  }

  public void setDistricts(Set<District> districts) {
    this.districts = districts;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
  public Set<Sight> getSights() {
    return this.sights;
  }

  public void setSights(Set<Sight> sights) {
    this.sights = sights;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
  public Set<City> getCities() {
    return this.cities;
  }

  public void setCities(Set<City> cities) {
    this.cities = cities;
  }

}
