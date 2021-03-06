package com.st.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.st.moim.Moim;

@Repository("mmapper")
public interface MoimMapper {
	public void insert(Moim obj);
	public void delete(String userId);
	public void update(Moim obj);
	public ArrayList<Moim> selectCategory(String obj);
	public Moim select(String obj);
	public ArrayList<Moim> selectall();
}