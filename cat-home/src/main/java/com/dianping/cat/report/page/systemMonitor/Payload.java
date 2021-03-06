package com.dianping.cat.report.page.systemMonitor;

import com.dianping.cat.report.ReportPage;
import org.unidal.web.mvc.ActionContext;
import org.unidal.web.mvc.ActionPayload;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

public class Payload implements ActionPayload<ReportPage, Action> {
   private ReportPage m_page;

   @FieldMeta("op")
   private Action m_action;

   @FieldMeta("group")
   private String m_group;

   @FieldMeta("key")
   private String m_key;
   
   @FieldMeta("type")
   private String m_type;
   
   @FieldMeta("domain")
   private String m_domain;
   
   @FieldMeta("timestamp")
   private long m_timestamp;
   
   @FieldMeta("count")
   private int m_count;

   @FieldMeta("avg")
   private double m_avg;

   @FieldMeta("sum")
   private double m_sum;
   
   public String getDomain() {
   	return m_domain;
   }

	public void setDomain(String domain) {
   	m_domain = domain;
   }

	public String getGroup() {
   	return m_group;
   }

	public void setGroup(String group) {
   	m_group = group;
   }

	public int getCount() {
   	return m_count;
   }

	public void setCount(int count) {
   	m_count = count;
   }

	public double getAvg() {
   	return m_avg;
   }

	public void setAvg(double avg) {
   	m_avg = avg;
   }

	public double getSum() {
   	return m_sum;
   }

	public void setSum(double sum) {
   	m_sum = sum;
   }

	public String getKey() {
   	return m_key;
   }

	public void setKey(String key) {
   	m_key = key;
   }

	public String getType() {
   	return m_type;
   }

	public void setType(String type) {
   	m_type = type;
   }

	public void setAction(String action) {
      m_action = Action.getByName(action, Action.SYSTEM_API);
   }

   @Override
   public Action getAction() {
      return m_action;
   }

   @Override
   public ReportPage getPage() {
      return m_page;
   }

   @Override
   public void setPage(String page) {
      m_page = ReportPage.getByName(page, ReportPage.SYSTEMMONITOR);
   }

   public long getTimestamp() {
   	return m_timestamp;
   }

	public void setTimestamp(long timestamp) {
   	m_timestamp = timestamp;
   }

	@Override
   public void validate(ActionContext<?> ctx) {
      if (m_action == null) {
         m_action = Action.SYSTEM_API;
      }
   }
}
