package com.goca.ecommercejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goca.ecommercejava.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
