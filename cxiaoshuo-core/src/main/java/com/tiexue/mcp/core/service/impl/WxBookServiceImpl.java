package com.tiexue.mcp.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tiexue.mcp.core.entity.WxBook;
import com.tiexue.mcp.core.mapper.WxBookMapper;
import com.tiexue.mcp.core.service.IWxBookService;

@Service("wxBookService")
public class WxBookServiceImpl implements IWxBookService {

	@Resource
	private WxBookMapper wxBookMapper;
	

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return wxBookMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(WxBook record) {
		return this.wxBookMapper.insert(record);
	}

	@Override
	public int insertSelective(WxBook record) {
		return this.wxBookMapper.insertSelective(record);
	}

	@Override
	public WxBook selectByPrimaryKey(Integer id) {
		return this.wxBookMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public WxBook selectByCollectionId(Integer collectionid) {
		return this.wxBookMapper.selectByCollectionId(collectionid);
	}
	
	@Override
	public List<WxBook> getList(String strWhere, String orderStr,Integer size) {
		return this.wxBookMapper.getList(strWhere, orderStr,size);
	}
	@Override
	public int updateByPrimaryKeySelective(WxBook record) {
		return this.wxBookMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(WxBook record) {
		return this.wxBookMapper.updateByPrimaryKey(record);
	}

	

}
