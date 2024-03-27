package edu.iu.mralmalk.primesservice.service;

import edu.iu.mralmalk.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}