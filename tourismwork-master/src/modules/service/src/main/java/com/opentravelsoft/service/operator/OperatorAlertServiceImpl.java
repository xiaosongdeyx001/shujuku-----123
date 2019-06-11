package com.opentravelsoft.service.operator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.common.TeamType;
import com.opentravelsoft.entity.Booking;
import com.opentravelsoft.entity.Team;
import com.opentravelsoft.entity.product.Remind;
import com.opentravelsoft.providers.BookingDao;
import com.opentravelsoft.providers.TeamDao;

@Service("OperatorAlertService")
public class OperatorAlertServiceImpl implements OperatorAlertService {

  @Autowired
  private BookingDao bookingDao;

  @Autowired
  private TeamDao teamDao;

  public List<Remind> roGetOperator(int uid) {
    List<Remind> reminds = new ArrayList<Remind>();
    List<Booking> bookings = bookingDao.getUnreadBookings(uid);
    for (Booking booking : bookings) {
      Remind remind = new Remind();
      remind.setCustomerName(booking.getCustomer().getName());
      remind.setBookingNo(booking.getBookingNo());
      remind.setOutDate(booking.getPlan().getOutDate());
      remind.setPax(booking.getPax());
      remind.setRouteNo(booking.getPlan().getLine().getLineNo());
      remind.setRouteName(booking.getPlan().getLine().getLineName());
      reminds.add(remind);
    }
    return reminds;
  }

  public List<Booking> roGetNewBookings(int uid) {
    return bookingDao.getUnreadBookings(uid);
  }

  public List<Team> roGetDepartments(int userId, TeamType type) {
    return teamDao.getTeam(userId, type);
  }

}
