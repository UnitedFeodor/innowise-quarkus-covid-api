package com.innowise.service;

import com.innowise.entity.Country;
import com.innowise.entity.MinMaxCaseData;

import java.util.List;

public interface CovidService {

    List<Country> getAllCountries();
    MinMaxCaseData getMinMaxCovidCaseDataForPeriod(String country, String from, String to);
}
