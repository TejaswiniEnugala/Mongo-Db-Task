package com.stackroute.muzixapp.repository;

import com.stackroute.muzixapp.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collection;
import java.util.List;

//trackrepository interface creation
@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
//
//   @Query("SELECT u FROM Track u WHERE u.name = ?1")
//   public List<Track> findByName(@Param("name") String name);
}
