package org.graylog.plugins.aggregates.report.schedule;

import java.util.List;

public interface ReportSchedule {
	
	public String getId();
	
	public String getName();

	public String getExpression();

	public String getTimespan();
	
	public boolean isDefaultSchedule();
	
	public Long getNextFireTime();

	public List<String> getReportReceivers();
}