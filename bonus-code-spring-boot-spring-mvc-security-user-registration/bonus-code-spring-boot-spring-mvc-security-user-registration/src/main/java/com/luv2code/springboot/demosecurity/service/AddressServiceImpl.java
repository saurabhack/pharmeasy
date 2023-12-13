package com.luv2code.springboot.demosecurity.service;

import com.luv2code.springboot.demosecurity.dao.AddressReoisitory;
import com.luv2code.springboot.demosecurity.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressReoisitory addressReoisitory;

    @Autowired
    public AddressServiceImpl(AddressReoisitory theAddressRepository){
        addressReoisitory=theAddressRepository;
    }
    @Override
    public List<Address> findAll() {
        return addressReoisitory.findAll();
    }

    @Override
    public Address save(Address theAddress) {
        return addressReoisitory.save(theAddress);
    }
}
