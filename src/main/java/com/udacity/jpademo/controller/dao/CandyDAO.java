package com.udacity.jpademo.controller.dao;

import java.util.List;

public interface CandyDAO {
    List<CandyData> list();
    void addToDelivery(Long candyId, Long deliveryid);
    List<CandyData> findByDelivery(Long deliveryId);
}