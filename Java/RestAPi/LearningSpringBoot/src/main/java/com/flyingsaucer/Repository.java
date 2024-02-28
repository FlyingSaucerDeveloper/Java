package com.flyingsaucer;

import org.springframework.data.repository.CrudRepository;


// The Integer is the data type of PRimary Key
public interface Repository extends CrudRepository<Students, Integer> {

}
