package com.writeme.write.dao.mapping;

import org.apache.log4j.Logger;

import com.writeme.write.dao.WritingToDBInterface;

public class WritingToDBImpl implements WritingToDBInterface {
	
	private Logger logger = Logger.getLogger(this.getClass());
	public WritingToDBImpl() {
		logger.debug("this is a constructor ");
	}
}
