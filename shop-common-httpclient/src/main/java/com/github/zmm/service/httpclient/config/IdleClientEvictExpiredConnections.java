package com.github.zmm.service.httpclient.config;

import org.apache.http.conn.HttpClientConnectionManager;

/**
 * @Name IdleClientEvictExpiredConnections  关闭无效的连接
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
public class IdleClientEvictExpiredConnections extends Thread{


	private final HttpClientConnectionManager connMgr;

	private volatile boolean shutdown;

	public IdleClientEvictExpiredConnections(HttpClientConnectionManager connMgr) {
		this.connMgr = connMgr;
		super.start();
	}

	@Override
	public void run() {
		try {
			while (!shutdown) {
				synchronized (this) {
					wait(5000);
					// 关闭失效的连接
					connMgr.closeExpiredConnections();
				}
			}
		} catch (InterruptedException ex) {
			// 结束
		}
	}

	public void shutdown() {
		shutdown = true;
		synchronized (this) {
			notifyAll();
		}
	}
}
