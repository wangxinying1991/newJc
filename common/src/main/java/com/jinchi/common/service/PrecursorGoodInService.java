package com.jinchi.common.service;

import com.jinchi.common.dto.GoodInStatisticDetailDTO;
import com.jinchi.common.dto.GoodInStatisticTotalDTO;
import com.jinchi.common.dto.GoodInTableDTO;
import com.jinchi.common.dto.Page;

import java.util.List;
import java.util.Map;

public interface PrecursorGoodInService {

    List getAll(String startTime,String endTime,Integer periodId, Byte flag);

    Page page(String startTime,String endTime,Integer periodId,Integer page,Integer size);

    Object addComfirm(Integer periodId, Integer lineName, String startTime, String endTime);

    GoodInTableDTO getTables(Long id);

    List getLastPotency(Integer processId);

    String saveOrCommit(Long stasticId, Integer flag,GoodInTableDTO goodInTableDTO);

    Page statisticPage(String startTime,String endTime,Integer peroidId,Integer page,Integer size);

    GoodInStatisticDetailDTO statisticDetail(Long processDetailId);

    GoodInStatisticTotalDTO analysisProcess(Integer periodId, String startTime);

    GoodInStatisticTotalDTO analysisLine(Integer periodId,String startTime);

    List processCompare(Integer periodId,Integer processId,String startTime,String endTime);

    List lineCompare(Integer periodId,Integer lineId,String startTime,String endTime);

    Map getLineNameByPeriod(Integer periodId);

    List getStartTime(Integer periodId);

    void delete(Long stasticId);

    List getVolumeWeight(Integer processId);

    Page defaultPage();
}
