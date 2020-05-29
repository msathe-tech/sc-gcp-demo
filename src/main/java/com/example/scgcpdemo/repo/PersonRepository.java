package com.example.scgcpdemo.repo;

import com.example.scgcpdemo.model.Person;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface PersonRepository extends DatastoreRepository<Person, Long> {
}
