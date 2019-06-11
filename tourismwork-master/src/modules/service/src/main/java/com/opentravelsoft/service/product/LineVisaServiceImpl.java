package com.opentravelsoft.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opentravelsoft.entity.Country;
import com.opentravelsoft.entity.LineVisa;
import com.opentravelsoft.providers.CountryDao;
import com.opentravelsoft.providers.product.LineVisaDao;

@Service("RouteVisaService")
public class LineVisaServiceImpl implements LineVisaService {
  
  @Autowired
  private LineVisaDao lineVisaDao;

  @Autowired
  private CountryDao countryDao;

  public List<LineVisa> getVisaList(String lineNo) {
    return lineVisaDao.getVisaList(lineNo);
  }

  public List<Country> getCountrys() {
    return countryDao.getCountry();
  }

  public List<LineVisa> getVisaByCountry(String country) {
    return lineVisaDao.getByCountry(country);
  }

  public int txSaveVisa(String lineNo, List<LineVisa> visaList) {
    return lineVisaDao.saveVisa(lineNo, visaList);
  }

}
