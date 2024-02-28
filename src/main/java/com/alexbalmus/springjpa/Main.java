package com.alexbalmus.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Import({
	AppConfiguration.class
})
@EnableTransactionManagement
@Transactional
public class Main implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args)
    {
	}
}
