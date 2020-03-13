package com.github.zmm.service.httpclient.config;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Name HttpClient
 * @Author 900045
 * @Created by 2020/3/12 0012
 */
@Configuration
public class HttpClient {

	@Value("${http.maxTotal}")
	private Integer maxTotal;

	@Value("${http.defaultMaxPerRoute}")
	private Integer defaultMaxPerRoute;

	@Value("${http.connectTimeout}")
	private Integer connectTimeout;

	@Value("${http.connectionRequestTimeout}")
	private Integer connectionRequestTimeout;

	@Value("${http.socketTimeout}")
	private Integer socketTimeout;

	@Value("${http.staleConnectionCheckEnabled}")
	private boolean staleConnectionCheckEnabled;


	/**
	 * 连接管理器
	 * @return
	 */
	@Bean(name = "httpClientConnectionManager")
	public PoolingHttpClientConnectionManager getHttpClientConnectionManager(){
		PoolingHttpClientConnectionManager httpClientConnectionManager = new PoolingHttpClientConnectionManager();
		httpClientConnectionManager.setMaxTotal(maxTotal);
		httpClientConnectionManager.setDefaultMaxPerRoute(defaultMaxPerRoute);
		return httpClientConnectionManager;
	}

	/**
	 * httpclient对象构建器
	 * @param httpClientConnectionManager
	 * @return
	 */
	@Bean(name = "httpClientBuilder")
	public HttpClientBuilder getHttpClientBuilder(@Qualifier("httpClientConnectionManager")PoolingHttpClientConnectionManager httpClientConnectionManager){
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		httpClientBuilder.setConnectionManager(httpClientConnectionManager);
		return httpClientBuilder;
	}


	/**
	 * 定义Httpclient对象
	 * @param httpClientBuilder
	 * @return
	 */

	@Bean
	@Scope("prototype")
	public CloseableHttpClient getCloseableHttpClient(@Qualifier("httpClientBuilder") HttpClientBuilder httpClientBuilder){
		return httpClientBuilder.build();
	}

	/**
	 *请求配置参数
	 * @return
	 */

	@Bean(name = "builder")
	public RequestConfig.Builder getBuilder(){
		RequestConfig.Builder builder = RequestConfig.custom();
		return builder.setConnectTimeout(connectTimeout)
				.setConnectionRequestTimeout(connectionRequestTimeout)
				.setSocketTimeout(socketTimeout)
				.setStaleConnectionCheckEnabled(staleConnectionCheckEnabled);
	}

	/**
	 * 定义请求参数
	 * @param builder
	 * @return
	 */
	@Bean
	public RequestConfig getRequestConfig(@Qualifier("builder") RequestConfig.Builder builder){
		return builder.build();
	}

	/**
	 * 清除无效的连接
	 * @param httpClientConnectionManager
	 */
	@Bean
	public void closeIdleConnection(@Qualifier("httpClientConnectionManager")PoolingHttpClientConnectionManager httpClientConnectionManager) {
		new IdleClientEvictExpiredConnections(httpClientConnectionManager);
	}
}
