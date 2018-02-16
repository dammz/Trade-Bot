package com.hodl.broker.external;

public interface Exchange {

	public long buy(String name, long price, long limit);
	
	public long sell(String name, long price, long limit);
}
