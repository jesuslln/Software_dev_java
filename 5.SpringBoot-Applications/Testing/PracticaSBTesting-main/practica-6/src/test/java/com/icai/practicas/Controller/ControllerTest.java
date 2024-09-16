package com.icai.practicas.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ControllerTest {

    @Autowired
	private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;


    @Test
    public void Validar_Endpoint_Legacy(){

        //Given
        String address = "http://localhost:" + port + "/api/v1/process-step1-legacy";
        MultiValueMap<String, String> data1 = new MultiValueMap<String,String>() {

            @Override
            public void clear() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public boolean containsKey(Object arg0) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean containsValue(Object arg0) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public Set<Entry<String, List<String>>> entrySet() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public List<String> get(Object arg0) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public boolean isEmpty() {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public Set<String> keySet() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public List<String> put(String arg0, List<String> arg1) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends List<String>> arg0) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public List<String> remove(Object arg0) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public int size() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public Collection<List<String>> values() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void add(String arg0, String arg1) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void addAll(MultiValueMap<String, String> values) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void addAll(String key, List<? extends String> values) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public String getFirst(String arg0) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void set(String arg0, String arg1) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void setAll(Map<String, String> values) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public Map<String, String> toSingleValueMap() {
                // TODO Auto-generated method stub
                return null;
            }
      
        };

        data1.add("fullName", "Jesus Lopez Lopez - Neira");
        data1.add("dni", "43532235C");
        data1.add("telefono", "649 03 21 33");

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(data1, headers);

        //When
        ResponseEntity<String> response = this.restTemplate.postForEntity(address, request, String.class);


        // Then
        String expectedResult = "OK";
        Assertions.assertEquals(response, expectedResult);

        }
    

    @Test
    public void Validar_Endpoint_Step1(){
     
         //Given
         String address = "http://localhost:" + port + "/api/v1/process-step1";
         MultiValueMap<String, String> data1 = new MultiValueMap<String,String>() {
 
             @Override
             public void clear() {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public boolean containsKey(Object arg0) {
                 // TODO Auto-generated method stub
                 return false;
             }
 
             @Override
             public boolean containsValue(Object arg0) {
                 // TODO Auto-generated method stub
                 return false;
             }
 
             @Override
             public Set<Entry<String, List<String>>> entrySet() {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public List<String> get(Object arg0) {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public boolean isEmpty() {
                 // TODO Auto-generated method stub
                 return false;
             }
 
             @Override
             public Set<String> keySet() {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public List<String> put(String arg0, List<String> arg1) {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public void putAll(Map<? extends String, ? extends List<String>> arg0) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public List<String> remove(Object arg0) {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public int size() {
                 // TODO Auto-generated method stub
                 return 0;
             }
 
             @Override
             public Collection<List<String>> values() {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public void add(String arg0, String arg1) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public void addAll(MultiValueMap<String, String> values) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public void addAll(String key, List<? extends String> values) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public String getFirst(String arg0) {
                 // TODO Auto-generated method stub
                 return null;
             }
 
             @Override
             public void set(String arg0, String arg1) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public void setAll(Map<String, String> values) {
                 // TODO Auto-generated method stub
                 
             }
 
             @Override
             public Map<String, String> toSingleValueMap() {
                 // TODO Auto-generated method stub
                 return null;
             }
       
         };
         
         data1.add("fullName", "Jesus Lopez Lopez - Neira");
         data1.add("dni", "43532235C");
         data1.add("telefono", "649 03 21 33");
 

         HttpHeaders headers = new HttpHeaders();
         HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(data1, headers);
 
         //When
         ResponseEntity<String> response = this.restTemplate.postForEntity(address, request, String.class);
 
 
         // Then
         String expectedResult = "OK";
         Assertions.assertEquals(response, expectedResult);

    }

}
