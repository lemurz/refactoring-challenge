package edu.iutcs.cr.repository;

import edu.iutcs.cr.persons.Buyer;

public interface BuyerRepository {
    Buyer findById(String id);
}
