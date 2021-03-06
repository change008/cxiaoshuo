package com.tiexue.mcp.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tiexue.mcp.core.entity.McpBook;
import com.tiexue.mcp.core.entity.McpChapter;
import com.tiexue.mcp.core.mapper.McpChapterMapper;
import com.tiexue.mcp.core.service.IMcpChapterService;

/**
 * 章节管理
 * @author 
 *
 */
@Service("McpChapterSer")
public class McpChapterServiceImpl implements IMcpChapterService {

	@Resource McpChapterMapper mcpChapterMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mcpChapterMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(McpChapter record) {
		return mcpChapterMapper.insert(record);
	}

	@Override
	public int insertSelective(McpChapter record) {
		return mcpChapterMapper.insertSelective(record);
	}

	@Override
	public McpChapter selectByPrimaryKey(Integer id) {
		return mcpChapterMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(McpChapter record) {
		return mcpChapterMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(McpChapter record) {
		return mcpChapterMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(McpChapter record) {
		return mcpChapterMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<McpChapter> selectList(Integer bookId,Integer pStart,Integer pSize) {
		return mcpChapterMapper.selectList(bookId,pStart,pSize);
	}
	
	public int getCount(String strWhere){
		return mcpChapterMapper.getCount(strWhere);
	}

	@Override
	public McpChapter selectByCpBId(Integer cpId, String cpBId, String cpCId) {
		return mcpChapterMapper.selectByCpBId(cpId, cpBId, cpCId);
	}

	@Override
	public McpChapter taskInsert(McpChapter record) {
		if(record==null)
			return null;
		int id= mcpChapterMapper.insert(record);
		if(id>0){
			record.setId(id);
		}
		else{
			record.setId(0);
		}
		return record;
	}

	@Override
	public int taskUpdate(McpChapter record) {
		if(record==null)
			return 0;
		int id= mcpChapterMapper.updateByPrimaryKey(record);
		return id;
	}


}