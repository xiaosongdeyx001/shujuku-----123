package com.opentravelsoft.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.opentravelsoft.common.EbizCommon;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_employee")
public class Employee implements UserDetails, java.io.Serializable {
  /** 用户ID */
  private Integer userId;
  private Group group;
  private String userCd;
  /** 密码 */
  private String passwd;
  /** CTI 号码 */
  private String ctiNo;
  private String userName;
  private String givenName;
  private String familyName;
  private Boolean isAdmin;
  private String tel;
  /** 传真 */
  private String fax;
  private String mobile;
  private String sex;
  private String cardId;
  private Integer age;
  private Integer discont;
  private String webKey;
  private String workFlg;
  /** 0-普通 2-销售 */
  private String workKey;
  private Boolean isActive;
  private String msn;
  private String skype;
  private String opIp;
  private Set<Plan> plans = new HashSet<Plan>(0);
  private Set<Role> memberships = new HashSet<Role>(0);
  private Set<Team> teamMemberships = new HashSet<Team>(0);

  /** 权限 */
  private Set<String> roles1;

  public Employee() {
    isActive = true;
    sex = "M";
    trips = new ArrayList<Tourist>();
    departmentName = "";
    roles1 = new TreeSet<String>();
    roleids = new HashSet<Integer>(0);
    teamList = new ArrayList<String>();
    teams = new HashSet<Integer>(0);
  }

  public Employee(Group group, String userCd, String passwd) {
    this.group = group;
    this.userCd = userCd;
    this.passwd = passwd;
  }

  public Employee(Integer userId) {
    this.userId = userId;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)
  @Column(name = "USER_ID", unique = true, nullable = false)
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "GROUP_ID", nullable = false)
  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  @Column(name = "USER_CD", nullable = false, length = 20)
  public String getUserCd() {
    return this.userCd;
  }

  public void setUserCd(String userCd) {
    this.userCd = userCd;
  }

  @Column(name = "PASSWD", nullable = false, length = 32)
  public String getPasswd() {
    return this.passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  @Column(name = "CTI_NO", length = 5)
  public String getCtiNo() {
    return this.ctiNo;
  }

  public void setCtiNo(String ctiNo) {
    this.ctiNo = ctiNo;
  }

  @Column(name = "USER_NAME", length = 20)
  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Column(name = "GIVEN_NAME", length = 20)
  public String getGivenName() {
    return this.givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  @Column(name = "FAMILY_NAME", length = 20)
  public String getFamilyName() {
    return this.familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @Column(name = "IS_ADMIN")
  public Boolean getIsAdmin() {
    return this.isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  @Column(name = "TEL", length = 30)
  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Column(name = "FAX", length = 30)
  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  @Column(name = "MOBILE", length = 20)
  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  @Column(name = "SEX", length = 1)
  public String getSex() {
    return this.sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Column(name = "CARD_ID", length = 20)
  public String getCardId() {
    return this.cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  @Column(name = "AGE")
  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Column(name = "DISCONT")
  public Integer getDiscont() {
    return this.discont;
  }

  public void setDiscont(Integer discont) {
    this.discont = discont;
  }

  @Column(name = "WEB_KEY", length = 10)
  public String getWebKey() {
    return this.webKey;
  }

  public void setWebKey(String webKey) {
    this.webKey = webKey;
  }

  @Column(name = "WORK_FLG", length = 2)
  public String getWorkFlg() {
    return this.workFlg;
  }

  public void setWorkFlg(String workFlg) {
    this.workFlg = workFlg;
  }

  @Column(name = "WORK_KEY", length = 1)
  public String getWorkKey() {
    return this.workKey;
  }

  public void setWorkKey(String workKey) {
    this.workKey = workKey;
  }

  @Column(name = "IS_ACTIVE")
  public Boolean getIsActive() {
    return this.isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Column(name = "MSN", length = 50)
  public String getMsn() {
    return this.msn;
  }

  public void setMsn(String msn) {
    this.msn = msn;
  }

  @Column(name = "SKYPE", length = 50)
  public String getSkype() {
    return this.skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  @Column(name = "OP_IP", length = 8)
  public String getOpIp() {
    return this.opIp;
  }

  public void setOpIp(String opIp) {
    this.opIp = opIp;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
  public Set<Plan> getPlans() {
    return this.plans;
  }

  public void setPlans(Set<Plan> plans) {
    this.plans = plans;
  }

  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "employee")
  @JoinTable(name = "TBL_TEAM_MEMBERSHIPS", joinColumns = { @JoinColumn(name = "USER_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "TEAM_ID", nullable = false, updatable = false) })
  public Set<Team> getTeamMemberships() {
    return teamMemberships;
  }

  public void setTeamMemberships(Set<Team> teamMemberships) {
    this.teamMemberships = teamMemberships;
  }

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tbl_membership", joinColumns = { @JoinColumn(name = "USER_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) })
  public Set<Role> getMemberships() {
    return memberships;
  }

  public void setMemberships(Set<Role> memberships) {
    this.memberships = memberships;
  }

  /** 用户Code */
  private String uid;

  private Collection<GrantedAuthority> authorities;

  private String email;

  /** 用户类型 */
  private String userType;

  /** 出生年月 */
  private Date birthday;

  /** 电话 */
  private String phone;
  /** 营业部 */
  private String salesCd;
  /** 部门名 */
  private String departmentName;

  /** 权限 */
  private Set<Integer> roleids;

  private Set<String> roles;

  /**
   * 所属目的地列表<BR>
   * 用于产品部门、和计调（OP）
   */
  private List<String> teamList;

  private Map<String, String> privilege = new TreeMap<String, String>();

  private Set<Line> lines = new HashSet<Line>(0);

  private Set<Integer> teams;

  private Date lastLogindate = null;

  private String confirmPassword;

  /** 地址 */
  private String address;

  /** 邮政编码 */
  private String postcode;

  /** 证件类型 */
  private String cardType;

  /** VIP客人 */
  private String vip;

  /** 等级 */
  private String grade;

  /** 旅游历史 */
  private List<Tourist> trips;

  private Date sendPwdDate;

  @Transient
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Transient
  public String getSalesCd() {
    return salesCd;
  }

  public void setSalesCd(String salesCd) {
    this.salesCd = salesCd;
  }

  @Transient
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Transient
  public Set<String> getRoles1() {
    return roles1;
  }

  public void setRoles1(Set<String> roles) {
    this.roles1 = roles;
  }

  /**
   * 超级用户
   */
  public boolean isSuperUser() {
    return memberships.contains(EbizCommon.ROLE_SUPERUSER);
  }

  public void setSuperUser(boolean hasRole) {
    memberships.remove(EbizCommon.ROLE_SUPERUSER);
    if (hasRole)
      roles1.add(EbizCommon.ROLE_SUPERUSER);
  }

  @Transient
  public Set<Integer> getRoleids() {
    return roleids;
  }

  public void setRoleids(Set<Integer> roleids) {
    this.roleids = roleids;
  }

  @Transient
  public List<String> getTeamList() {
    return teamList;
  }

  public void setTeamList(List<String> destinationList) {
    this.teamList = destinationList;
  }

  @Transient
  public Map<String, String> getPriv() {
    return privilege;
  }

  public void setPriv(Map<String, String> priv) {
    this.privilege = priv;
  }

  @Transient
  public Set<Line> getLines() {
    return lines;
  }

  public void setLines(Set<Line> lines) {
    this.lines = lines;
  }

  @Transient
  public Set<Integer> getTeams() {
    return teams;
  }

  public void setTeams(Set<Integer> teams) {
    this.teams = teams;
  }

  public void addTeamMembership(Team membership) {
    if (teamMemberships == null)
      teamMemberships = new HashSet<Team>();
    teamMemberships.add(membership);
  }

  @Transient
  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  @Transient
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Transient
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  @Transient
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  @Transient
  public List<Tourist> getTrips() {
    return trips;
  }

  public void setTrips(List<Tourist> trips) {
    this.trips = trips;
  }

  @Transient
  public String getVip() {
    return vip;
  }

  public void setVip(String vip) {
    this.vip = vip;
  }

  @Transient
  public Date getLastLogindate() {
    return lastLogindate;
  }

  public void setLastLogindate(Date lastLogindate) {
    this.lastLogindate = lastLogindate;
  }

  @Transient
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  @Transient
  public Date getSendPwdDate() {
    return sendPwdDate;
  }

  public void setSendPwdDate(Date sendPwdDate) {
    this.sendPwdDate = sendPwdDate;
  }

  @Transient
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  @Transient
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Transient
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Transient
  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public void addMembership(Role membership) {
    if (memberships == null)
      memberships = new HashSet<Role>();
    memberships.add(membership);
  }

  @Transient
  public Collection<GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(Collection<GrantedAuthority> has) {
    this.authorities = has;
  }

  @Transient
  public String getPassword() {
    return passwd;
  }

  @Transient
  public String getUsername() {
    return uid;
  }

  public boolean isAccountNonExpired() {
    return true;
  }

  public boolean isAccountNonLocked() {
    return true;
  }

  public boolean isCredentialsNonExpired() {
    return true;
  }

  public boolean isEnabled() {
    return isActive;
  }

  public void setRoles(Set<String> st) {
    this.roles = st;
  }

  @Transient
  public Set<String> getRoles() {
    return roles;
  }
}
