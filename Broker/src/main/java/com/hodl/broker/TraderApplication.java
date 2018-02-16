package com.hodl.broker;

import java.util.Timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;

@SpringBootApplication
public class TraderApplication {

	public static void main(String[] args) throws BinanceApiException {
		SpringApplication.run(TraderApplication.class, args);
		
		/*BinanceApi api = new BinanceApi();
		System.out.println(api.ping());*/
		
		
	}
}
