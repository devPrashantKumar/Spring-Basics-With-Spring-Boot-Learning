package com.prashant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Demo01 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello I am Different CommandLine Runner");
	}
}
