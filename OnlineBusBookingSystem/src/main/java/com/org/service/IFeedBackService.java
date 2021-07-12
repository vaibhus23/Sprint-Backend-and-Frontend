package com.org.service;

import java.util.List;

import com.org.entities.BusOperator;
import com.org.entities.FeedBack;
import com.org.exceptions.InvalidFeedBackIdException;

public interface IFeedBackService {
	public FeedBack addFeedBack(FeedBack feedBack);

	public FeedBack updateFeedBack(FeedBack feedBack);

	public FeedBack getFeedBackDetailsById(int feedBackId) throws InvalidFeedBackIdException;

	public void deleteFeedBackById(int feedBackId);
	
	public List<FeedBack> getAllFeedBack();

}
