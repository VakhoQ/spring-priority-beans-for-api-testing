package com.vakhtang.controller;

import com.vakhtang.dao.DataDbRepository;
import com.vakhtang.service.DBServiceImpl;
import com.vakhtang.service.DataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DataApiTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	private DBServiceImpl repository;

	@Before
	public void executedBeforeEach() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void DbServiceTest() {
		Mockito.when(repository.getData(1l)).thenReturn("test data");
		assertThat(repository.getData(1l)).contains("test data");
	}

	@Test
	public void testDataService() {

		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class)).contains("returning fake data");
	}

}
