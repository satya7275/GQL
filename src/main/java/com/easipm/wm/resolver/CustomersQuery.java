package com.easipm.wm.resolver;

import java.util.UUID;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 import java.security.KeyManagementException;
 import java.security.KeyStoreException;
import java.util.stream.Stream;
 import org.springframework.core.ParameterizedTypeReference;
 import org.springframework.core.env.Environment;
 import org.springframework.http.HttpEntity;
 import org.springframework.http.HttpHeaders;
 import org.springframework.http.HttpMethod;
 import org.springframework.http.ResponseEntity;
 import org.springframework.util.ResourceUtils;
 import org.springframework.web.client.RestTemplate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;

import com.easipm.wm.constant.ApplicationConstants;
import java.sql.SQLException;
 import graphql.schema.DataFetchingEnvironment;
import java.util.ArrayList;
 import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.easipm.wm.repo.CustomersRepo;
import com.easipm.wm.model.Customers;
import org.springframework.stereotype.Component;

@Component
public class CustomersQuery implements GraphQLQueryResolver{

@Autowired
CustomersRepo customersRepo;

	public List<Customers> CUSTOMERS( Integer customerId,DataFetchingEnvironment env) throws ClassNotFoundException, Exception {
 List<Customers> list = new ArrayList<>();
try {
	list = customersRepo.findByCustomerId(customerId).stream().collect(Collectors.toList());
	if (list.isEmpty()) { 
		 throw new Exception(ApplicationConstants.NO_RECORD_FOUND + ApplicationConstants.NOT_FOUND_ERROR_CODE);
		}

	 return list;
}catch (Exception e){
	 throw new Exception(e.getMessage()+ApplicationConstants.GENERAL_ERROR_CODE);
}
}
}
