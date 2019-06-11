package com.opentravelsoft.action.manage.account;

import org.springframework.beans.factory.annotation.Autowired;

import com.opentravelsoft.action.ManageAction;
import com.opentravelsoft.service.account.MemberService;

/**
 * 会员列表
 * 
 * @author <a herf="mailto:zhangsitao@gmail.com">Steven Zhang</a>
 */
public class ListMemberAction extends ManageAction {

  private static final long serialVersionUID = -7138389244051722L;

  @Autowired
  private MemberService memberService;

}
