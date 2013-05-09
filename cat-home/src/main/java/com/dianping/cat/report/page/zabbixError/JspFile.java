package com.dianping.cat.report.page.zabbixError;

public enum JspFile {
	VIEW("/jsp/report/zabbixError.jsp"),

	;

	private String m_path;

	private JspFile(String path) {
		m_path = path;
	}

	public String getPath() {
		return m_path;
	}
}
