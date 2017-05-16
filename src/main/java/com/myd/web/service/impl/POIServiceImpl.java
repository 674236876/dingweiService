package com.myd.web.service.impl;

import com.myd.core.generic.GenericDao;
import com.myd.core.generic.GenericServiceImpl;
import com.myd.utils.GPSTransferUtil;
import com.myd.web.dao.PoiInfoMapper;
import com.myd.web.model.PoiInfo;
import com.myd.web.model.PoiInfoExample;
import com.myd.web.service.POIService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhugp on 2017/3/29.
 */
@Service
public class POIServiceImpl extends GenericServiceImpl<PoiInfo,String> implements POIService{

    @Resource
    private PoiInfoMapper poiInfoMapper;

    private GPSTransferUtil gpsTransferUtil = new GPSTransferUtil();

    @Override
    public GenericDao<PoiInfo, String> getDao() {
        return poiInfoMapper;
    }

    @Override
    public int insert(PoiInfo poiInfo) {
        return poiInfoMapper.insertSelective(poiInfo);
    }

    @Override
    public int update(PoiInfo poiInfo) {
        return poiInfoMapper.updateByPrimaryKeySelective(poiInfo);
    }

    @Override
    public int delete(String id) {
        return poiInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PoiInfo selectById(String id) {
        return poiInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public PoiInfo selectOne() {
        return null;
    }

    @Override
    public List<PoiInfo> selectList() {
        PoiInfoExample example = new PoiInfoExample();
        return poiInfoMapper.selectByExample(example);
    }

    @Override
    public void addPoi(String entId,String ptId, String lat, String lon, String label, String position, String content) {
        String baiduPos = gpsTransferUtil.getBaiduPosition(lon, lat);
        String googlePos = gpsTransferUtil.getGooglePosition(lon, lat);
        String[] baidu = baiduPos.split("_");
        String[] google = googlePos.split("_");
        PoiInfo info = new PoiInfo();
        info.setId(UUID.randomUUID().toString().replace("-", ""));
        info.setEntid(entId);
        info.setOptid(ptId);
        info.setLon(lon);
        info.setLat(lat);
        info.setLabel(label);
        info.setPosition(position);
        info.setDescription(content);
        info.setGooglelat(google[0]);
        info.setGooglelon(google[1]);
        info.setBaidulat(baidu[0]);
        info.setBaidulng(baidu[1]);
        this.insert(info);
    }
}
