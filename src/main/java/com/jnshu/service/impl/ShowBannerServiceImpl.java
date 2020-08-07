package com.jnshu.service.impl;

import com.jnshu.dao.BannerMapper;
import com.jnshu.pojo.Banner;
import com.jnshu.service.ShowBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName ShowBannerService
 * @Description
 * @Author 韦延伦
 * @Date 2020/8/5 23:14
 * @Version 1.0
 */
@Service
public class ShowBannerServiceImpl implements ShowBannerService {
    @Autowired
    BannerMapper bannerMapper;

    @Override
    public List<Banner> selectBannerList() {
        return bannerMapper.selectBannerList();
    }
}
